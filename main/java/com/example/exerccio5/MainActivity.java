package com.example.exerccio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText salario;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salario=findViewById(R.id.salario);
        calcular=findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valor= Double.parseDouble(salario.getText().toString());
                double salario_base= valor+(valor*0.5)-(valor*0.7);
                Toast.makeText(MainActivity.this, "Salário"+ salario_base, Toast.LENGTH_SHORT).show();
            }
        });
    }
}