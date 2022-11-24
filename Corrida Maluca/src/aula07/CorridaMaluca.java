package aula07;
public class CorridaMaluca {
    public static void main(String[] args) {
        Corredor c[] = new Corredor[7];
                 
        c[0] =new Corredor("Dick Vigarista", "Franca","Maquina do mal",140, 2,12,3 );
        c[1]= new Corredor("Penelope Charmosa", "Austria","Carrinho pra Frente", 60, 12, 2, 7);
        c[2]= new Corredor("Barao Vermelho", "Alemanha", "Maquina Voadora", 130, 8,5,8);
        c[3]=new Corredor("Irmaos Rocha", "Algum lugar alem do tempo", "Carro de Pedra", 50, 23,5,9);
        c[4]=new Corredor("Dupla Sinistra", "Caverna do alem","Cupe Mal Assombrado", 90,6,4,3);
        c[5]=new Corredor("Tio Tomas e Urso Chorao", "sitio do Tomas", "Carroca a vapor",100,16,4,12);
        c[6]=new Corredor("Janzin F1", "Centro de Manduri", "Ferrari", 240,9,2,4);
        
        Corrida CorridM = new Corrida();
        CorridM.marcarCorrida(c[0], c[0]);
        CorridM.correr();
        //c[0].status();
        //c[6].status();
        
    }
    
}
