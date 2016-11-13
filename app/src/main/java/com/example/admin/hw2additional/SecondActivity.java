package com.example.admin.hw2additional;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements View.OnClickListener{

    EditText editTextInTheSecondActivity;
    Button buttonFromSecondToFirstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        editTextInTheSecondActivity = (EditText) findViewById(R.id.EditTextInTheSecondActivity);
        buttonFromSecondToFirstActivity = (Button) findViewById(R.id.ButtonFromSecondToFirstActivity);
        buttonFromSecondToFirstActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("yourText", editTextInTheSecondActivity.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }


}
