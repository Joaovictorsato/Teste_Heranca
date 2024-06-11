
package Aula_37_Exercicios.FabricaDeRObos;


public class DemandaRobos {
    public static void main (String[]args){
        RoboMarciano marciano = new RoboMarciano();
        System.out.println(marciano.toString());
        RoboPlutoniano plutoniano = new RoboPlutoniano();
        System.out.println(plutoniano.toString());
        RoboSolar solar = new RoboSolar();
         System.out.println(solar.toString());
    }
}
