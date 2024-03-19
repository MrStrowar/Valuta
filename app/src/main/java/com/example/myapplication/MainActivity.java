package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) this.findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.russianStolish));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR, R.string.africanStolish));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD, R.string.singapurStolish));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.turkishStolish));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}