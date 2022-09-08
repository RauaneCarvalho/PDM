package br.edu.ifpb.projetolistapessoas_rauane.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifpb.projetolistapessoas_rauane.R;
import br.edu.ifpb.projetolistapessoas_rauane.model.Pessoa;

public class ListaPessoasAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Pessoa> pessoas;

    public ListaPessoasAdapter(Context context, ArrayList<Pessoa> pessoas) {
        this.context = context;
        this.pessoas = pessoas;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int i) {
        return pessoas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        if (view == null){
            view = inflater.inflate(R.layout.item_lista, viewGroup, false);
        }

        Pessoa pessoaAtual = (Pessoa) getItem(i);
        ImageView fotopessoa = view.findViewById(R.id.imgPessoa);
        TextView tvNomePessoa = view.findViewById(R.id.tvNomePessoa);
        TextView tvEmailPessoa = view.findViewById(R.id.tvEmailPessoa);
        TextView tvTelefonePessoa = view.findViewById(R.id.tvTelefonePessoa);

        fotopessoa.setImageResource(pessoaAtual.getDrawableImage());
        tvNomePessoa.setText(pessoaAtual.getNome());
        tvEmailPessoa.setText(pessoaAtual.getEmail());
        tvTelefonePessoa.setText(pessoaAtual.getTelefone());


        return view;
    }
}
