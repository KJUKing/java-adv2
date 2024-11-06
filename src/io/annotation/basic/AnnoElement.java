package io.annotation.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AnnoElement {
    String value();
    int count() default 0;
    String[] tags() default {};
    //MyLogger data(); //다른타입은 적용안됨
//    Class<? extends Annotation>[] annoData() default MyLogger.class;
}
