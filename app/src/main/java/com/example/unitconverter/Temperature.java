package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Temperature extends AppCompatActivity {

    Spinner sp_from, sp_to;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        sp_from = findViewById(R.id.sp_from);
        sp_to = findViewById(R.id.sp_to);
        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.b1);



        String[] from = {"Celsius", "Fahrenheit", "Kelvin"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp_from.setAdapter(ad);

        String[] to = {"Fahrenheit", "Celsius", "Kelvin"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp_to.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount =  Double.parseDouble(e1.getText().toString());


                if(sp_from.getSelectedItem().toString() == "Celsius"  && sp_to.getSelectedItem().toString() == "Fahrenheit")
                {
                    tot = (amount * 9/5) + 32;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "Celsius"  && sp_to.getSelectedItem().toString() == "Kelvin")
                {
                    tot = amount + 273.15;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "Fahrenheit"  && sp_to.getSelectedItem().toString() == "Celsius")
                {
                    tot = (amount - 32 ) * (5/9);
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "Fahrenheit"  && sp_to.getSelectedItem().toString() == "Kelvin")
                {
                    tot = ((amount -32) * 5/9 + 273.15);
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "Kelvin"  && sp_to.getSelectedItem().toString() == "Celsius")
                {
                    tot = amount - 273.15;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "Kelvin"  && sp_to.getSelectedItem().toString() == "Fahrenheit")
                {
                    tot = ((amount - 273.15) * 9/5 +32);

                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}