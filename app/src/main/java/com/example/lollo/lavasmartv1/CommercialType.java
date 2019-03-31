package com.example.lollo.lavasmartv1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommercialType extends AppCompatActivity
{
    Button tenant_button;
    Button manager_button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commercialtype);
        tenant_button = findViewById(R.id.Tenant_Button);
        tenant_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TenantFragment tenantFragment = new TenantFragment();
                tenantFragment.show(getSupportFragmentManager(),"Tenanat Fragment");


            }
        });





        manager_button = findViewById(R.id.Manager_Button);
        manager_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CommercialType.this,CreateLocation.class));
            }
        });

    }
}
