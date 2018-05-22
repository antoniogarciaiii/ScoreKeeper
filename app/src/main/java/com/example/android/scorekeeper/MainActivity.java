package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //base code is derived from the Court Counter App we built in
    //"Grow With Google Challenge Scholarship: Android Basics," Lesson 8
    //declaring variables. being verbose in my code because
    //I'm a student and I want to make my intentions and logic clear to the instructor
    int redScore = 0;
    int redKOs = 0;
    int redKOd = 0;
    int redSD = 0;

    int blueScore = 0;
    int blueKOs = 0;
    int blueKOd = 0;
    int blueSD = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //RED TEAM BUTTON FUNCTIONS
        //add KO, display on score, and individual stat count
        public void addRedKO(View v) {
            redScore += 1;
            redKOs += 1;
            displayForRedTeam(redScore);
            displayForRedKos(redKOs);
        }
        //subtract KO, display on score, and individual stat count
        public void subtractRedKO(View v) {
            redScore -= 1;
            redKOs -= 1;
            displayForRedTeam(redScore);
            displayForRedKos(redKOs);
        }
        //add KOd, display on score, and individual stat count
        public void addRedKOd(View v) {
            redScore -= 1;
            redKOd += 1;
            displayForRedTeam(redScore);
            displayForRedKod(redKOd);
        }
        //subtract KOd, display on score, and individual stat count
        public void subtractRedKod(View v) {
            redScore += 1;
            redKOd -= 1;
            displayForRedTeam(redScore);
            displayForRedKod(redKOd);
        }

        //add SD, display on score, and individual stat count
        public void addRedSD(View v) {
            redScore -= 1;
            redSD += 1;
            displayForRedTeam(redScore);
            displayForRedSD(redSD);
        }

        //subtract SD, display on score, and individual stat count
        public void subtractRedSD(View v) {
            redScore += 1;
            redSD -= 1;
            displayForRedTeam(redScore);
            displayForRedSD(redSD);
        }

    //BLUE TEAM BUTTON FUNCTIONS
        //add KO, display on score, and individual stat count
        public void addBlueKO(View v) {
            blueScore += 1;
            blueKOs += 1;
            displayForBlueTeam(blueScore);
            displayForBlueKos(blueKOs);
        }
        //subtract KO, display on score, and individual stat count
        public void subtractBlueKO(View v) {
            blueScore -= 1;
            blueKOs -= 1;
            displayForBlueTeam(blueScore);
            displayForBlueKos(blueKOs);
        }
        //add KOd, display on score, and individual stat count
        public void addBlueKOd(View v) {
            blueScore -= 1;
            blueKOd += 1;
            displayForBlueTeam(blueScore);
            displayForBlueKod(blueKOd);
        }
        //subtract KOd, display on score, and individual stat count
        public void subtractBlueKod(View v) {
            blueScore += 1;
            blueKOd -= 1;
            displayForBlueTeam(blueScore);
            displayForBlueKod(blueKOd);
        }

        //add SD, display on score, and individual stat count
        public void addBlueSD(View v) {
            blueScore -= 1;
            blueSD += 1;
            displayForBlueTeam(blueScore);
            displayForBlueSD(blueSD);
        }

    //subtract SD, display on score, and individual stat count
    public void subtractBlueSD(View v) {
        blueScore += 1;
        blueSD -= 1;
        displayForBlueTeam(blueScore);
        displayForBlueSD(blueSD);
    }

    //RED TEAM SCORE DISPLAY FUNCTIONS
        //Displays the given score for red team.
        public void displayForRedTeam(int score) {
            TextView scoreView = (TextView) findViewById(R.id.red_score);
            scoreView.setText(String.valueOf(score));
        }

        //displays KO total stat
        //KO means times the player eliminates (knocks out) the opponent
        public void displayForRedKos(int score) {
            TextView scoreView = (TextView) findViewById(R.id.redKOCount);
            scoreView.setText(String.valueOf(score));
        }

        // displays KOd total stat
        //KOd means times the player gets eliminated (knocked out) by the opponent
        public void displayForRedKod(int score) {
            TextView scoreView = (TextView) findViewById(R.id.RedKOdCount);
            scoreView.setText(String.valueOf(score));
        }

        // displays SD total stat
        //SD means times the player eliminates self (self destructs)
        public void displayForRedSD(int score) {
            TextView scoreView = (TextView) findViewById(R.id.RedSDCount);
            scoreView.setText(String.valueOf(score));
        }

    //BLUE TEAM SCORE DISPLAY FUNCTIONS
        //Displays the given score for blue team.
        public void displayForBlueTeam(int score) {
            TextView scoreView = (TextView) findViewById(R.id.blue_score);
            scoreView.setText(String.valueOf(score));
        }

        //displays KO total stat
        //KO means times the player eliminates (knocks out) the opponent
        public void displayForBlueKos(int score) {
            TextView scoreView = (TextView) findViewById(R.id.BlueKOCount);
            scoreView.setText(String.valueOf(score));
        }

        // displays KOd total stat
        //KOd means times the player gets eliminated (knocked out) by the opponent
        public void displayForBlueKod(int score) {
            TextView scoreView = (TextView) findViewById(R.id.BlueKOdCount);
            scoreView.setText(String.valueOf(score));
        }

        // displays SD total stat
        //SD means times the player eliminates self (self destructs)
        public void displayForBlueSD(int score) {
            TextView scoreView = (TextView) findViewById(R.id.BlueSDCount);
            scoreView.setText(String.valueOf(score));
        }

    // Reset all scores and stats
    public void resetScores (View v) {
        redScore = 0;   displayForRedTeam(redScore);
        redKOs = 0;     displayForRedKos(redKOs);
        redKOd = 0;     displayForRedKod(redKOd);
        redSD = 0;      displayForRedSD(redSD);

        blueScore = 0;  displayForBlueTeam(blueScore);
        blueKOs = 0;    displayForBlueKos(blueKOs);
        blueKOd = 0;    displayForBlueKod(blueKOd);
        blueSD = 0;     displayForBlueSD(blueSD);
        }
}