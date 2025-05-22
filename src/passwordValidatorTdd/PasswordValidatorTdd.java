package passwordValidatorTdd;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidatorTdd {

    public static class ValidationResult {
        private boolean passwordValid;
        private List<String> errorMessages;

        public ValidationResult(boolean passwordValid, List<String> errorMessages) {
            this.passwordValid = passwordValid;
            this.errorMessages = errorMessages;
        }

        public boolean isPasswordValid() {
            return passwordValid;
        }

        public List<String> getErrorMessages() {
            return errorMessages;
        }
    }

    public static ValidationResult validatePassword(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        int qtdDigitos = 0;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isDigit(c)) {
                qtdDigitos++;
            }
        }
        if (qtdDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        boolean temMaiuscula = false;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
                break;
            }
        }
        if (!temMaiuscula) {
            erros.add("A senha deve conter pelo menos uma letra maiúscula");
        }
        
        boolean temEspecial = false;
        if (!temEspecial) {
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        return new ValidationResult(erros.isEmpty(), erros);
    }
}
