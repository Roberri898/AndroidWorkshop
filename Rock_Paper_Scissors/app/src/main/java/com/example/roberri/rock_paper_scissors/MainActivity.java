package com.example.roberri.rock_paper_scissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner weapons= findViewById(R.id.Weapons);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Weapons,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        weapons.setAdapter(adapter);

        Button begin = (Button) findViewById(R.id.Begin);

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,FightArena.class);

                String pChoice = weapons.getSelectedItem().toString();
                i.putExtra("playerC", pChoice);
                startActivity(i);
            }
        });


    }
}
