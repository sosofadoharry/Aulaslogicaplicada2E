public class Pessoa  extends Animal{
    //Atributos da pessoas
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
