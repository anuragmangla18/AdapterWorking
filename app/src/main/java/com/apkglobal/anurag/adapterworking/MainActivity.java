package com.apkglobal.anurag.adapterworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
//ListView list;
    Spinner spinner;

    String [] name={"Anurag","Sahil","Rajat"};
    int[] image={android.R.drawable.btn_star,R.drawable.email,android.R.drawable.btn_radio};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinneras);
       // list=(ListView)findViewById(R.id.list);
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for( int i=0;i<name.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<String, String>();
            hashMap.put("name",name[i]);
            hashMap.put("image",image[i]+"");
            arrayList.add(hashMap);
        }
        String from[]={"name","image"};
        // id is in integer
        int[] to={R.id.tv,R.id.iv};
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.list_item,from,to);
        spinner.setAdapter(simpleAdapter);
       // list.setAdapter(simpleAdapter);
        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),name[position],Toast.LENGTH_LONG).show();
            }
        });*/
    }
}
