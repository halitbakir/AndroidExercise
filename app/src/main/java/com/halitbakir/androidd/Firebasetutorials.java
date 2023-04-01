package com.halitbakir.androidd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;

public class Firebasetutorials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebasetutorials);

        //Start
        //firebaseData > username > Halit:Bakır
        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference().child("firebaseData").child("username");
        Log.e("KEY: ",databaseReference.getKey());

        DatabaseReference databaseReference1=databaseReference.push(); //veri gönderme
        databaseReference1.setValue("Merhabalar"); //gönderilen text verisi

        //son data
        databaseReference1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.e("Son KEY data", snapshot.getKey());
                Log.e("Son Value data", snapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Log.e("KEY data", snapshot.getKey());
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        //LocalStorage
        StorageReference storageReference= FirebaseStorage.getInstance().getReference().child("Resim");
        String URL="android.resource://com.halitbakir.androidd/drawable/computer.jpg";
        Uri uri=Uri.parse(URL);
        try {
            InputStream inputStream=getContentResolver().openInputStream(uri);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        storageReference.putFile(uri);

    }
}