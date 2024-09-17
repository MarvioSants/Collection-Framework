import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
            
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int ObterTotalTarefas(){
        return tarefaList.size();
    }

    public void ObterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero de elementos é: " +listaTarefa.ObterTotalTarefas());
        
        listaTarefa.adicionarTarefa("tarefa de análise 2");
        listaTarefa.adicionarTarefa("tarefa de análise 2");
        listaTarefa.adicionarTarefa("tarefa de análise 3");

        System.out.println("O numero de tarefas é: "+listaTarefa.ObterTotalTarefas());

        listaTarefa.removerTarefa("tarefa de análise 2");
        System.out.println("O numero de tarefas após ser removido é: "+listaTarefa.ObterTotalTarefas());

        listaTarefa.ObterDescricaoTarefas();

    }

}
