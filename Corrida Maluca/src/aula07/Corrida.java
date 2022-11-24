package aula07;

import java.util.Random;

public class Corrida {
    //tributos
    private Corredor desafiado;
    private Corredor desafiante;
    private int voltas;
    private boolean aprovada;
    
    //metodos publicos
    public void marcarCorrida(Corredor c1, Corredor c2){
        if(c1.getCategoria().equals(c2.getCategoria())
              && c1 != c2){
            this.aprovada=true;
            this.desafiado=c1;
            this.desafiante=c2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
        
    }
    public void correr(){
        if (this.aprovada){
            System.out.println("$$$ Desafiado $$$");
            this.desafiado.apresentar();
            System.out.println("$$$ Desafiante $$$");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("==============RESULTADO DA CORRIDA===========");
            switch(vencedor){
                case 0: //empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarCorrida();
                    this.desafiante.empatarCorrida();
                    break;
                case 1: //desafiado vence
                    System.out.println("Vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharCorrida();
                    this.desafiante.perderCorrida();
                    break;
                case 2://desafiante vence
                    this.desafiado.perderCorrida();
                    this.desafiante.ganharCorrida();
            }
        }else{
            System.out.println("A corrida nao pode acontecer!");
        }
        System.out.println("===========================================");

    }
    
    //metodos especiais

    public Corredor getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Corredor desafiado) {
        this.desafiado = desafiado;
    }

    public Corredor getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Corredor desafiante) {
        this.desafiante = desafiante;
    }

    public int getVoltas() {
        return voltas;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
