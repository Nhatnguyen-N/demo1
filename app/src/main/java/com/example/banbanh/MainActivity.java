package com.example.banbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Language> listLanguage;
    LanguageAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idlistview);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(R.drawable.donut_yellow_1,"Donut Vang","Adon","$10"));
        listLanguage.add(new Language(R.drawable.donut_yellow_1,"Donut Vang","Adon","$10"));
        listLanguage.add(new Language(R.drawable.donut_yellow_1,"Donut Vang","Adon","$10"));

         adt = new LanguageAdapter(this, R.layout.item_custom, listLanguage);
        listView.setAdapter(adt);
    }
}