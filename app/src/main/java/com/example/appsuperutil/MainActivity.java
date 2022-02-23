package com.example.appsuperutil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvNome = null;
    private EditText edNome = null;
    private Button btAperteme = null;
    private Button btnOutraTela = null;
    private Button btnOutraTela1 = null;
    private Button btnFechar1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNome = (TextView) findViewById(R.id.tv_nome);
        edNome = (EditText) findViewById(R.id.ed_nome);
        btAperteme = (Button) findViewById(R.id.bt_aperteme);
        btnOutraTela = (Button) findViewById(R.id.btn_outra_tela);
        btnOutraTela1 = (Button) findViewById(R.id.btn_outra_tela1);
        btnFechar1= (Button) findViewById(R.id.btn_fechar1);

        btAperteme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvNome.setText(edNome.getText());
            }
        });

        btnOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.appsuperutil.MainActivity2.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

        btnOutraTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, com.example.appsuperutil.MainActivity3.class);
                intent2.setAction(Intent.ACTION_VIEW);
                startActivity(intent2);
            }
        });

        btnFechar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });




    }
}