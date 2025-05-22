package passwordValidatorTdd;

public class Main {
    public static void main(String[] args) {
        testarSenha("Ab1!");         
        testarSenha("Abcdefg!");    
        testarSenha("abcde12!");     
        testarSenha("Abcde12!");
        testarSenha("Ab1cde");      
    }

    public static void testarSenha(String senha) {
        System.out.println("Testando senha: " + senha);
        PasswordValidatorTdd.ValidationResult resultado = PasswordValidatorTdd.validatePassword(senha);

        if (resultado.isPasswordValid()) {
            System.out.println("Senha válida ✅\n");
        } else {
            System.out.println("Senha inválida ❌");
            resultado.getErrorMessages().forEach(System.out::println);
            System.out.println();
        }
    }
}
