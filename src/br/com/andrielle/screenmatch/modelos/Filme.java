package br.com.andrielle.screenmatch.modelos;

import br.com.andrielle.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    // br.com.andrielle.screenmatch.modelos.Filme -> é uma especificação, um contrato
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }
}