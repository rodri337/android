package com.example.rjuan.simplemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /*
    @declare the list of items
    food items
     */
    String [] foodList = {"Noodles", "Salad", "Entres", "Drinks"};

    //declare the list view to get the list gui
    //set the adapter
    ListView myListView;
    ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //set up the listview
        myListView = (ListView)findViewById(R.id.foodList);
        //set the adapter
        listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, foodList );

        //link the adapter to the listview
        myListView.setAdapter(listAdapter);
        //check when one item is cliecked
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}
