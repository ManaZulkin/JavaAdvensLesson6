package Task3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Native;

public class Three extends Two{
    @Deprecated
    public void method(){
        System.out.println("Class 3");
    }
}
