package com.example.physinf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;

public class kinFormulesAct extends AppCompatActivity {

    private View next;
    private View cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kin_formules);
        next = findViewById(R.id.nextbtn);
        cancel = findViewById(R.id.homebtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent omd = new Intent(kinFormulesAct.this, omdAct.class);
                startActivity(omd);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainAct = new Intent(kinFormulesAct.this, MainActivity.class);
                startActivity(mainAct);
            }
        });

    }
}