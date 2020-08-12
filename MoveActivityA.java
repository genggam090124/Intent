package com.example.intentcopid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
mport androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivityA extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_activity);
        Button move = findViewById(R.id.btnmoveb);
        move.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnmoveb){
            Intent klise = new Intent(MoveActivityA.this, End.class);
            startActivity(klise);
        }
    }
}
