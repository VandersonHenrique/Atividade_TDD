public class Teste_senha {

    
    
    public static boolean validar(String senha) {
        
        boolean validacao = true;

        // valida se a senha possui ao menos 8 caracteres
        if (senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres");
            validacao = false;
        }
        // valida se a senha possui ao menos 2 digitos
        if (!possuiDigito(senha)){
            System.out.println("A senha deve conter pelo menos 2 dígitos");
            validacao = false;
        }
        // valida se a senha possui ao menos 1 letra maiuscula
        if (!letraMaiuscula(senha)){
            System.out.println("A senha deve conter pelo menos uma letra maiuscula");
            validacao = false;
        }
        // valida se a senha possui ao menos 1 caractere especial
        if (!senha.matches(".*[^a-zA-Z0-9].*")){
            System.out.println("A senha deve conter pelo menos um caractere especial");
            validacao = false;
        }
        return validacao;
    }

    public static boolean possuiDigito(String senha){
        int contador = 0;

        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                contador++;
                if (contador >= 2) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean letraMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

}