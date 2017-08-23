package com.yuyh.processordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.yuyh.annotation.InjectView;
import com.yuyh.inject.ViewInject;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.text)
    TextView textView;

    @InjectView(R.id.text1)
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewInject.inject(this);

        Log.i("TAG", textView == null ? "null..." : textView.getText().toString());

        Log.i("TAG", textView1 == null ? "null..." : textView1.getText().toString());
    }
}
