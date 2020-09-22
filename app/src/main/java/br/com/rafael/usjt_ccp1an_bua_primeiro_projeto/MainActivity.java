package br.com.rafael.usjt_ccp1an_bua_primeiro_projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.text.DisplayContext.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irParaOutraTela(View view) {
        EditText mensagemEditText = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEditText.getText().toString();
        //Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ExibeMensagemActivity.class);
        intent.putExtra("msg",mensagem);
        startActivity(intent);
    }
}