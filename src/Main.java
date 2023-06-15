public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação á Objetos
 Pessoa adao = new Pessoa();
 //declaração do objeto
        Pessoa qualquer;
        //instanciação de objeto
        qualquer = new Pessoa();
        //Definição do formato de pessoa qualquer
        qualquer.nome="Rita";
        qualquer.sobrenome="Lee";
        qualquer.falar();
        //Criar novos objetos
        //declarar objetos
        Pessoa rainha;
        //Instanciar objetos
        rainha = new Pessoa();
        // definir forma do objeto
        rainha.nome ="Tina";
        rainha.sobrenome="Turnner";
        //Definir comportamento do objeto
        rainha.falar();
        System.out.println(rainha.falar("alto"));
        rainha.comer();
    }
}