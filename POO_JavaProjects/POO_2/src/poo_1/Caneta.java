package poo_1;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Uma caneta comum "+this.cor);
        System.out.println("Ela esta tampada?  "+this.tampada);
        System.out.println("Uma caneta de ponta "+this.ponta);
    }
    public void rabiscar(){
        if(this.tampada==true){
            System.out.println("Posso rabiscar");
        }
        else{
             System.out.println("Nao posso rabiscar");
        }
    }
    public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada=false;
    }
}

