package poo_5;
public class ControleRemoto implements controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;   

    public void Construtor(){
        this.volume=10;
        this.ligado=false;
        this.tocando=false;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(){
        this.ligado=true;
    }
    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(){
        this.tocando=true;
    }
    public void setVolume(int num){
        this.volume=num;
    }
    public int getVolume(){
        return this.volume;
    }
    @Override
    public void ligar() {
          setLigado();
    }
    @Override
    public void desligar() {
        setLigado();
    }
    @Override
    public void abrirmenu() {
       System.out.println("ligado= "+getLigado());
       System.out.println("tocando= "+getTocando());
       System.out.println("volume= "+getVolume());
    }
    @Override
    public void fecharmenu() {
       System.out.println("Fechando menu...");
    }
    @Override
    public void maisvolume() {
          if(this.getLigado()==true){
              this.setVolume(this.getVolume()+1);
          }
    }
    @Override
    public void menosvolume() {
          if(this.getLigado()){
              this.setVolume(this.getVolume()-1);
          }
    }
    @Override
    public void play() {
        this.ligado=true;
    }
    @Override
    public void stop() {
       this.ligado=false;
    }
}
