package poo_7;
public class POO_7 {
    public static void main(String[] args) {
        aluno a1=new aluno();
        aluno a2=new aluno();//filhos
        Pessoas a3=new Pessoas();//mae
        
        a1.setNome("Rodrigo1");
        a2.setNome("Rodrigo2");
        a3.setNome("Rodrigo3");
        a1.setCurso("telecom");
        a2.setCurso("Meca");
        //a3.Setcurso() nao tem curso em pessoas
        System.out.println(a1.getNome());
        System.out.println(a3.getNome());
        
    }   
}
