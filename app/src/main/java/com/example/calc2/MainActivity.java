package com.example.calc2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button soma;
    EditText numero1, numero2, resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soma = findViewById(R.id.soma);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);

      /*  soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        }); */

    }

    public void somar(View view){
        Float n1 = Float.parseFloat(numero1.getText().toString());
        Float n2 = Float.parseFloat(numero2.getText().toString());
        Float res = n1 + n2;
        resultado.setText(String.valueOf(res));


    }
}