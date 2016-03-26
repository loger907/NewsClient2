package com.newsclient.loger.newsclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.PublicKey;

public class activity_loger extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏掉标题栏
        setContentView(R.layout.activity_loger);
        Button button_loger = (Button)findViewById(R.id.button_loger);
        Button title_edit = (Button) findViewById(R.id.title_edit);
        final TextView Textview_loger = (TextView) findViewById(R.id.textview_loger);
        button_loger.setOnClickListener(new View.OnClickListener() {//buttion_loger的点击事件
            @Override
            public void onClick(View v) {
                Intent intent1 = getIntent();
                String data = intent1.getStringExtra("Mainactivity_data");
                Textview_loger.setText(data);//在TextView显示上一个activity传下来的数据
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        title_edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_loger.this, activity_listview_test.class);//跳转到activity_loger这个活动
                startActivity(intent);
            }
        });

    }
    public class TitleLayout extends LinearLayout{

        public TitleLayout(Context context,AttributeSet attrs) {
            super(context, attrs);
            LayoutInflater.from(context).inflate(R.layout.title, this);
        }
    }
}
