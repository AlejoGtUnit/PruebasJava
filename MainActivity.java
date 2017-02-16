package com.example.alejo.sumadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSumar = (Button)findViewById(R.id.buttonSumar);
        btnSumar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView numero1 = (TextView)findViewById(R.id.editTextNumero1);
                TextView numero2 = (TextView)findViewById(R.id.editTextNumero2);

                if (!TextUtils.isEmpty(numero1.getText()) && !TextUtils.isEmpty(numero2.getText())){
                    double suma = Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero2.getText().toString());
                    String resultado = String.format("Resultado: %1$.2f", suma);
                    Toast toast = Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Debe ingresar los 2 numeros", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}
