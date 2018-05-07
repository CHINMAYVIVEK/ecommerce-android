package com.allandroidprojects.ecomsample.options;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.startup.MainActivity;

public class MyOrderActivity extends AppCompatActivity {
    Button orderbtn;
    RecyclerView recyclerVieworder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        orderbtn=findViewById(R.id.myorderbutton);
        recyclerVieworder=findViewById(R.id.recyclervieworder);
        orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MyOrderActivity.this, MainActivity.class);
                startActivity(in);
            }
        });

    }
}
