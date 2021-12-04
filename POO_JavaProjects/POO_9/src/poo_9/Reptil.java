package poo_9;
public class Reptil extends Animal{
   private String corescama;
    public void locomover() {
        System.out.println("rastejando");
    }

    public void emitirsom() {
        System.out.println("cochoalando");
    }

    public void alimentar() {
        System.out.println("carnivoros");
    }

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
