 package com.example.physinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhysicalChannelConfig;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
    private Button physInfBtn;
    private Button physCalcBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        physInfBtn = findViewById(R.id.physInfBtn);
        physInfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InfoAct = new Intent(MainActivity.this, physInAct.class);
                startActivity(InfoAct);
            }
        });
    }
}