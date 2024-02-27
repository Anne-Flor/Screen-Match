public class Main {

    public static void main(String[] args){
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculado pela 3 notas do público
        double media = (9.8 + 6.3 + 8.0) / 2;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de Aventura do Galâ dos anos 80
                Muito Bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

    }
}