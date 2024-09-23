import java.util.List;
import java.util.ArrayList;


public class CatalogoLivro {
    //atributos: lista de objeto do tipo Livro

    private List <Livro>LivroList;

    public CatalogoLivro() {
        this.LivroList = new ArrayList<>();
    }

    public void AdicionarLivro (String titulo, String autor, int anoPublicacao){
        LivroList.add(new  Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> PesquisarAutor(String autor){
        List<Livro> LivroPorAutor = new ArrayList<>();
        if (!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    LivroPorAutor.add(l);
                }
            }
        }
        return LivroPorAutor;

    }

    public List<Livro>PesquisaPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;

    }
    public Livro PesquisaPorTitulo(String titulo){
        Livro LivroPorTitulo = null;
        if (!LivroList.isEmpty()) {
            for( Livro l : LivroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    LivroPorTitulo = l;
                    break;
                }
            }
        }
        return LivroPorTitulo;
    }

    public static void main(String[] args) {
       CatalogoLivro catalogo = new CatalogoLivro();
       catalogo.AdicionarLivro("Java para iniciantes", "Herbert Schildt", 2015);
       catalogo.AdicionarLivro("Java para iniciantes", "Herbert Stovisk", 2016);
       catalogo.AdicionarLivro("Programação Orientada a Objeto", "Autor Desconhecido", 2010);
       catalogo.AdicionarLivro("Curso em Livro", "Guanabara", 2020);
       catalogo.AdicionarLivro("Vida Util", "Aleatório", 2024);


       //System.out.println(catalogo.PesquisarAutor("Aleatório"));
       //System.out.println(catalogo.PesquisaPorIntervalosAnos(2009, 2024));
       System.out.println(catalogo.PesquisaPorTitulo("Java para iniciantes"));
    }
    
}
