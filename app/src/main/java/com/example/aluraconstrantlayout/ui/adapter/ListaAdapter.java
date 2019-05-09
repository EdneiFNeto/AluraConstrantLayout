package com.example.aluraconstrantlayout.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aluraconstrantlayout.R;

import java.util.List;

import com.example.aluraconstrantlayout.ui.model.Pacote;
import com.example.aluraconstrantlayout.ui.utils.ResourceUtil;
import com.example.aluraconstrantlayout.ui.utils.DiasUtil;
import com.example.aluraconstrantlayout.ui.utils.MoedaUtil;

public class ListaAdapter extends BaseAdapter {


    private final List<Pacote> pacotes;
    private final Context context;

    public ListaAdapter(List<Pacote> pacotes, Context context) {

        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        mostraLocal(view, pacote);
        mostraImagem(view, pacote);
        mostraDia(view, pacote);
        mostraPreco(view, pacote);

        return view;
    }

    private void mostraPreco(View view, Pacote pacote) {

        TextView item_preco = view.findViewById(R.id.item_pacote_preco);
        String moeda = MoedaUtil.formataParaBrasileiro(pacote.getPreco());
        item_preco.setText(moeda);
    }

    private void mostraDia(View view, Pacote pacote) {

        TextView item_dia = view.findViewById(R.id.item_pacote_dias);
        String diaEmText = DiasUtil.formataEmtexto(pacote.getDia());
        item_dia.setText(diaEmText);
    }



    private void mostraImagem(View view, Pacote pacote) {

        ImageView imageView = view.findViewById(R.id.item_pacote_imagem);
        Drawable drawable = ResourceUtil.getDrawable(context, pacote.getImagem());
        imageView.setImageDrawable(drawable);
    }



    private void mostraLocal(View view, Pacote pacote) {

        TextView item_local = view.findViewById(R.id.item_pacote_local);
        item_local.setText(pacote.getLocal());
    }
}
