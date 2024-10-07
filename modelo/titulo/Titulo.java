package modelo.titulo;

import java.lang.Comparable; 
import modelo.titulo.Titulo;

public class Titulo implements Comparable<Titulo>{
    private String nome;              //modelo
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){ //constructor
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    public String getNome(){
        return nome;
    } 

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos; 
    }


    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){ //criando o método
        System.out.println("Nome do filme : " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração : " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outrTitulo) {
        return this.getNome().compareTo(outrTitulo.getNome());
    }
}
