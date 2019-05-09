package com.example.aluraconstrantlayout.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.aluraconstrantlayout.R;
import com.example.aluraconstrantlayout.ui.adapter.ListaAdapter;

import java.util.List;

import com.example.aluraconstrantlayout.ui.dao.PacoteDAO;
import com.example.aluraconstrantlayout.ui.model.Pacote;

public class ListaPacotesActivity extends AppCompatActivity {


    private static final String TITULO_APP_BAR= "Pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(TITULO_APP_BAR);
        configuraLista();
    }

    private void configuraLista() {

        ListView listview =  findViewById(R.id.lista_pacote_listView);
        List<Pacote> pacotes = new PacoteDAO().lista();
        listview.setAdapter(new ListaAdapter(pacotes,this));
    }


}
