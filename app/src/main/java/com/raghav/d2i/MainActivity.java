package com.raghav.d2i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btn(View view){

        EditText dollarAmount=(EditText)findViewById(R.id.amount);
        String dollars=dollarAmount.getText().toString();
        Double doubleDollers=Double.parseDouble(dollars);
        Double doubleInr=82.79*doubleDollers;
        String toastText="= "+doubleInr.toString() + "₹";

        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }

    public void btn2(View view){

        EditText inramount=(EditText)findViewById(R.id.amount2);
        String inr=inramount.getText().toString();
        Double inr2=Double.parseDouble(inr);
        Double dollar=inr2/82.79;
        String toastText="= "+dollar.toString()+"$";

        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}