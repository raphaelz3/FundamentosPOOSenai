package tarefa;

public class Tarefa implements Concluivel{
    private String descricao;
    private boolean concluida = false;
    private int prioridade;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void concluir() {
        if(!concluida)
            concluida = true;
        else
            concluida = false;
    }

    @Override
    public boolean estaConcluida() {
        return concluida;
    }

    public void adicionarPrioridade(int prioridade){
        if(prioridade >= 1 && prioridade <= 5)
            this.prioridade = prioridade;

    }

    public void exibirStatus(){
        System.out.println("Descricao: " + descricao);
        System.out.println("Status: " + concluida);
        System.out.println("Prioridade: " + prioridade);
    }
}
