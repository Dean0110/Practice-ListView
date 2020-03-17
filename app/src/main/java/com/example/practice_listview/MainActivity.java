package com.example.practice_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] arrayDemo={
                "20201744",
                "20201745",
                "20201746",
                "20201747",
                "20201748"
        };

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.item,R.id.item_text,arrayDemo);

        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+arrayDemo[i],Toast.LENGTH_SHORT).show();
            }
        });


    }
}
