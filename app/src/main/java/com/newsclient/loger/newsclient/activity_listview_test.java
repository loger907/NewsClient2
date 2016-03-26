package com.newsclient.loger.newsclient;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class activity_listview_test extends Activity {
    private String[] data ={"Apple","Banana","Orange","Watermelon","Pear","Grape","Apple","Banana","Orange","Watermelon","Pear","Grape","Apple","Banana","Orange","Watermelon","Pear","Grape"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_test);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity_listview_test.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
