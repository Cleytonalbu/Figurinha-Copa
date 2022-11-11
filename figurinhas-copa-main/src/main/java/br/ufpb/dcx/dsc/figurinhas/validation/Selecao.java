package br.ufpb.dcx.dsc.figurinhas.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SelecaoValidator.class)
@Documented
public @interface Selecao {
    String message() default "{Selecao.invalid}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}