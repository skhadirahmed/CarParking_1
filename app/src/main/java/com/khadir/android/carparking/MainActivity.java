package com.khadir.android.carparking;
//todo rename this package to you own package name

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Name;
    TextView Carnumber;
    TextView phone;
    ImageView submit;
    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);
        Name = findViewById(R.id.name);
        Carnumber = findViewById(R.id.carnumber);
        phone = findViewById(R.id.phone);

    }

    public void gotopark(View view) {
        if (Name.getText().toString().isEmpty() || Carnumber.getText().toString().isEmpty() || phone.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Please fill in all details", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, Parking.class);
            startActivity(intent);
        }
    }
}
