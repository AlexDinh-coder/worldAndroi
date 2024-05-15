package com.trungdthe160011.helloworld.slot3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trungdthe160011.helloworld.R;

public class Demo34MainActivity extends AppCompatActivity {
    EditText txtA, txtB, txtC;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo34_main);
        txtA = findViewById(R.id.demo34TxtA);
        txtB = findViewById(R.id.demo34TxtB);
        txtC = findViewById(R.id.demo34TxtC);
        btn1 = findViewById(R.id.demo34Btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Demo34MainActivity.this, Demo34SecondMainActivity.class);
                intent.putExtra("a", txtA.getText().toString());
                intent.putExtra("b", txtB.getText().toString());
                intent.putExtra("c", txtC.getText().toString());
                startActivity(intent);
            }
        });


    }
}