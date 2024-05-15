package com.trungdthe160011.helloworld.slot3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.trungdthe160011.helloworld.R;

public class Demo32MainActivity extends AppCompatActivity {
    //declare variable
    ListView listView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo32_main);
        //reference
        listView=findViewById(R.id.demo32Lv);
        getDataToListview();

    }
    private void getDataToListview(){
        //1. create data source
        String[] arr=new String[]{
               "Sneaker",
                "Addidas",
                "Nike",
                "Hermes",
                "Uniqlo"
        };
        //2.Using adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<>(Demo32MainActivity.this,
                android.R.layout.simple_list_item_1,arr);
        //3. attach adapter to Listview
        listView.setAdapter(adapter);
    }
}