package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //toast
        Toast.makeText(this, "This alanı", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "context alanı", Toast.LENGTH_SHORT).show();

        //alert
        AlertDialog.Builder alert= new AlertDialog.Builder(OtherActivity.this);//Alertdialog oluşturduk
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() { //popupda evete basılırsa olacakları aşağı blok içine yazarız
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(OtherActivity.this, "Evet onayını verdiniz", Toast.LENGTH_SHORT).show();//basıldıktan sonra ekrana bilgi verdik
            }
        });

        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(OtherActivity.this, "Hayıra bastınız", Toast.LENGTH_SHORT).show();
            }
        });
        alert.setTitle("Other Activity Classına Girdiniz");
        alert.setMessage("Devam etmek ister misiniz?");
        alert.show(); //alertı göstermek için
    }

    //aşağıdaki start stop vs classlar hem runda yazar hem içine istediğimiz kodu
    //eklediğimizde ona göre çalışır örn netflixde ana ekrana dönüp uyg tekrar
    //dönünce dizinin devam etmesi gibi
    @Override
    protected void onStart() { //proje başlatılınca runda yazar
        super.onStart();
        Log.e("onStart", "Başlatıldı");
    }

    @Override
    protected void onStop() { //proje durdurulunca runda yazar
        super.onStop();
        Log.e("onStop", "Durduruldu");
    }

    @Override
    protected void onResume() { //proje çalışırken runda yazar
        super.onResume();
        Log.e("onResume", "Devam ediyor");
    }

    @Override
    protected void onPause() { //proje durunca runda yazar
        super.onPause();
        Log.e("onPause", "onPause");
    }

    @Override
    protected void onRestart() { //proje kapatıp açınca runda yazar
        super.onRestart();
        Log.e("onRestart", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "Öldü");
    }

}