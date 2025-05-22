package passwordValidatorTdd;

import java.util.List;

public class PasswordValidatorTdd {

    public static ValidationResult validatePassword(String senha) {
        return null; 
    }

    public static class ValidationResult {
        public boolean isPasswordValid() {
            return false;
        }

        public List<String> getErrorMessages() {
            return null;
        }
    }
}
