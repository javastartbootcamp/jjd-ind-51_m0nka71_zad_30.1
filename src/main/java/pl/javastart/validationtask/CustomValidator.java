package pl.javastart.validationtask;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomValidator implements ConstraintValidator<CustomConstraint, String> {
    @Override
    public void initialize(CustomConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidator) {
        return password != null && (password.length() > 8) && (password.matches("[A-Z]")) &&
                (password.matches("[a-z]")) && (password.matches("[^a-z0-9]"));
    }
}
