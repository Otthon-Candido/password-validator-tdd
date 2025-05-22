package passwordValidatorTdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class passwordValidatorTddTest {

	@Test
    public void shouldReturnErrorForPasswordWithLessThan8Characters() {
		PasswordValidatorTdd.ValidationResult result = PasswordValidatorTdd.validatePassword("Ab1!");
        assertFalse(result.isPasswordValid());
        assertTrue(result.getErrorMessages().contains("A senha deve ter pelo menos 8 caracteres"));
    }

    @Test
    public void shouldReturnErrorForPasswordWithLessThan2Digits() {
    	PasswordValidatorTdd.ValidationResult result = PasswordValidatorTdd.validatePassword("Abcdefg!");
        assertFalse(result.isPasswordValid());
        assertTrue(result.getErrorMessages().contains("A senha deve conter pelo menos 2 dígitos"));
    }

    @Test
    public void shouldReturnErrorForPasswordWithoutUppercaseLetter() {
    	PasswordValidatorTdd.ValidationResult result = PasswordValidatorTdd.validatePassword("abcde12!");
        assertFalse(result.isPasswordValid());
        assertTrue(result.getErrorMessages().contains("A senha deve conter pelo menos uma letra maiúscula"));

    }
    
    @Test
    public void shouldReturnErrorForPasswordWithoutSpecialCharacter() {
        PasswordValidatorTdd.ValidationResult result = PasswordValidatorTdd.validatePassword("Abcdef12");
        assertFalse(result.isPasswordValid());
        assertTrue(result.getErrorMessages().contains("A senha deve conter pelo menos um caractere especial"));
    }
	
    @Test
    public void shouldReturnErrorForPasswordWithaMorThan12Characters() {
	PasswordValidatorTdd.ValidationResult result = PasswordValidatorTdd.validatePassword("Ab1cfcfffgfgs!");
        assertFalse(result.isPasswordValid());
        assertTrue(result.getErrorMessages().contains("A senha deve ter menos de 12 caracteres"));
    }
}
