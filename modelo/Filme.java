package modelo; //essa classe pertence a esse pacote

import modelo.titulo.Titulo;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return 0;
    }

}