package no.bekk.bekkopen.person.annotation;

import no.bekk.bekkopen.person.FodselsnummerValidator;

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
@Constraint(validatedBy = FodselsnummerValidator.class)
public @interface Fodselsnummer {

    String message() default "Invalid fødselsnummer";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
