package no.bekk.bekkopen.banking.annotation;

import no.bekk.bekkopen.banking.KidnummerValidator;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, TYPE_USE, TYPE_PARAMETER, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = KidnummerValidator.class)
public @interface Kidnummer {

    String message() default "Invalid KID";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
