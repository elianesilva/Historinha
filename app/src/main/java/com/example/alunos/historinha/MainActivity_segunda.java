package com.example.alunos.historinha;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_segunda extends AppCompatActivity {


    TextView mostrarTexto1;
    TextView mostrarTexto2;
    Button btn2;
    String valFromAct1;
    String valFromAct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        setRequestedOrientation((ActivityInfo.SCREEN_ORIENTATION_PORTRAIT));


        btn2 = (Button) findViewById(R.id.button1);

        mostrarTexto1 = (TextView) findViewById(R.id.text3);
        valFromAct1 = getIntent().getExtras().getString("value");
        mostrarTexto1.setText(valFromAct1);

        mostrarTexto2 = (TextView) findViewById(R.id.text4);
        valFromAct2 = getIntent().getExtras().getString("value");
        mostrarTexto2.setText(valFromAct2);

    }
    public void btnClick2(View v){
        Intent i = new Intent(this, TerceiraActivity.class);
        startActivity(i);
        finish();
    }

}
