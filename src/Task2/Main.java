package Task2;

import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        Calcuation calcuation = new Calcuation();
        Class<?> cl = Calcuation.class;
        try {
            Method method = cl.getDeclaredMethod("addNumbers", int.class, int.class);
            Calculator calc = method.getAnnotation(Calculator.class);
            calcuation.addNumbers(calc.num1(), calc.num2());
            calcuation.multNumbers(calc.num1(), calc.num2());
            calcuation.devNumbers(calc.num1(), calc.num2());
            calcuation.divNumbers(calc.num1(), calc.num2());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

/**
 * Created by Taras Zozulenko
 *
 */
class Calcuation{
    @Calculator(num1 = 5, num2 = 4)
    public void addNumbers(int num1, int num2){
        System.out.println("add result = " + (num1 + num2));
    }
    @Calculator(num1 = 4, num2 = 4)
    public void multNumbers(int num1, int num2){
        System.out.println("multiply result = " + (num1 * num2));
    }
    @Calculator(num1 = 5, num2 = 5)
    public void divNumbers(int num1, int num2){
        System.out.println("division result = " + (num1 / num2));
    }
    @Calculator(num1 = 5, num2 = 5)
    public void devNumbers(int num1, int num2){
        System.out.println("devorce result = " + (num1 - num2));
    }
}