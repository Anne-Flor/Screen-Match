package modelo.titulo;

import java.lang.Comparable;

import com.google.gson.annotations.SerializedName;

import modelo.TituloOmdb;
import modelo.titulo.Titulo;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;  
    @SerializedName("Year")            
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){ 
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);

    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year()); //valeuOf recebe uma string e converte em inteiro 
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
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

    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeLancamento="
        + anoDeLancamento + "Duração=" + duracaoEmMinutos + "]";
    }

    
}
