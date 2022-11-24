package aula07;
public class Corredor {
    //atributos
    private String nome;
    private String nacionalidade;
    private String carro;
    private int velocidade;
    private String categoria;
    private int vitorias, derrotas, empates;
    //metodos publicos
    public void apresentar (){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Aqui estao agora os volantes mais birutas do mundo, para realizar mais uma corrida maluca!");
        System.out.println("Eles estao se alinhando neste momento!");
        System.out.println("No carro esta: "+this.getNome());
        System.out.println("Diretamente de: "+this.getNacionalidade());
        System.out.println("Com o carro: "+this.getCarro());
        System.out.println("No recorde de: "+ this.getVelocidade()+"Km.");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }
    public void status(){
        System.out.println(this.getNome()+" e um carro "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
    }
    public void ganharCorrida(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderCorrida(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarCorrida(){
        this.setEmpates(this.getEmpates()+1);
    }
    //Metodos Especiais

    public Corredor(String no, String na, String cr, int vl, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.carro = cr;
        this.setVelocidade(vl);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.velocidade <0){
            this.categoria="Parado";
        }else if (this.velocidade <= 70){
            this.categoria = "Lento";
        }else if (this.velocidade <= 120){
            this.categoria = "Rapido";
        }else{
            this.categoria = "Veloz e Furioso!!!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
}
