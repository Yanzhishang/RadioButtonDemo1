package com.yzs.zx.radiobuttondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //声明对象变量
    private RadioGroup radioGroup;
    private RadioButton basketball,football;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过ID获取控件
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        basketball = (RadioButton) findViewById(R.id.basketball);
        football = (RadioButton) findViewById(R.id.football);
        //对点击事件监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (basketball.getId() == i){
                    Toast.makeText(MainActivity.this,"篮球",Toast.LENGTH_SHORT).show();
                }else  if (football.getId() == i){
                    Toast.makeText(MainActivity.this,"足球",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
