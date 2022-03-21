package com.example.banbanh;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LanguageAdapter extends BaseAdapter implements View.OnClickListener {
    private Context context;
    private int idLayout;
    private ArrayList<Language> listbanh;


    public LanguageAdapter(Context context, int idLayout, ArrayList<Language> listbanh) {
        this.context = context;
        this.idLayout = idLayout;
        this.listbanh = listbanh;
    }

    @Override
    public int getCount() {
        if (listbanh.size() != 0 && !listbanh.isEmpty()) {
            return listbanh.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);

        TextView tx1 = (TextView) convertView.findViewById(R.id.tx1);
        TextView tx2 = convertView.findViewById(R.id.tx2);
        TextView tx3 = convertView.findViewById(R.id.tx3);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo);

        tx1.setText(listbanh.get(position).getTenBanh());
        tx2.setText(listbanh.get(position).getTenCuahang());
        tx3.setText(listbanh.get(position).getGiabanh());
        imageView.setImageResource(listbanh.get(position).getImgBanh());


//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, language.getName(), Toast.LENGTH_LONG).show();
//                positionSelect = position;
//                notifyDataSetChanged();
//            }
//        });


        return convertView;
    }

    @Override
    public void onClick(View view) {

    }
}
