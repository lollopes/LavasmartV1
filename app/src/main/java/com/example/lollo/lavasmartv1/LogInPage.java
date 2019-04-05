package com.example.lollo.lavasmartv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInPage extends AppCompatActivity {


    Button sign_in;
    Button sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);


        sign_in = findViewById(R.id.SignIn_Button);
        sign_up = findViewById(R.id.SignUp_Button);


        sign_in.setOnClickListener(new View.OnClickListener() {

            //Write an if statement if machine exists or not.
            //If machine exists, then go to MachineList Activity
            //If not, go to user type.
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInPage.this, MachineList.class));
            }
        });

        //If no user exists, sign up.
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInPage.this, UserType.class));
            }
        });
    }
}
