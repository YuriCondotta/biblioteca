import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
     Locacao locacao = new Locacao();
     int opcao;
     do {
         System.out.println("1 - Cadastrar funcionário ");
         System.out.println("2 - Cadastrar usuário");
         System.out.println("3 - Cadastrar livro");
         System.out.println("4 - Mostrar todos os dados do cadastro");
         System.out.println("5 - Ir para a locação");
         System.out.println("0 - Sair");
         System.out.println("Digite aqui a opção");
         opcao = scanner.nextInt();

         switch(opcao){
             case 1:
                 scanner.nextLine();
                 System.out.println("seja bem vindo cadastro do funcionario");
                 System.out.println("digite seu nome");
                 locacao.getFuncionario().setNome(scanner.next());
                 System.out.println("digite seu cpf");
                 locacao.getFuncionario().setCpf(scanner.nextInt());
                 System.out.println("digite seu cargo");
                 locacao.getFuncionario().setCargo(scanner.next());
                 System.out.println("digite seu salario");
                 locacao.getFuncionario().setSalario(scanner.nextInt());
                 System.out.println("digite sua rua");
                 locacao.getFuncionario().getEndereco().setRua(scanner.next());
                 System.out.println("digite seu bairro");
                 locacao.getFuncionario().getEndereco().setBairro(scanner.next());
                 System.out.println("digite o numero da casa");
                 locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                 break;
             case 2:
                 System.out.println("cadastro de usuario");
                 break;
             case 3:
                 System.out.println("cadastro de livro");
                 break;
             case 4:
                 System.out.println("Mostrar todos os dados do cadastro");
                 break;
             case 5:
                 System.out.println("Ir para a locacao");
                 break;
             default:
                 System.out.println("Invalido");
                 break;
         }
     } while (opcao!=0);


    }
}