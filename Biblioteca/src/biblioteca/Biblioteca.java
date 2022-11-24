package biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2]; //novo vetor/lista com 2 pessoas
        Livro[] l = new Livro[3];  //novo vetor/lista com 3 livros 
        
        p[0] = new Pessoa("Matheus", 22, "M");
        p[1] = new Pessoa("Pedro", 14, "M");
        
        l[0] = new Livro("Java Learning", "Douglas M.",900, p[0]);
        l[1] = new Livro ("POO para iniciantes", "Joao L.",456, p[1]);
        l[2] = new Livro ("Coding is very Nice", "Mike T.V.", 700, p[0]);
        
        System.out.println(l[0].detalhes());
        
        l[0].abrir();
        l[0].folhear(200);
        
    }
    
}
