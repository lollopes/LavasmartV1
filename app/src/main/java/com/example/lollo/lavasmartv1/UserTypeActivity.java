package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTypeActivity extends AppCompatActivity {

    private Button homeUserButton;
    private Button commercialUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);

        homeUserButton = findViewById(R.id.HomeUser_Button);
        commercialUserButton = findViewById(R.id.CommercialUser_Button);


        homeUserButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserTypeActivity.this, AddMachineActivity.class));
            }
        });


        commercialUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserTypeActivity.this, CommercialUserTypeActivity.class));
            }
        });

    }
}
