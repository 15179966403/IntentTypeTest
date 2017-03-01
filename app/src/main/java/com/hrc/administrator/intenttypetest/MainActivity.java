package com.hrc.administrator.intenttypetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtName,edtAge;
    private Button btn;
    private Person1 person1=new Person1();
    private Person2 person2=new Person2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName= (EditText) findViewById(R.id.edtname);
        edtAge= (EditText) findViewById(R.id.edtage);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name=edtName.getText().toString();
        int age=Integer.valueOf(edtAge.getText().toString());
        person1.setName(name);
        person1.setAge(age);
        person2.setName(name);
        person2.setAge(age);
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("person1",person1);
        intent.putExtra("person2",person2);
        startActivity(intent);
    }
}
