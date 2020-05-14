package anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // define para qual elemento essa anotacao servira, exemplos( construtor, variaveis, metodos etc)
public @interface DoublePositivo {

}
