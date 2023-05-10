package pl.javastart.validationtask;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = CustomValidator.class)
@Target({FIELD})
@Retention(RUNTIME)
public @interface CustomConstraint {

    String message() default "Hasło musi zawierać min. 1 znak mały, duży i znak specjalny";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
