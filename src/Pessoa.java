public class Pessoa {
    //Atributos da pessoas
    public String nome;
    public String sobrenome;
    //Métodos de classe
    public void falar(){
        System.out.println("falei");

    }
  //Sobrecarga do método falar()

    public String falar(String volume){
        return "falei" + volume;
    }

}
