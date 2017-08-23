package com.yuyh.compiler;

import javax.lang.model.type.TypeMirror;

/**
 * @author yuyuhang.
 * @since 2017/8/22.
 */
class InjectViewInfo {

    private int id;

    private String name;

    private TypeMirror type;

    public InjectViewInfo(int id, String name, TypeMirror type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeMirror getType() {
        return type;
    }

    public void setType(TypeMirror type) {
        this.type = type;
    }
}
