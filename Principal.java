public class Principal {
    public static void main(String[] args){
        Filme tituloFilme1 = new Filme(); //new para criar  instancia do objeto
        tituloFilme1.titulo = "O poderoso chefão";
        tituloFilme1.anoDeLancamento = 1970;
        tituloFilme1.duracaoEmMinutos = 180;

        tituloFilme1.exibeFichaTecnica();
        tituloFilme1.avalia(8);
        tituloFilme1.avalia(5);
        tituloFilme1.avalia(10);
        System.out.println(tituloFilme1.somaDasAvaliacoes);
        System.out.println(tituloFilme1.totalDeAvaliacoes);
        System.out.println(tituloFilme1.pegaMedia());

    }
}
