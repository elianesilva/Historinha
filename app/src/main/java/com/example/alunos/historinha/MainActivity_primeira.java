package com.example.alunos.historinha;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_primeira extends AppCompatActivity {

    EditText texto1;
    EditText texto2;
    Button btn1;
    String  editTxtVal1;
    String editTxtVal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_primeira);

        setRequestedOrientation((ActivityInfo.SCREEN_ORIENTATION_PORTRAIT));


        texto1 = (EditText) findViewById(R.id.et_nome01);
        texto2 = (EditText) findViewById(R.id.et_nome02);
        btn1 = (Button) findViewById(R.id.bt_enviar);

    }
    public void btnClickAct1(View v){

        Intent i = new Intent(this, MainActivity_segunda.class);
        editTxtVal1 = texto1.getText().toString();
        i.putExtra("value",editTxtVal1);
        editTxtVal2 = texto2.getText().toString();
        i.putExtra("value", editTxtVal2);
        startActivity(i);
        finish();
    }

}
