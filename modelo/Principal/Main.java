package modelo.Principal;

import java.util.ArrayList;

import modelo.Filme;
import modelo.Serie;
import modelo.titulo.Titulo;

public class Main {
    public static void main(String [] args){

        Filme nomeFilme1 = new Filme("O poderoso chefão", 1970);
        nomeFilme1.avalia(9); //new para criar  instancia do objeto

        Filme nomeFilme2 = new Filme("Avatar", 2023);
        nomeFilme2.avalia(6);

        var nomeFilme3 = new Filme("Dogville", 2003);
        nomeFilme3.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        
        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(nomeFilme3);
        listaDeAssistidos.add(nomeFilme2);
        listaDeAssistidos.add(nomeFilme1); 
        listaDeAssistidos.add(lost);

        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2 ) {
        
        }
        }
    }
}
