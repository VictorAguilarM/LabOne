package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        if (text.getText() != "New Text") {
            text.setText("New Text");
            Toast.makeText(this, "Succes", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "The text has been changed", Toast.LENGTH_LONG).show();
        }
    }
}