package modelo; //essa classe pertence a esse pacote

import modelo.titulo.Titulo;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

}