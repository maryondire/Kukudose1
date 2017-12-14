package com.example.fidelmomolo.kukudose1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Lame extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lame);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Causes of Lameness");
        setSupportActionBar(toolbar);
        listView=(ListView) findViewById(R.id.list_lame);

        String[]description=getResources().getStringArray(R.array.lame_diseases);

        Integer[] imgid={
                R.drawable.fresheggs,
                R.drawable.avian_influenza,
                R.drawable.infectious_bronchitis


        };

        ListAdapter lady=new CustomAdapter(this,description,imgid);

        listView.setAdapter(lady);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int number=parent.getPositionForView(view);

                if(number==0){

                    Intent i=new Intent(Lame.this,MareksActivity.class);
                    startActivity(i);
                }

                else if(number==1){

                    Intent i=new Intent(Lame.this,FowlCholeraActivity.class);
                    startActivity(i);
                }
                else if(number==2){

                    Intent i=new Intent(Lame.this,FowlCholeraActivity.class);
                    startActivity(i);
                }


            }
        });

    }

}
