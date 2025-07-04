package com.example.temperatureconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    TextView r1, r2;
    Button b1, b2;
    EditText inp1, inp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.resultOne);
        r2 = findViewById(R.id.resultTwo);
        b1 = findViewById(R.id.FirstButton);
        b2 = findViewById(R.id.SecondButton);
        inp1 = findViewById(R.id.CelsiusInput_CtoF);
        inp2 = findViewById(R.id.FInput_FtoC);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int FirstInput = Integer.parseInt(inp1.getText().toString());
                int F = (FirstInput * 9 / 5) + 32;
                r1.setText("Temperature from Celsius (°C) to Fahrenheit (°F) is " + F);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int SecondInput = Integer.parseInt(inp2.getText().toString());
                int C = (SecondInput - 32) * 5 / 9;
                r2.setText("Temperature from Fahrenheit (°F) to Celsius (°C) is " + C);
            }
        });

    }
}