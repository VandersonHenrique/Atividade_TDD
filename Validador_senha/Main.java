public class Main{
    public static void main(String[] args) {

        String senha1 = "mypass";
        String senha2 = "Myp12!";
        String senha3 = "MypassMypass!";
        String senha4 = "mypassmypass12!";
        String senha5 = "MypassMypass12";
        String senha6 = "MypassMypass12!";

        System.out.println("Teste de senha que não segue nenhum dos requisitos:");
        if (Teste_senha.validar(senha1)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        System.out.println("Teste de senha que possui menos de 8 caracteres:");
        if (Teste_senha.validar(senha2)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        System.out.println("Teste de senha que não possui 2 dígitos:");
        if (Teste_senha.validar(senha3)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        System.out.println("Teste de senha que não possui letra maiúscula:");
        if (Teste_senha.validar(senha4)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        System.out.println("Teste de senha que não possui caractere especial:");
        if (Teste_senha.validar(senha5)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
        System.out.println("Teste de senha que segue todos os requisitos:");
        if (Teste_senha.validar(senha6)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
        
    }
}