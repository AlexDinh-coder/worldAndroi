package com.trungdthe160011.helloworld.slot4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trungdthe160011.helloworld.R;

import java.util.ArrayList;

public class Demo41MainActivity extends AppCompatActivity {
    ListView lv;
    Demo41Adapter adapter;
    ArrayList<T41Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo41_main);
        lv=findViewById(R.id.demo41Lv);
        //tao nguon du lieu
        ls.add(new T41Contact("Nguyen Van A", "20",R.drawable.apple));
        ls.add(new T41Contact("Tran Van B", "19",R.drawable.android));
        ls.add(new T41Contact("Vu Van C", "21",R.drawable.hancock));
        ls.add(new T41Contact("Nguyen Thi D", "22",R.drawable.facebook));
        ls.add(new T41Contact("Nguyen Van e", "25",R.drawable.dell));
        ls.add(new T41Contact("Nguyen Van f", "27",R.drawable.hp));
        //tao adapter
        adapter=new Demo41Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}