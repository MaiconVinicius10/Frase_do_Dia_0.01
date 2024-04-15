package com.maiconviniciusevitor.frasedodia001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //criando metodo gerarFrase
    public void gerarFrase(View view){
        // criando variavel frase
        resultado=findViewById(R.id.text_resultado);
        //setando frase
        String [] frase={"  Oi bom dia ",
                "Acorda vamos matar mais um leão",
                "    Vamos ganhar"
                        };
        //criando meus numeros aleatório
        int aleatorio=new Random().nextInt(3);

        resultado.setText(" "+frase[aleatorio]);


    }

    public void gerarFraseAleatoria(View view){
        resultado= findViewById(R.id.text_resultado);

        String frase[]={"olá","pedro","maicon","camila"};

        String resultado1="";

        for(int i=0; i<=3; i++){

            resultado1 = resultado1 + frase[i];

        }
        resultado.setText(resultado1);
    }
}