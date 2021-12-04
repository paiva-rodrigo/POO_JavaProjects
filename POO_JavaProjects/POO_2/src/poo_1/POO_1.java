package poo_1;
public class POO_1 {
    public static void main(String[] args) {
       Caneta c1=new Caneta();
       c1.tampar();
       c1.rabiscar();
       c1.status();//embora que a variavel tampada seja private as funções tampar e destampar não sao e isso a faz mudar//
       c1.destampar();
       c1.rabiscar();
}
