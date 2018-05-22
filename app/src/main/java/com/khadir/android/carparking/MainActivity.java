package com.khadir.android.carparking;
//todo rename this package to you own package name

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
    TextView Time;
    TextView phone;
    ImageView submit;
    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);
        Name = (TextView) findViewById(R.id.Name);
        Carnumber = (TextView) findViewById(R.id.Carnumber);
        Time = (TextView) findViewById(R.id.Time);
        phone = (TextView) findViewById(R.id.phone);
        submit = (ImageView) findViewById(R.id.submit);


        submit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "replace with your action", Toast.LENGTH_SHORT).show();

                        if (Name.getText().toString().isEmpty() || Carnumber.getText().toString().isEmpty() || Time.getText().toString().isEmpty() || phone.getText().toString().isEmpty()) {

                        }


                    }
                }
        );
    }
}
