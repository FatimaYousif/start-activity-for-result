package com.example.start_activity_for_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText set;
    Button getMessage;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("first");

        set = (EditText) findViewById(R.id.set);
        getMessage = (Button) findViewById(R.id.getMessage);

        getMessage.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, second.class);
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String msg =
                        data.getStringExtra("msg");
                set.setText(msg);

            }
        }
    }
}