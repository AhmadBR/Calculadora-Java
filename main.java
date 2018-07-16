package com.example.ahmad.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity{
   //Declaração de variáveis
   int valor [];
   boolean flag = false;
   int rest = 0;
   //Declarando a variáveil de (textview = onde mostra o texto)
   TextView campotexto;
   public MainActivity() {
       //Para declarar vetor só dentro deste public
       valor = new int [10];
   }
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       //Atribuindo objetos do designer(arquivo XML) para variáveis em java
       campotexto = findViewById(R.id.Texto);
       Button botao1 = findViewById(R.id.button1);
       Button botao2 = findViewById(R.id.button2);
       Button botao3 = findViewById(R.id.button3);
       Button botao4 = findViewById(R.id.button4);
       Button botao_mais = findViewById(R.id.button_plus);
       Button botao_iqual = findViewById(R.id.button_iqual);
       Button botao_C = findViewById(R.id.buttonC);
       botao1.setOnClickListener(new OnClickListener(){
           public void onClick(View v) {
               campotexto.setText("1");
               valor[1] = 1;

               }
       }
       );
       botao2.setOnClickListener(new OnClickListener(){
           public void onClick(View v) {
               campotexto.setText("2");
               valor[2] = 2;
           }
       }
       );
       botao3.setOnClickListener(new OnClickListener(){
           public void onClick(View v) {
               campotexto.setText("3");
               valor[3] = 3;
           }
       }
       );
       botao4.setOnClickListener(new OnClickListener(){
           public void onClick(View v) {
               campotexto.setText("4");
               valor[4] = 4;
               }
       }
       );
       botao_mais.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               campotexto.setText("+");
               flag = true;
           }
       }
       );
       botao_iqual.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               if(flag == true) {
                   rest = valor[1] + valor[2];
                   campotexto.setText(String.valueOf(rest));
               }
           }
       }
       );
       botao_C.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               campotexto.setText(" ");
			flag = false;
               for(int i = 0;i<10;i++){
                   valor[i] = 0;
               }
           }
       }
       );
   }
}
