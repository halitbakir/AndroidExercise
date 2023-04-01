package com.halitbakir.androidd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewData extends AppCompatActivity {

    //global değişkenler
    private ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);

        //Start
        ListView=findViewById(R.id.listViewId);
        String[] listData={"Servlet", "JSP", "JSF","Spring Framework","Spring Boot"};
        //adapter bi yere bağlamak için kullanılır:
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, listData);
        ListView.setAdapter(adapter);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //counter
            int counter=1;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("Listem",listData[position]);
                Toast.makeText(ListViewData.this, counter+"KEZ TIKLANDI "+listData[position], Toast.LENGTH_SHORT).show();
                counter++;
            }
        });
    }
}