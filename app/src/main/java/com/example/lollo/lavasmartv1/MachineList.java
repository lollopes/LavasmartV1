package com.example.lollo.lavasmartv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MachineList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.machinelist);
        ListView listview = findViewById(R.id.Machine_ListView);

        //Create Array List of Machine
        ArrayList<Machine> machinelist = new ArrayList<>();
        //Add dummy machine
        machinelist.add(new Machine("Lorenzo Machine", "summerhill_home", "ON"));
        machinelist.add(new Machine("Mario Machine", "summerhill_building", "OFF"));

        ListViewCustomAdapter listViewCustomAdapter = new ListViewCustomAdapter(this, machinelist);
        listview.setAdapter(listViewCustomAdapter);

    }

}
