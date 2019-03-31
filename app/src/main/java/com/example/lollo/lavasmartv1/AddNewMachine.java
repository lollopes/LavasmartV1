package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddNewMachine extends AppCompatActivity {


   private Button addNewMachine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addnewmachine);

        addNewMachine = findViewById(R.id.AddMachine_Button);

        addNewMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(AddNewMachine.this,MachineList.class));
            }
        });
    }


}
