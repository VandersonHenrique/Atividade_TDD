public class Main{
    public static void main(String[] args) {
        String senha = "abc123";
        String senha2 = "abc12345678";


        if (Teste_senha.validar(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        if (Teste_senha.validar(senha2)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
    }
}