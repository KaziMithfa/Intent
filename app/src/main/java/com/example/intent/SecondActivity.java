package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt = (TextView) findViewById(R.id.textId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String value = bundle.getString("tag");
            txt.setText(value);
        }




    }
}
