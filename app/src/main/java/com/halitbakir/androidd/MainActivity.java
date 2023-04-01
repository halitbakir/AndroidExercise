package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //Global Değişkenler
    private Button buttonOtherActivityId;
    private Button buttonApplicationData1Id;


    //Activityler arası veri taşımak
    private Button buttonActivityBlueId;


    //image
    private Button buttonActivityImageId;
    //FAB
    private FloatingActionButton floatingActionButtonId;
    //progress bar
    private ProgressBar progressBarId;


    //RadioButton
    private RadioGroup radioGroupId;
    private RadioButton RadioButtonFemale;
    private RadioButton RadioButtonMale;
    private Button buttonRadioSubmit;


    //List View
    private Button buttonActivityListViewId;


    //Recycler View
    private Button buttonActivityReCyclerViewId;

    //menu item
    private Button buttonMenuButtonId;

    //Firebase Realtime
    private Button buttonActivityFirebasetutorialsId;

    //Firebase Local Storage
    private Button buttonActivityFirebaseLocalStorageId;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start data
        //other activity
        buttonOtherActivityId=findViewById(R.id.buttonOtherActivity); //buttonu bulma kodu
        buttonOtherActivityId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("data 555"); //kontrol için yazdık bişey değil
                Intent otherActivityIntent= new Intent(getApplicationContext(), OtherActivity.class);  //eklemek istediğimiz veriyi oluşturuyo
                //yukarda diğer activity geçiş için
                Toast.makeText(MainActivity.this, "Other Activity Yönlendirildi", Toast.LENGTH_LONG).show();
                //yukarda ekranda bilgi mesajı
                startActivity(otherActivityIntent);
            }
        }); //tıklandığında ne olacak

        //Application1
        buttonApplicationData1Id=findViewById(R.id.buttonApplicationData1Id); //app butonunu bul tanı diyoruz
        buttonApplicationData1Id.setOnClickListener(new View.OnClickListener() { //butona tıklayınca ne olacak demek
            @Override
            public void onClick(View view) {
                Intent intentApplication1=new Intent(getApplicationContext(), ApplicationData1.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "My application data1 yönlendirildi", Toast.LENGTH_SHORT).show();
                startActivity(intentApplication1); //yönlendirme işlemi başlatma
            }
        });

        //ID Blue other connection Activity
        buttonActivityBlueId=findViewById(R.id.buttonActivityBlueId);
        buttonActivityBlueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBlueConnection=new Intent(getApplicationContext(), ActivityConnectionBlue.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "Activity Connection Blue", Toast.LENGTH_SHORT).show();
                startActivity(intentBlueConnection); //yönlendirme işlemi başlatma
            }
        });

        //picture
        buttonActivityImageId=findViewById(R.id.buttonActivityImageId);
        buttonActivityImageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection=new Intent(getApplicationContext(), imageTutorials.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "Resim tutorials", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection); //yönlendirme işlemi başlatma
            }
        });

        //progress bar
        progressBarId=findViewById(R.id.progressBarId);
        progressBarId.setVisibility(View.INVISIBLE); //setvisibility görünür kılmak için

        //fab
        floatingActionButtonId=findViewById(R.id.floatingActionButtonId);
        floatingActionButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarId.setVisibility(View.VISIBLE); //progressbarı görünür kılmak
            }
        });

        //radio button
        radioGroupId=findViewById(R.id.radioGroupId);
        RadioButtonFemale=findViewById(R.id.RadioButtonFemale);
        RadioButtonMale=findViewById(R.id.RadioButtonMale);
        buttonRadioSubmit=findViewById(R.id.buttonRadioSubmit);
        buttonRadioSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioCheckButtonId = radioGroupId.getCheckedRadioButtonId(); //erkekmi bayanamı tıklandığını anlar
                switch (radioCheckButtonId) {
                    case R.id.RadioButtonFemale:
                        Toast.makeText(MainActivity.this, "Bayan", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.RadioButtonMale:
                        Toast.makeText(MainActivity.this, "Erkek", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        //ListView
        buttonActivityListViewId=findViewById(R.id.buttonActivityListViewId);
        buttonActivityListViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection=new Intent(getApplicationContext(), ListViewData.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "ListView tıklandı", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection); //yönlendirme işlemi başlatma
            }
        });

        //reCyclerView
        buttonActivityReCyclerViewId=findViewById(R.id.buttonActivityReCyclerViewId);
        buttonActivityReCyclerViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentImageConnection=new Intent(getApplicationContext(), ReCyclerViewData.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "ReCyclerView tıklandı", Toast.LENGTH_SHORT).show();
                startActivity(intentImageConnection); //yönlendirme işlemi başlatma
            }
        });

        //Menu item
        buttonMenuButtonId=findViewById(R.id.buttonMenuButtonId);
        buttonMenuButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(), MenuActivity.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "intentMenu tıklandı", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu); //yönlendirme işlemi başlatma
            }
        });

        //Firebase Realtime
        buttonActivityFirebasetutorialsId=findViewById(R.id.buttonActivityFirebasetutorialsId);
        buttonActivityFirebasetutorialsId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(), Firebasetutorials.class); //app contexten alıp data1e gidilecek demek
                Toast.makeText(MainActivity.this, "Firebasetutorials tıklandı", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu); //yönlendirme işlemi başlatma
            }
        });

        //Firebase LocalStorage
        buttonActivityFirebaseLocalStorageId=findViewById(R.id.buttonActivityFirebaseLocalStorageId);
        buttonActivityFirebaseLocalStorageId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenu=new Intent(getApplicationContext(), Firebasetutorials.class);
                Toast.makeText(MainActivity.this, "Firebase Local Storage tıklandı", Toast.LENGTH_SHORT).show();
                startActivity(intentMenu);
            }
        });

    } //end onCreate
}