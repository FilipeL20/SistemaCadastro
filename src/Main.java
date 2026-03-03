import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        usuarioService usuario = new usuarioService();

        int opcao;

        do {
            System.out.println("\n==================================");
            System.out.println("        SISTEMA DE USUÁRIOS       ");
            System.out.println("==================================");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Login");
            System.out.println("4 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.println("==================================");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=========== CADASTRO ===========");

                    System.out.print("Nome  : ");
                    String nome = input.nextLine();

                    System.out.print("Email : ");
                    String email = input.nextLine();

                    System.out.print("Cpf : ");
                    String cpf = input.nextLine();

                    System.out.println("Data de nascimento : ");
                    String dataNasc = input.nextLine();

                    System.out.print("Senha : ");
                    String senha = input.nextLine();

                    usuario.cadastroUsuario(nome, email, cpf, dataNasc, senha);

                    System.out.println("================================");

                    break;

                case 2:
                    usuario.listarUsuarios();
                    break;

                case 3:
                    System.out.println("\n============= LOGIN =============");

                    System.out.print("Email : ");
                    email = input.nextLine();

                    System.out.print("Senha : ");
                    senha = input.nextLine();

                    if (usuario.login(email, senha)) {
                        System.out.println("\n✅ Login realizado com sucesso!");
                    } else {
                        System.out.println("\n❌ Email ou senha inválidos.");
                    }

                    System.out.println("=================================");
                    break;

                case 4:
                    System.out.println("\n=========== REMOVER ===========");

                    System.out.print("ID do usuário: ");
                    int id = input.nextInt();
                    input.nextLine();
                    if (usuario.remover(id)) {
                        System.out.println("\n✅ Usuário removido!");
                    } else {
                        System.out.println("\n❌ Usuário não encontrado.");
                    }
                    System.out.println("================================");
            }

        } while (opcao != 0);
            input.close();
    }
}