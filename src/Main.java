public class Main {
    public static void main(String[] args) {
          // Classe objeto  construstor
        Turista mochileiro = new Turista ("Maia");
       // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf(Validacao.cpf("123"));

        Turista  mochileira = new Turista() ;
        mochileira.setNome("Tomas");


    }
}