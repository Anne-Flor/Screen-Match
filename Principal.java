import modelo.Episodio;
import modelo.Filme; // a classe Principal precisa da classe filme
import modelo.Serie;
import modelo.calculo.CalculadoraDeTempo;
import modelo.calculo.FiltroDeRecomendacao;

public class Principal {
    public static void main(String[] args){
        Filme nomeFilme1 = new Filme(); //new para criar  instancia do objeto
        nomeFilme1.setNome("O poderoso chefão");
        nomeFilme1.setAnoDeLancamento(1970);
        nomeFilme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme : " + nomeFilme1.getDuracaoEmMinutos());

        nomeFilme1.exibeFichaTecnica();
        nomeFilme1.avalia(8);
        nomeFilme1.avalia(5);
        nomeFilme1.avalia(10);

        System.out.println("Total de avaliações : " + nomeFilme1.getTotalDeAvaliacoes());
        System.out.println(nomeFilme1.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());

        Filme nomeFilme2 = new Filme();
        nomeFilme2.setNome("Avatar");
        nomeFilme2.setAnoDeLancamento(2023);
        nomeFilme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(nomeFilme1);
        calculadora.inclui(nomeFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(nomeFilme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost); 
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
