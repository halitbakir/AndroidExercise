package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ApplicationData1 extends AppCompatActivity {

    //Global Variable
    //edittexte yazılan yazıyı gönder butonuna basınca textviewde göstermek için yapıyoruz:
    private EditText EditTextApplicationId; //edittexti idsi ile ekliyoruz /appdataxmlden aldık
    private Button buttonSubmitId; //buttonu idsi ile ekliyoruz /appdataxmlden aldık
    private Button buttonResetId;
    private ImageView İmageViewId; //yukardakilerin aynısı
    private TextView textViewApplicationId; //yukardakilerin aynısı


    private String userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_data1);
        //start

        //Global variableleri pcye tanıtıyoruz bulmasını sağlıyoruz ID
        EditTextApplicationId=findViewById(R.id.EditTextApplicationId);
        buttonSubmitId=findViewById(R.id.buttonSubmitId);
        İmageViewId=findViewById(R.id.İmageViewId);
        textViewApplicationId=findViewById(R.id.textViewApplicationId);
        buttonResetId=findViewById(R.id.buttonResetId);

        //Gönder butonuna tıklayınca olacaklar:
        buttonSubmitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ApplicationData1.this, "Gönderildi", Toast.LENGTH_SHORT).show();
                //Edittexten Yazıyı alabilme:
                userData=EditTextApplicationId.getText().toString(); //get metoduyla yazıyı getirttik
                Log.i("user", userData); //logda yazıyı getirttiğini gördük

                //Yazılan yazıyı textviewde  bastırma-gösterme:
                textViewApplicationId.setText(userData.toUpperCase());

                //4 tane resim olsun resimler göndere bastıkça random değişsin
                Object[] imageObject= new Object[4];
                imageObject[0]=R.drawable.cat;
                imageObject[1]=R.drawable.earth;
                imageObject[2]=R.drawable.neon;
                imageObject[3]=R.drawable.space;
                for (int i = 0; i < imageObject.length; i++) { //dizi elemanlarını rastgele vermesi için döngü oluşturduk
                    Random random = new Random();
                    int imageData= random.nextInt(4)+0;
                    İmageViewId.setImageResource((Integer) imageObject[imageData]);
                }
            }
        }); //end ClickListener

        //reset butonuna tıklayınca olacaklar
        buttonResetId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ApplicationData1.this, "Temizlendi", Toast.LENGTH_SHORT).show();
                textViewApplicationId.setText(""); //temizleme yeri bura text datayı null bırakınca temizlendi
            }
        });//end resetclicklistener

    }//end
}//end ApplicationData1