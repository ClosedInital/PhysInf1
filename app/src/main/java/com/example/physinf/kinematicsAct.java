package com.example.physinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kinematicsAct extends AppCompatActivity {
    private Button formulesActBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinematics);
        formulesActBtn = findViewById(R.id.formulesActBtn);
        formulesActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InfoAct = new Intent(kinematicsAct.this, kinFormulesAct.class);
                startActivity(InfoAct);
            }
        });
    }
}