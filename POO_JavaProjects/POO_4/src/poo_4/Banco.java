package poo_4;
public class Banco {
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public String getDono(){  
        return this.dono;
    }
    public void SetDono(String n){  
         this.dono=n;
    }
    public void SetTipo(String n){  
         this.tipo=n;
    }
    public void Setstatus(boolean n){  
         this.status=n;
    }
    public void Setsaldo(float ff){  
         this.saldo=ff;
    }
    public void status(){
        System.out.println("DADOS:");
        System.out.println("numero: "+this.numconta);
        System.out.println("tipo: "+this.tipo);
        System.out.println("dono: "+this.dono);
        System.out.println("saldo: "+this.saldo);
        System.out.println("satus: "+this.status);
    }
    public void abrirconta(String s,String t,boolean f,float sa){//sera a construct//
        SetDono(s);
        SetTipo(t);
        Setstatus(f);
        Setsaldo(sa);
        status();
    }
    public void fecharconta(){
        if(this.status==true){
            if(this.saldo<=0){
            System.out.println("A conta esta aberta e nao pode ser fechada pois ha um saldo negativo");
            }
            else if(this.saldo>=0){
                System.out.println("A conta esta aberta e nao pode ser fechada pois ha um saldo positivo");
            }
            else{
                  System.out.println("A conta esta aberta e foi fechada");
                  this.status=false;
            }
        }
        else{
            System.out.println("A conta ja esta fechada");
        }
    }
    public void depositar(float valor){
        this.saldo=this.saldo+valor;
        status();
    }
    public void sacar(float valor){
        this.saldo=this.saldo-valor;
        status();
    }
    public void pagarmensal(float valor){
        this.saldo=this.saldo-valor;
        status();
    }
}
