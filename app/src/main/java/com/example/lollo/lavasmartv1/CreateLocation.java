package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateLocation extends AppCompatActivity
{
    Button create_button;
    Button modify_button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createlocation);

        create_button = findViewById(R.id.Create_Button);

        create_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CreateLocation.this,LocationInfo.class));
            }
        });

        modify_button = findViewById(R.id.Modify_Button);
        modify_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CreateLocation.this,AddNewMachineManager.class));
            }
        });




    }
}
