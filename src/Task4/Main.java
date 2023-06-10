package Task4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        MathHendler mathHendler = new MathHendler();
        Class<?> cl = MathHendler.class;
        Method method;

        {
            try {
                method = cl.getDeclaredMethod("addNum", int.class, int.class);
                Math math = method.getAnnotation(Math.class);
                System.out.println("Result = " + mathHendler.addNum(math.num1(), math.num2()));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MathHendler{
    @Math(num1 = 100, num2 = 200)
    public int addNum(int num1, int num2){
        return num1 + num2;
    }
}