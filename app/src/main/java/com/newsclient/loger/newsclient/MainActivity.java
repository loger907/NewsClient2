package com.newsclient.loger.newsclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏掉标题栏
        setContentView(R.layout.activity_main);
        Button refresh_button = (Button) findViewById(R.id.titlebar_refresh);
        refresh_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "This data is from MainActivity";
                Toast.makeText(MainActivity.this, "Hi,loger,你好！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, activity_loger.class);//跳转到activity_loger这个活动
                intent.putExtra("Mainactivity_data",data);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {//菜单的点击动作
        switch (item.getItemId()) {
            case R.id.item_loger:
                Toast.makeText(this,"你点击的是loger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_liangxiaojian:
                Toast.makeText(this,"你点击的是肉肉梁",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

}


