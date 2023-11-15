package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Currency extends AppCompatActivity {

    Spinner sp_from, sp_to;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        sp_from = findViewById(R.id.sp_from);
        sp_to = findViewById(R.id.sp_to);
        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.b1);


        String[] from = {"USD", "INR", "EURO"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp_from.setAdapter(ad);

        String[] to = {"INR", "USD", "EURO"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp_to.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount =  Double.parseDouble(e1.getText().toString());


                if(sp_from.getSelectedItem().toString() == "USD"  && sp_to.getSelectedItem().toString() == "INR")
                {
                    tot = amount * 82.96;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "USD"  && sp_to.getSelectedItem().toString() == "EURO")
                {
                    tot = amount * 0.91;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "INR"  && sp_to.getSelectedItem().toString() == "USD")
                {
                    tot = amount * 0.012;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "INR"  && sp_to.getSelectedItem().toString() == "EURO")
                {
                    tot = amount * 0.011;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "EURO"  && sp_to.getSelectedItem().toString() == "USD")
                {
                    tot = amount * 1.10;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }

                else if(sp_from.getSelectedItem().toString() == "EURO"  && sp_to.getSelectedItem().toString() == "INR")
                {
                    tot = amount * 90.96;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
