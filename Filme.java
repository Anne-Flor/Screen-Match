public class Filme {
    String titulo;              //modelo
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){ //criando o método
        System.out.println("Nome do filme : " + titulo);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração : " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}