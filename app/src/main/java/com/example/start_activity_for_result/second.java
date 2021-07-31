package com.example.start_activity_for_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends AppCompatActivity {

    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("second");

        input=(EditText)findViewById(R.id.input);
        submit=(Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inp=input.getText().toString();

                Intent i = new Intent();
                i.putExtra("msg", inp);
                setResult(RESULT_OK,i);
                finish();
            }
        });


    }
}