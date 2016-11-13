package com.example.admin.hw2additional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewForFirstActivity;
    Button goToSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textViewForFirstActivity = (TextView)  findViewById(R.id.TextViewForFirstActivity);
        goToSecondActivity = (Button) findViewById(R.id.GoToSecondActivity);

        goToSecondActivity.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data==null){
            return;
        }String yourText = data.getStringExtra("yourText");
        textViewForFirstActivity.setText("Your text: " + yourText);
    }
}
