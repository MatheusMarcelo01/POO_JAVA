package biblioteca;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //constructor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    //status
    public void status(){
        System.out.println("Ola "+getNome()+" que bom velo na biblioteca denovo");
        System.out.println("Vi que tem "+getIdade()+ " anos");
        System.out.println("E como toda "+getSexo()+" deve gostar destes livros");
        System.out.println("De uma olhada na plateleira 7b");
    }
    //metodos 
    public void fazerAniver(){
        this.idade = this.idade+1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
