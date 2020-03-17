package com.example.practice_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayDemo={
                "20201744",
                "20201745",
                "20201746",
                "20201747",
                "20201748"
        };

        new ArrayAdapter(this,R.layout.item,R.id.item_text);
    }
}
