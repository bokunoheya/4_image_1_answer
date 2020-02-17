package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Zadanie_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zadanie_1);
    }

    public void otvet1(View view) {
        EditText slovo=findViewById(R.id.editText); //инициализируем  добавленную PlainText указав его id.
        String str=slovo.getText().toString(); //Читает наш введенный текст
        if(str.equals("картинки")){ //условие правильности ответа. Происходит проверка введенного ответа
            // По умолчанию мы поставили otv1 ложным=0, если правильно, то истина=1
            Intent ifRight=new Intent(this, Zadanie_2.class);// если правильно, то переход в следующее задание
            startActivity(ifRight);
            Toast toastForZadanie1T=Toast.makeText(getApplicationContext(),"Правильно", Toast.LENGTH_SHORT);
            toastForZadanie1T.show();//вывод уведомления
        }else{
            Toast toastForZadanie1F=Toast.makeText(getApplicationContext(),"Неправильно", Toast.LENGTH_SHORT);
            toastForZadanie1F.show();//вывод уведомления
        }
    }
}
