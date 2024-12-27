package com.example.karimova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void calculateCircleProperties(View v) {
        EditText inputFieldA = findViewById(R.id.inputFieldA);
        EditText inputFieldB = findViewById(R.id.inputFieldB);
        EditText inputFieldC = findViewById(R.id.inputFieldC);


        String inputA = inputFieldA.getText().toString();
        String inputB = inputFieldB.getText().toString();
        String inputC = inputFieldC.getText().toString();


        if (inputA.isEmpty() || inputB.isEmpty() || inputC.isEmpty()) {

        }



            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double c = Double.parseDouble(inputC);


            double AC = Math.abs(a - c);
            double BC = Math.abs(b - c);


            double sum = AC + BC;


            TextView resultField = findViewById(R.id.resultField);
            resultField.setText("Сумма длин отрезков AC и BC = " + sum);


    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
}
