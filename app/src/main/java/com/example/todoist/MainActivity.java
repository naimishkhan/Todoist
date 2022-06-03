package com.example.todoist;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1= findViewById(R.id.button1);
        button1.setOnClickListener(view -> openscreen2());


    }
    public void openscreen2(){
        Intent intent=new Intent(this,screen2.class);
        startActivity(intent);
    }

}