package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserType extends AppCompatActivity {

    private Button homeUserButton;
    private Button commercialUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertype);

        homeUserButton = findViewById(R.id.HomeUser_Button);
        commercialUserButton = findViewById(R.id.CommercialUser_Button);


        homeUserButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserType.this, AddNewMachine.class));
            }
        });


        commercialUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserType.this, CommercialType.class));
            }
        });

    }
}
