package de.rieckpil.learning;

import javax.enterprise.context.NormalScope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Documented
@NormalScope(passivating = false)
@Target({FIELD, TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScoped {
}
