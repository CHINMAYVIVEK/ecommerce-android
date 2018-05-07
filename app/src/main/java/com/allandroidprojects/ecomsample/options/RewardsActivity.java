package com.allandroidprojects.ecomsample.options;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.startup.MainActivity;

public class RewardsActivity extends AppCompatActivity {
    Button rewardbtn;
    RecyclerView recyclerViewreward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
        recyclerViewreward=findViewById(R.id.recyclervieworder);
        rewardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(RewardsActivity.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}
