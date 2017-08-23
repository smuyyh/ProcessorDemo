package com.yuyh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yuyuhang.
 * @since 2017/8/22.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface InjectView {

    int value() default -1; // View Id
}
