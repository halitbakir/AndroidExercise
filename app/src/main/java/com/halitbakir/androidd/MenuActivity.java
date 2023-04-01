package com.halitbakir.androidd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //start
    }

    //onCreateOptionsMenu
    //menu için gerekli method
    @Override
    public boolean onCreateOptionsMenu(Menu menuItem) {
        //menu eklemek
        getMenuInflater().inflate(R.menu.menu,menuItem);
        return super.onCreateOptionsMenu(menuItem);
    }

    //menuye tıkladığında çalışacak metod
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int chooise=item.getItemId();
        switch (chooise){
            case R.id.menu1:
                Toast.makeText(this, "Menu1 seçildi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu2:
                Toast.makeText(this, "Menu2 seçildi", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Seçim yapılmadı", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}