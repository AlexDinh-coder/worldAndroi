package com.trungdthe160011.helloworld.slot4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.trungdthe160011.helloworld.R;

import java.util.ArrayList;

public class Demo41Adapter extends BaseAdapter {
    private ArrayList<T41Contact> ls;
    private Context context;

    public Demo41Adapter(ArrayList<T41Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    //lay ve so luong item
    @Override
    public int getCount() {
        return ls.size();
    }
    //;ay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //TAO VIEW
    //Gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //b1: tao view
        ViewAX vax;
        //Neu chua co view thi tao view moi
        if(convertView==null)
        {
            vax=new ViewAX();//tao view moi
            //anh xa layout
            convertView= LayoutInflater.from(context).inflate(R.layout.demo41_listview_item, null);
            //anh xa tung thanh phan trong layout
            vax.img_hinh=convertView.findViewById(R.id.demo41ItemHinh);
            vax.tv_ten=convertView.findViewById(R.id.demo41Ten);
            vax.tv_tuoi=convertView.findViewById(R.id.demo41Tuoi);
            //tao template de lan sau su dung
            convertView.setTag(vax);
        }
        //Neu co view -> su dung lai view cu
        else
        {
            vax=(ViewAX) convertView.getTag();//lay view cu
        }
        //gan du lieu cho layout
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;//tra ve ket qua
    }
    //dinh nghia view
    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten,tv_tuoi;
    }
}
