package com.trungdthe160011.helloworld.slot3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trungdthe160011.helloworld.R;

public class Demo34SecondMainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo34_second_main);
        tv1=findViewById(R.id.demo34Tv1);
        Intent intent = getIntent();
        int a = Integer.parseInt(intent.getExtras().getString("a"));
        int b= Integer.parseInt(intent.getExtras().getString("b"));
        int c = Integer.parseInt(intent.getExtras().getString("c"));
        float delta = b*b-4*a*c;
        if(delta<0) {
            tv1.setText("PT vo nghiem");
        }
        else if(delta ==0)
        {
            tv1.setText("PT co nghiem kep x = "+ (-b)/(2*a));
        }
        else {
            float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
            tv1.setText("PT co 2 nghiem x1= "+x1+" va x2="+x2);
        }
    }
}



