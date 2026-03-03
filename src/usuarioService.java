import java.util.ArrayList;

public class usuarioService {

    private ArrayList<usuario> usuarios = new ArrayList<>();//como o sistema nao tem banco de dados usei arrayList
    public void cadastroUsuario(String nome, String email, String cpf, String dataNascimento, String senha) {//utiliza void porque não devolve informação
        usuarios.add(new usuario(nome, email, cpf, dataNascimento, senha));//adiciona no arraylist
        System.out.println("Usuario cadastrado com sucesso!");
    }
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("\n⚠ Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n=========================== LISTA DE USUÁRIOS ===========================");
        System.out.printf("%-5s %-30s %-35s %-18s %-15s\n",
                "ID", "NOME", "EMAIL", "CPF", "NASCIMENTO");

        System.out.println("---------------------------------------------------------------------------");

        for (usuario u : usuarios) {
            System.out.printf("%-5d %-30s %-35s %-18s %-15s\n",
                    u.getId(),
                    u.getNome(),
                    u.getEmail(),
                    u.getCpf(),
                    u.getDataNascimento());
        }

        System.out.println("===========================================================================\n");
    }
    public usuario buscarPorEmail(String email) {//busca na lista os dados relacionado ao email e o retorna
        for (usuario i : usuarios) {
            if (i.getEmail().equals(email)) {
                return i;
            }
        }
        return null;
    }
    public boolean remover(int id){//busca na lista os dados relacionado ao id e remove
        for (usuario i : usuarios) {
            if (i.getId()==id){
                usuarios.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean login(String email, String senha) {
        usuario u = buscarPorEmail(email);
        if (u != null&&u.getSenha().equals(senha)) {//se o email estiver na lista e a senha estiver relacionada ao email retorna true
            return true;
        }
        return false;
    }
}
