package com.example.listview_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countries = new String[]{"Sri Lanka", "India", "United States", "Canada", "United Kingdom",
                "Germany", "France", "Spain", "Italy", "Australia", "Japan", "China",
                "South Korea", "Brazil", "Argentina", "Mexico", "Russia", "Egypt",
                "South Africa", "Nigeria", "Kenya", "Ghana", "Saudi Arabia",
                "United Arab Emirates", "Qatar", "Turkey", "Iran", "Iraq", "Pakistan",
                "Afghanistan", "Bangladesh", "Indonesia", "Thailand", "Vietnam",
                "Malaysia", "Philippines", "Singapore", "New Zealand", "Sweden",
                "Norway", "Denmark", "Netherlands", "Belgium", "Switzerland",
                "Austria", "Greece", "Poland", "Czech Republic", "Hungary"};

        ListAdapter listAdapter= new ArrayAdapter<String>(this,R.layout.list_item,countries);

        listView=findViewById(R.id.list_view);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String country= String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();

            }
        });
    }
}