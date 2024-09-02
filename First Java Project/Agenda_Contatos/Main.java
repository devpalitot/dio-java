import java.Util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in); //Cria um objeto Scanner para ler a entrada do usuário.
        Agenda agenda = new Agenda(); //Cria um objeto Agenda para armazenar e gerenciar contatos.
        int opcao;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Remover contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //consome o \n após o nextInt()
            //exibição de um menu de opções em um loop
            
            switch(opcao){  //switch é utilizado para determinar uma ação de acordo com a opção escolhida.
              case 1:
                System.out.print("Digite o nome do contato: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o telefone do contato: ");
                String telefone = scanner.nextLine();
                Contato contato = new Contato(nome, telefone);
                agenda.adicionarContato(contato);
                break;
              case 2:
                agenda.listarContatos();
                break;
              case 3:
                agenda.listarContatos();
                System.out.print("Digite o número do contato a ser removido: ");
                int index = scanner.nextInt();
                agenda.removerContato(index);
                break;
              case 4:
                System.out.println("Opção inválida. Tente novamente.");
                break;
            } 
        }
        while (opcao != 4);
         scanner.close(); //scanner é fechado para liberar os recursos
    }
}
