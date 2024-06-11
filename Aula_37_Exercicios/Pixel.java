
package Aula_37_Exercicios;

public class Pixel extends Ponto{
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Pixel(){
        super();
        cor = "preta";
        
    }
    
    public Pixel(int x, int y){
        super(x,y);
        
        cor = "preta";
    }
    public Pixel (int x, int y, String cor){
        super(x,y);
        this.cor = cor;
        
    }
    
}
