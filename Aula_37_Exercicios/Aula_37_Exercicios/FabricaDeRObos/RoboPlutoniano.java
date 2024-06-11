
package Aula_37_Exercicios.FabricaDeRObos;


public class RoboPlutoniano extends Robo{
    private int balas;
    
    public RoboPlutoniano(){
        balas=100;
    }
    public void atirar(){
        balas --;
        if(balas==0){
            System.out.println("a arma precisa recarregar");
        }
    }
    public void recarregar(int balas){
        this.balas = balas; 
    }
     @Override
    public String toString(){
        return "sou um robo <roboplutoniano>";
    }
}

