package com.example.keh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Name1 = findViewById(R.id.name1);
        EditText Name2 = findViewById(R.id.name2);
        Button btnSwap = findViewById(R.id.btnSwap);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Name1.getText().toString();
                String n2 = Name2.getText().toString();

                Name1.setText(n2);
                Name2.setText(n1);
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = Name1.getText().toString();
                String n2 = Name2.getText().toString();

                String Message = "";
                if (n1.equals(n2)) {
                    Message = "SAME";
                }
                else{
                    Message = "NOT THE SAME";
                }
                Intent intent = new Intent(MainActivity.this, DispMsg.class);
                intent.putExtra("result", Message);
                startActivity(intent);
            }
        });
    };
}