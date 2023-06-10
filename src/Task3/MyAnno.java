package Task3;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnno {
    String name = "Taras Zozulenko";
    int age = 28;
    String message = "Created just once with trying to understend what is this";
}
