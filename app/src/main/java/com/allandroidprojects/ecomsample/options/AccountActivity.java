package com.allandroidprojects.ecomsample.options;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.allandroidprojects.ecomsample.R;

public class AccountActivity extends AppCompatActivity {
    TextView textViewviewallorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        textViewviewallorder=findViewById(R.id.viewallorder);
        textViewviewallorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AccountActivity.this,Viewallororder.class);
                startActivity(in);
            }
        });
    }
}
