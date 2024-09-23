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
    
}
