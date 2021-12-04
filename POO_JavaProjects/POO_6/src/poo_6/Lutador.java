package poo_6;
public class Lutador {
    private String nome;
    String nacionalidade;
    String categoria;
    float idade;
    float peso;
    float altura;
    int vitorias;
    int derrotas;
    int empates;
   public void dados(String no,String na,String ca,float id,float pe,float al,int vi,int de,int em){
       this.nome=no;
       this.nacionalidade=na;
       this.categoria=ca;
       this.peso=pe;
       this.idade=id;
       this.altura=al;
       this.vitorias=vi;
       this.derrotas=de;
       this.empates=em;
   }
    public void apresentar(){
        System.out.println("nome: "+this.nome);
        System.out.println("categoria: "+this.categoria);
        System.out.println("idade: "+this.idade);
        System.out.println("peso: "+this.peso);
        System.out.println("altura: "+this.altura);
        System.out.println("vitorias: "+this.vitorias);
        System.out.println("derrotas: "+this.derrotas);
        System.out.println("empates: "+this.empates);
    }
    public void ganhou(){
        this.vitorias++;
    }
    public void perdeu(){
        this.derrotas++;
    }
    public void empatou(){
        this.empates++;
    }
}
