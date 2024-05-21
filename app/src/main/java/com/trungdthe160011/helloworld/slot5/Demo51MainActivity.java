package com.trungdthe160011.helloworld.slot5;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.trungdthe160011.helloworld.R;

import java.util.ArrayList;
import java.util.List;

public class Demo51MainActivity extends AppCompatActivity {
    ListView listView;
    Demo51Adapter adapter;
    List<Demo51Product> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo51_main);
        listView=findViewById(R.id.demo51Listview1);
       // Demo51SqliteHelper helper = new Demo51SqliteHelper(this);
       // SQLiteDatabase db = helper.getReadableDatabase();
        Demo51ProductDAO dao=new Demo51ProductDAO(this);
       // Demo51Product p =new Demo51Product("1", "San pham 1",123,1);
//        int kq=dao.insertProduct(p);
        list=dao.getAll();
        adapter = new Demo51Adapter(list,this);
        listView.setAdapter(adapter);
       // int kq=dao.insertProduct(p);

    }
}