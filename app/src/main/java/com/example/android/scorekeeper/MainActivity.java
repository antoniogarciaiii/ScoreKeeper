package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    //Red team: methods for score adding
    //Red team: add KO, display on score, and individual stat count
    public void addRedKO(View v) {
        redScore += 1;
        redKOs += 1;
        displayForRedTeam(redScore);
        displayForRedKos(redKOs);
    }

    public void subtractRedKO(View v) {
        redScore -= 1;
        redKOs -= 1;
        displayForRedTeam(redScore);
        displayForRedKos(redKOs);
    }

    public void addRedKOd(View v) {
        redScore -= 1;
        redKOd += 1;
        displayForRedTeam(redScore);
        displayForRedKod(redKOd);
    }

    public void subtractRedKod(View v) {
        redScore += 1;
        redKOd -= 1;
        displayForRedTeam(redScore);
        displayForRedKod(redKOd);
    }

    public void addRedSD(View v) {
        redScore -= 1;
        redSD += 1;
        displayForRedTeam(redScore);
        displayForRedSD(redSD);
    }

    public void subtractRedSD(View v) {
        redScore += 1;
        redKOd -= 1;
        displayForRedTeam(redScore);
        displayForRedSD(redSD);
    }


    //Displays the given score for Team A.
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
}