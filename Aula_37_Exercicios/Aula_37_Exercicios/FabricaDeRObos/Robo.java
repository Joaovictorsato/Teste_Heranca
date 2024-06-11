
package Aula_37_Exercicios.FabricaDeRObos;

import Aula_37_Exercicios.Ponto;

public abstract class Robo {

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
    private String nome;
    private Ponto ponto;
    
    Robo(){
        nome = " ";
        ponto= new Ponto();
    }
    Robo(String nome, Ponto ponto){
        this.nome = nome;
        this.ponto = ponto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void AndarDireita(){
        ponto.setX(ponto.getX()+1);
    }
    public void AndarEsquerda(){
        ponto.setX(ponto.getX()-1);
    }
    public void AndarCima(){
        ponto.setY(ponto.getY()+1);
    }
    public void AndarBaixo(){
        ponto.setY(ponto.getY()-1);
    }
    public String MostrarPosicao(){
        return "X= "+ponto.getX() + "Y= "+ponto.getY();
    }
    @Override
        public String toString(){
        return "sou um robo <tipo>";
    }
   
}

