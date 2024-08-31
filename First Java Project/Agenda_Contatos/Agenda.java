import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//essas importações me permitem adquirir as funções de Array, List e Scanner utilizadas no código.

public class Agenda {
    private List<Contato> contatos;
//aqui é declarado uma lista privada chamada "contatos" para armezenar objetos do tipo Contato.
    public Agenda(){
        contatos = new ArrayList<>();
//arraylist gera uma estrutura de dados que é dinâmicamente redimensionável, crescendo ou diminuindo com a entrada e saida de dados.
    }
    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
//aqui é um metodo em que recebe um objeto Contato e o adiciona na lista.
    }
    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("Nenhum contato na agenda.");
        //verifica se a lista está vazia. Se estiver, imprime a frase
        } else {
        //se não estiver ele itera cada contato na lista de acordo com seu índice.
            for (int i = 0; i <contatos.size(); i++){
                System.out.println((i + 1) + ". "+ contatos.get(i));
            }
        }
    }
    public void removerContato(int index){
        if (index >= 1 && index <= contatos.size()) {
            contatos.remove(index - 1);
            System.out.println("Contato removido com sucesso.");
        //verifica se o índice está entre os limites da lista, caso sim, remove o contato.
        } else {
            System.out.println("Índice inválido.");
        //caso não esteja dentro dos limites válidos, ele mostra a mensagem de índice inválido.
        }
    }

}
