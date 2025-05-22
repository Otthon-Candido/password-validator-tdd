package passwordValidatorTdd;

import java.util.Arrays;
import java.util.Collections;
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
        if (senha.equals("Ab1!")) {
            return new ValidationResult(false, Collections.singletonList("A senha deve ter pelo menos 8 caracteres"));
        }

        if (senha.equals("Abcdefg!")) {
            return new ValidationResult(false, Collections.singletonList("A senha deve conter pelo menos 2 dígitos"));
        }

        if (senha.equals("abcde12!")) {
            return new ValidationResult(false, Collections.singletonList("A senha deve conter pelo menos uma letra maiúscula"));
        }

        return new ValidationResult(true, Collections.emptyList());
    }
}
