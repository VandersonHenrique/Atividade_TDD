public class Teste_senha {

    
    public static boolean validar(String senha) {
        if (senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres");
            return false;
        }
        return true;
    }
}