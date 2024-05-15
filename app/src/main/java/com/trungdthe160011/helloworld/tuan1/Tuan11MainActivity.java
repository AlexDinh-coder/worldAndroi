package com.trungdthe160011.helloworld.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trungdthe160011.helloworld.R;

public class Tuan11MainActivity extends AppCompatActivity {
    //khai bao cac control
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan11_main);
        //anh xa cac control
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        btn1=findViewById(R.id.demo11tbn1);
        tv1=findViewById(R.id.demo11tv1);

        //xu li su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
    }
    //Dinh nghia ham tinh tong
    private void tinhTong() {
        //Lay du lieu nhap vao tu EditText1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);//Chuyen tu lieu sang so
        //;au du lieu nhap vao tu EditText2
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //tinh tong
        float tong=so1+so2;
        //In ket qua ra man hinh
        tv1.setText(String.valueOf(tong));
    }
}