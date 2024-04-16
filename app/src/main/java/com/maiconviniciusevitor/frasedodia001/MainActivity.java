package com.maiconviniciusevitor.frasedodia001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //criando meu atributos
    String[] frase={"Frase 01, Frase 02,Frase 03"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //criando metodo gerarFrase
    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.text_resultado);

        int numeroAleatorio= new Random().nextInt(3);

        String frase1 = frase[numeroAleatorio];

        texto.setText(frase1);

    }

    public void gerarFraseAleatoria(View view){
      TextView texto = findViewById(R.id.text_resultado);

      String textoResultado="";

      for(String frase:frase){
      textoResultado= textoResultado + frase+"\n";

      }
      texto.setText(textoResultado);
    }
}