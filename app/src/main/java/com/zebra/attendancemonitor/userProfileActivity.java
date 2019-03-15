package com.zebra.attendancemonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class userProfileActivity extends AppCompatActivity {

    private EditText etRollNum;
    private EditText etName;
    private Button btSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        etRollNum = findViewById(R.id.enterRoll);
        etName = findViewById(R.id.enterName);
        btSave = findViewById(R.id.submitRollName);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String rollnum = etRollNum.getText().toString();

                Log.i("User", "Name : " + name);

                if(name.equals("Death") && rollnum.equals("666"))
                {
                    Intent myIntent = new Intent(userProfileActivity.this , MainActivity.class);
                    userProfileActivity.this.startActivity(myIntent);
                }
            }
        });

    }
}
