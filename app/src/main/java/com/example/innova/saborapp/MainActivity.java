package com.example.innova.saborapp;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    BottomNavigationView navview;
    private String FIREBASE_URL = "https://saborapp-8e121.firebaseio.com/";
  //  private String FIREBASE_CHILD
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView app_name = (ImageView)findViewById(R.id.app_name);


        app_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), IniciosSesion.class);
                startActivity(intent);
            }
        });


    }
}
