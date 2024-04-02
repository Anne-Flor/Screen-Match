import modelo.Filme; // a classe Principal precisa da classe filme

public class Principal {
    public static void main(String[] args){
        Filme nomeFilme1 = new Filme(); //new para criar  instancia do objeto
        nomeFilme1.setNome("O poderoso chefão");
        nomeFilme1.setAnoDeLancamento(1970);
        nomeFilme1.setAnoDeLancamento(180);

        nomeFilme1.exibeFichaTecnica();
        nomeFilme1.avalia(8);
        nomeFilme1.avalia(5);
        nomeFilme1.avalia(10);

        System.out.println("Total de avaliações : " + nomeFilme1.getTotalDeAvaliacoes());
        System.out.println(nomeFilme1.pegaMedia());


    }
}
