package com.example.ticparte1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.nom);

    }
    //Boton siguiente
    public void siguiente(View view) {
        Intent i = new Intent(this, MainActivity2.class);

        i.putExtra( "dato", et1.getText().toString());
        startActivity(i);
    }
}







