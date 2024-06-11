
package Aula_37_Exercicios;

public class Circulo  {
    private int raio; 
    Ponto ponto;

    public int getRaio() {

        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public Circulo(){
        this.ponto = new Ponto();
        raio = 1;
        
    }
    public Circulo(Ponto ponto, int raio){
       this.ponto = ponto;
        this.raio = raio;
    }
     public Circulo(int x, int y, int raio){
       this.ponto = new Ponto(x,y);
        this.raio = raio;
    }
    public void Desenhar(){
        System.out.println(ponto.getX());
        System.out.println(ponto.getY());
        System.out.println(raio);        
    }
    
}
