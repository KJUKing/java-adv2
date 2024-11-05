package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {
    public static void main(String[] args) {

        Class<BasicData> htlloClass = BasicData.class;

        System.out.println("==== methods() ====");
        Method[] methods = htlloClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("==== declared methods() ====");
        Method[] declaredMethods = htlloClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("methods = " + method);
        }
    }
}
