package com.example.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantidade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void diminui(View view){
        quantidade = quantidade - 1;
        TextView quanti = findViewById(R.id.quanti);
        quanti.setText("" + quantidade);
    }

    public void aumenta(View view) {
        quantidade = quantidade + 1;
        TextView quanti = findViewById(R.id.quanti);
        quanti.setText("" + quantidade);
    }
}
