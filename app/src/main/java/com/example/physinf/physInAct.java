package com.example.physinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class physInAct extends AppCompatActivity {
    private Button kinematics;
    private Button statics;
    private Button dynamics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phys_in);
        kinematics = findViewById(R.id.kinematics);
        statics = findViewById(R.id.statics);
        dynamics = findViewById(R.id.dynamics);

        kinematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kinActInt = new Intent(physInAct.this, kinematicsAct.class);
                startActivity(kinActInt);
            }
        }

        );

        dynamics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dynActInt = new Intent(physInAct.this, dynamicsAct.class);
                startActivity(dynActInt);
            }
        });
    }
}