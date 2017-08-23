package com.yuyh.inject;

/**
 * @author yuyuhang.
 * @since 2017/8/22.
 */
public interface ViewInjector<T> {

    void inject(T t, Object source);

}
