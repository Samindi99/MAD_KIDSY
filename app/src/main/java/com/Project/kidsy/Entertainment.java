package com.Project.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Entertainment extends AppCompatActivity {

    Button btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        btn4=(Button)findViewById(R.id.quote_btn);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Entertainment.this,Quote.class);
                startActivity(intent);

                Toast toast = Toast.makeText(getApplicationContext(), "Loading", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                toast.show();
            }

        });
        btn5=(Button)findViewById(R.id.cartoon_btn);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Entertainment.this,Cartoon.class);
                startActivity(intent);

                Toast toast1=Toast.makeText(getApplicationContext(),"Loading",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast1.show();
            }
        });
    }
}