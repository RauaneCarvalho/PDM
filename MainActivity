package br.edu.ifpb.projetolistapessoas_rauane.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.ifpb.projetolistapessoas_rauane.DAO.PessoaDAO;
import br.edu.ifpb.projetolistapessoas_rauane.R;
import br.edu.ifpb.projetolistapessoas_rauane.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    private ListView lvContatos;
    private ListaPessoasAdapter listaPessoasAdapter;
    private PessoaDAO pessoaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pessoaDAO = new PessoaDAO();

        ArrayList <Pessoa> pessoas = this.pessoaDAO.getPessoas();
        this.listaPessoasAdapter = new ListaPessoasAdapter(this, pessoas);

        this.lvContatos = (ListView) findViewById(R.id.lvContatos);
        lvContatos.setAdapter(this.listaPessoasAdapter);


        Log.i("Lista", String.format("Total de pessoas da lista: %s", this.listaPessoasAdapter.getCount()));
    }
}
