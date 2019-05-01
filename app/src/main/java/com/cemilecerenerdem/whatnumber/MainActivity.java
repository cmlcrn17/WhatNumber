package com.cemilecerenerdem.whatnumber;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText kullanicininSayisi;
    Button sayiTut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullanicininSayisi = (EditText) findViewById(R.id.kullanicininSayisi);
        sayiTut = (Button) findViewById(R.id.sayiTut);

    }

    public void run(View view) {
        int randomNumber = 0;

        Random number = new Random();
        randomNumber = number.nextInt(11);

        int usernumber = 0;
        usernumber = Integer.parseInt(kullanicininSayisi.getText().toString());

        if (randomNumber == usernumber) {

            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialogresult);
            dialog.setTitle("Durum:");

            TextView info = (TextView) dialog.findViewById(R.id.textView);
            info.setText("Süper... Bildiniz...");
            dialog.show();

        } else {

            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialogresult);
            dialog.setTitle("Durum:");

            TextView info = (TextView) dialog.findViewById(R.id.textView);
            info.setText("Üzgünüm, Tekrar deneyin.Tutulan sayı: " + String.valueOf(randomNumber));
            dialog.show();

        }
    }
}
