package ch12.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})           // 적용대상 : 매서드에 적용
@Retention(RetentionPolicy.RUNTIME)     // 유지정책 : 실행 할 때마다 적용
public @interface PrintAnnotaion {
    String value() default "-"; // value 속성 : 선의 종류
    int number() default 15;    // number 속성 : 출력 횟수
}
