package com.example.assignment_sprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[][] buttons = new Button[3][3];// 3*3 filed we are playing.

    private boolean player1Turn = true; //As soon as we play game, the player 1 will start.

    private int roundCount; //estimate our round count

    private int player1Points;
    private int player2Points;

    private TextView textViewPlayer1;
    private TextView textViewPlayer2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
