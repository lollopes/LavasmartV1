package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class OwnedLocations extends AppCompatActivity
{
    FloatingActionButton createLocationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ownedlocations);

        createLocationButton = findViewById(R.id.AddLocationManager_Button);

        createLocationButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(OwnedLocations.this,LocationInfo.class));

            }
        });


    }
}
