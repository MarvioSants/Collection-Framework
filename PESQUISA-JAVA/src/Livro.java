public class Livro {

    //atributos (características) do livrp
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //objeto do tipo Livro
    public Livro(String titulo, String autor, int anoPublicacao){

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //método contrutor 
    public String getTitulo(){
        return titulo;
    }
    public String getAutot(){
        return autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    @Override
    public String toString() {
        return "Livro {"+
        "Titulo = '" +titulo+ '\''+
        ", 'Autor = " +autor+ '\'' +
        ", Ano de Publicacao = "+anoPublicacao +'}';
    }
    public static void main(String[] args) {
        Livro livro = new Livro("Java para iniciantes", "Herbert Schildt", 2015);
        System.out.println(livro.toString());
    }
}
