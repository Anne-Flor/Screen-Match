public class Condicional {
    static public void main(String[] args){
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que estão em alta");
        }else{
            System.out.println("Classicos que valem a pena");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Disponível no plano");
        }else{
            System.out.println("Filme Disponível para alugar");
        }
    }
}
