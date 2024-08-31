
public class Contato {
    private String nome;
    private String telefone;
//private faz com que o conteudo seja unico dessa variavel, permitindo mais segurança nos dados
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
//this permite diferenciar os atributos das classe, nesse caso diferenciando a (String nome) do valor (This nome)
    }
    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    @Override //@Override permite sobrescrever um método e não criando um novo.
    public String toString(){
        return "Nome: " + nome + ", Telefone: " + telefone;
    }  
    //toString retorna um valor em forma de string  
    //return retorna um valor      
}