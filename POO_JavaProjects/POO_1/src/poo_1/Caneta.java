package poo_1;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta comum "+this.cor);
        System.out.println("Ela esta tampada?  "+this.tampada);
        System.out.println("Uma caneta de ponta "+this.ponta);
    }
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("Posso rabiscar");
        }
        else{
             System.out.println("Nao posso rabiscar");
        }
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada=false;
    }
}

