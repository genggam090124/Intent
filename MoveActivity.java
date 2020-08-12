package com.example.intentcopid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        Button btnMo = findViewById(R.id.btnmovea);
        btnMo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnmovea){
            Intent newIn = new Intent(MoveActivity.this, MoveActivityA.class);
            startActivity(newIn);
        }
    }
}
