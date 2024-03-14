package com.example.afganistan;


import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViews);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();


        list.add(new DataFlags(R.drawable.af, R.string.afganistan, R.string.afganistanAFG));
        list.add(new DataFlags(R.drawable.am, R.string.armenia, R.string.armeniaISO));
        list.add(new DataFlags(R.drawable.il, R.string.izrail, R.string.izrailILS));
        list.add(new DataFlags(R.drawable.im, R.string.vatican, R.string.vaticanEUR));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);


    }
}