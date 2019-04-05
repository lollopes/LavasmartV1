package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AddMachineActivity extends AppCompatActivity {


    private Button addNewMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_machine);

        addNewMachine = findViewById(R.id.AddMachine_Button);

        addNewMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddMachineActivity.this, MachineListActivity.class));
            }
        });
    }


}
