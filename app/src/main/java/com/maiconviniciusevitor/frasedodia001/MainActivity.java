package com.maiconviniciusevitor.frasedodia001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    FraseDoDia fraseDoDia = new FraseDoDia();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   //criar metodo gerarFraseAleatoria
    public void gerarFraseAleatoria(View view ){

        //recebendo componente de exibição
        TextView exibir=findViewById(R.id.text_resultado);
        //criando meu aleatoria
        int numeroAleatorio= new Random().nextInt(3);
        //criando variavel resultado
        String resultado= fraseDoDia.frases[numeroAleatorio];
        //exibindo resultado
        exibir.setText(resultado);
    }

    //criar metodo exibirfrase
    public void exibirFrasesAleatiria(View view){
        //criando meu textview pra exibir
        TextView exibir = findViewById(R.id.text_resultado);
        //criando variavel resultado
        String resultado="";
        //criando minha função simplicada de looper
        for(String frase : fraseDoDia.frases){
        resultado = resultado +  frase+ "\n";
        }
        exibir.setText(resultado);

    }
}