package com.example.lollo.lavasmartv1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MachineListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_list);
        ListView listview = findViewById(R.id.Machine_ListView);

        //Create Array List of Machine
        ArrayList<Machine> machinelist = new ArrayList<>();
        //Add dummy machine
        machinelist.add(new Machine("Lorenzo Machine", "summerhill_home", "ON"));
        machinelist.add(new Machine("Mario Machine", "summerhill_building", "OFF"));

        MachineListViewCustomAdapter machineListViewCustomAdapter = new MachineListViewCustomAdapter(this, machinelist);
        listview.setAdapter(machineListViewCustomAdapter);

    }

}
