package com.example.todoist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        Button button= findViewById(R.id.button);
        button.setOnClickListener(view -> openMainActivity2());
    }
    public void openMainActivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}