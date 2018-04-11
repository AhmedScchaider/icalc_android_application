package com.iconvert.schhaiderahmed.iconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMoneyConvert;

    Button btnPhysicUnits;

    Button btnLanguageTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoneyConvert=(Button) findViewById(R.id.btn_money_convert);
        btnPhysicUnits=(Button) findViewById(R.id.btn_physic_units);
        btnLanguageTranslate=(Button) findViewById(R.id.btn_language_translate);


        btnMoneyConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,MoneyConvert.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });
        btnPhysicUnits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,PhysicsUnits.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });
        btnLanguageTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,Language.class);
                MainActivity.this.startActivity(mainIntent);
            }
        });

    }
}
