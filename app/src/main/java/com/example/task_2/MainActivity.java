package com.example.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnNext;
    ArrayList<Visitor> visitorsList = new ArrayList<Visitor>();
    Integer a = 1;
    TextView tvNumber;
    private EditText full_name;
    private EditText age;
    private EditText time;
    private EditText e_mail;
    TextView show_all_visitors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tvNumber);
        btnNext = findViewById(R.id.next);
        full_name = (EditText)findViewById(R.id.full_name);
        age = (EditText)findViewById(R.id.age);
        time = (EditText)findViewById(R.id.time);
        e_mail = (EditText)findViewById(R.id.e_mail);

        show_all_visitors = findViewById(R.id.show_all_visitors);

    }

    public void writeNext(View view) {
        visitorsList.add(new Visitor(full_name.getText().toString(), Integer.parseInt(String.valueOf(age.getText().toString())), time.getText().toString(), e_mail.getText().toString()));
        full_name.setText("");
        age.setText("");
        time.setText("");
        e_mail.setText("");
    }

    public void finish_and_show(View view) {
        Log.d("myTag_2", "999");
        String all_visitors_info = "";
        for (Visitor itVar : visitorsList)
        {
            all_visitors_info = all_visitors_info + itVar.getVisitor() + "\n \n";
        }
        show_all_visitors.setText(all_visitors_info);
        Log.d("myTag_2", all_visitors_info);
    }

}