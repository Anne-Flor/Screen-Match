package modelo; //essa classe pertence a esse pacote

import modelo.titulo.Titulo;
import modelo.calculo.Classificavel;;

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
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme : " + this.getNome() + "("+ this.getAnoDeLancamento() + ")"; 
    }

}