package com.example.roberri.rock_paper_scissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class FightArena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_arena);
        Bundle extras = getIntent().getExtras();
        TextView theBox = findViewById(R.id.Wellcome);

        String[] weaponChoice = getResources().getStringArray(R.array.Weapons);
        String playerChoice= (String) extras.get("playerC");

        Random num= new Random();
        int n = num.nextInt(weaponChoice.length);
        String computerChoice= weaponChoice[n];

        ImageView player = findViewById(R.id.PlayerC);
        ImageView computer = findViewById(R.id.ComputerC);
        player.setImageResource(R.drawable.fist);


        if(playerChoice.equals(computerChoice)){
            theBox.setText("It's a Tie!! :/");
        }
        else if ( playerChoice.equals("Rock")){

            if(computerChoice.equals("Scissors"))
                theBox.setText("WINNER WINNER CHICKEN DINNER!!");
            else
                theBox.setText("...YOU LOST BRO!!");
        }
        else if ( playerChoice.equals("Paper")){
            if(computerChoice.equals("Rock"))
                theBox.setText("WINNER WINNER CHICKEN DINNER!!");
            else
                theBox.setText("...YOU LOST BRO!!");
        }
        else if ( playerChoice.equals("Scissors")){
            if(computerChoice.equals("Paper"))
                theBox.setText("WINNER WINNER CHICKEN DINNER!!");
            else
                theBox.setText("...YOU LOST BRO!!");
        }

    }
}
