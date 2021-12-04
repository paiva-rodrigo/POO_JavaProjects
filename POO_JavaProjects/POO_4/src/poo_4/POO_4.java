package poo_4;
public class POO_4 {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        b1.abrirconta("Conta 1","tipo1",true,1.0f);
        b1.fecharconta();
        b1.depositar(1000f);
        b1.sacar(1001f);
        b1.fecharconta();
        b1.depositar(1000f);
    }
    
}
