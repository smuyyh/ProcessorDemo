package com.yuyh.inject;

import android.app.Activity;

/**
 * @author yuyuhang.
 * @since 2017/8/22.
 */
public class ViewInject {

    public static void inject(Activity activity) {
        inject(activity, activity);
    }

    public static void inject(Object host, Object root) {
        Class<?> clazz = host.getClass();
        String proxyClassFullName = clazz.getName() + "$$ViewInjector";
        try {
            Class<?>  proxyClazz = Class.forName(proxyClassFullName);
            ViewInjector viewInjector = (ViewInjector) proxyClazz.newInstance();
            viewInjector.inject(host, root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
