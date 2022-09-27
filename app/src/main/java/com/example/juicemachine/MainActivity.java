package com.example.juicemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner title;
EditText etName;
TextView tvDisplay;
ImageView ivGirl;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    title=findViewById(R.id.title);
    btnSubmit=findViewById(R.id.btnSubmit);
    etName=findViewById(R.id.etName);
    tvDisplay=findViewById(R.id.tvDisplay);
    ivGirl=findViewById(R.id.ivGirl);
    ivGirl.setVisibility(View.GONE);
    btnSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (etName.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Please Fill All Fields", Toast.LENGTH_SHORT).show();
            }
            else{
                String name=etName.getText().toString().trim();
                if (title.getSelectedItem().equals("Mr")){
                    ivGirl.setVisibility(View.VISIBLE);
                    ivGirl.setImageResource(R.drawable._7e0199dd2cbe80748206c1019246756);
                    tvDisplay.setText("Welcome! "+title.getSelectedItem() + " "+name);
                }
                else if (title.getSelectedItem().equals("Ms")){
                    ivGirl.setVisibility(View.VISIBLE);
                    tvDisplay.setText("Welcome! "+ title.getSelectedItem() + " "+name);
                }
            }
        }
    });
    }
}