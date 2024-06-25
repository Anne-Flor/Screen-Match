package modelo;

import modelo.titulo.Titulo;
import modelo.calculo.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas; 
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio; 

    public int getTemporadas(){
        return temporadas;
    }
    
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada(){
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada){
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia() / 2 ; 
    }
}
