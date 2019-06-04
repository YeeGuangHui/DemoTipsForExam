package com.example.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;

    EditText edText;
    String[]tip;
    ArrayAdapter aa;
    ListView lvExamTips;

    ArrayList<String> tipExam;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewExamTips);
        btnAdd=findViewById(R.id.button);
        edText=findViewById(R.id.editText);

        tip = new String[3];
        tip[0] = "Item 1";
        tip[1] = "Item 2";
        tip[2] = "item 3";

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, (List) lvExamTips);
        lvExamTips.setAdapter(aa);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newTip= edText.getText().toString();
                tipExam.add(newTip);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
