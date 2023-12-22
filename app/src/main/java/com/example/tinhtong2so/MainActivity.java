package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvtitle,tvkq;
    Button btntinh;
    EditText edt1;
    EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        btntinh=(Button)findViewById(R.id.btntinh);
        tvtitle=(TextView) findViewById(R.id.tvtitle);
        tvkq=(TextView) findViewById(R.id.tvkq);
    }
    public void TinhTong(View view)
    {

        float so1=Float.parseFloat(edt1.getText().toString());
        float so2=Float.parseFloat(edt2.getText().toString());


        float tong=so1+so2;
        tvkq.setText(String.valueOf(tong));
    }
}