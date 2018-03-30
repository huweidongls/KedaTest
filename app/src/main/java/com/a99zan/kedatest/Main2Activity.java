package com.a99zan.kedatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.a99zan.utils.ToastUtil;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    private EditText et;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

    }

    private void init() {
        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().equals("1")){
                    ToastUtil.showShort(Main2Activity.this, "正确！");
                }else{
                    ToastUtil.showShort(Main2Activity.this, "错误！");
                    et.setError("密码错误");
                }
            }
        });

    }
}
