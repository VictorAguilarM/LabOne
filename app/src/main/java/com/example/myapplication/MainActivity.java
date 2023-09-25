package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont=1;
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

    public void changeColor(View view){
        TextView text = (TextView) findViewById(R.id.textView);
        switch (cont){
            case 1:
                text.setTextColor(Color.RED);
                cont++;
                break;

            case 2:
                text.setTextColor(Color.BLUE);
                cont++;
                break;

            case 3:
                text.setTextColor(Color.GREEN);
                cont++;
                break;

            case 4:
                text.setTextColor(Color.MAGENTA);
                cont++;
                break;

            case 5:
                text.setTextColor(Color.BLACK);
                cont=1;
                break;
        }
    }
}