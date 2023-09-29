package questao3;

public class Main {
    public static void main(String[] args) {

    DistribuicaoAlimento da = new DistribuicaoAlimento("Mesa Brasil", "SESC", "Belo Horizonte", "07/09/2023", "07/11/2023", "Pão de Batata", 75);
    TrabalhoVoluntario tv = new TrabalhoVoluntario("Gigante da Colina", "Vasco", "Colina", "21/08/1898", "21/08/2024","Doação", 4);

        da.validaProjeto();
        System.out.println(da.imprimeProjeto());
        tv.validaProjeto();
        System.out.println(tv.imprimeProjeto());

    }

}