package poo_9;
public class Mamiferos extends Animal{
       private String corpelo;
    public void locomover() {
        System.out.println("andando");
    }

    public void emitirsom() {
        System.out.println("gritando");
    }

    public void alimentar() {
        System.out.println("onivoros");
    }

    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
}
