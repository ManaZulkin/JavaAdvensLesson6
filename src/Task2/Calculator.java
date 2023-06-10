package Task2;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculator {

    int num1() default 0;
    int num2() default 0;
}
