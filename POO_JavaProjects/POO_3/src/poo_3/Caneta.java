package poo_3;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public void Caneta(){//metodo construtor//
        this.tampar();
        this.cor="Azul";
    }
    public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada=false;
    }
    public String getModelo(){//metodo acessor
        return this.modelo;
    }
    public void SetModelo(String m){//metodo modificador
        this.modelo=m;
    }
    public float GetPonta(){
        return this.ponta;
    }
    public void SetPonta(float p){
        this.ponta=p;
    }
    public void status(){
        System.out.println("Sobre a Caneta");
        System.out.println("Modelo "+this.modelo);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Tampada: "+ this.tampada);
    }
}
