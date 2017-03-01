package com.hrc.administrator.intenttypetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/1.
 */

public class SecondActivity extends Activity {
    private TextView tvPerson1,tvPerson2;
    private Person1 person1;
    private Person2 person2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvPerson1= (TextView) findViewById(R.id.tvSerializable);
        tvPerson2= (TextView) findViewById(R.id.tvParcelable);
        person1= (Person1) getIntent().getSerializableExtra("person1");
        person2=getIntent().getParcelableExtra("person2");
        tvPerson1.setText("name:"+person1.getName()+"  age:"+person1.getAge());
        tvPerson2.setText("name:"+person2.getName()+"  age:"+person2.getAge());
        Toast.makeText(MyApplication.getContext(),"跳转成功",Toast.LENGTH_LONG).show();
    }
}
