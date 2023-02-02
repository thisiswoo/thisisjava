package ch12.module;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotaionExample {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = PrintAnnotaionService.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            // PrintAnnotaion 얻기
            PrintAnnotaion pa = method.getAnnotation(PrintAnnotaion.class);

            // 설정 정보를 이용해서 선 출력
            printLine(pa);

            // 메서드 호출
            method.invoke(new PrintAnnotaionService());

            // 설정 정보를 이용해서 선 출력
            printLine(pa);
        }
    }

    public static void printLine(PrintAnnotaion printAnnotaion) {
        if (printAnnotaion != null) {
            // number 속성 값 얻기
            int number = printAnnotaion.number();
            for (int i = 0; i < number; i++) {
                // value 속성 값 얻기
                String value = printAnnotaion.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
