
package Aula_37_Exercicios.FabricaDeRObos;
import Aula_37_Exercicios.Ponto;

public class RoboMarciano extends Robo{
    
    public RoboMarciano(){
        
    }
    public void teletransportar (int x, int y){
        getPonto().setX(x);
        getPonto().setY(y);
    }
    public void teletransportar(Ponto novaPosicao){
        setPonto(novaPosicao);
    }
     @Override
    public String toString(){
        return "sou um robo <robomarciano>";
    }
    
}
