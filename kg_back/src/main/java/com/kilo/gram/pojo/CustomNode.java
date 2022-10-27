package com.kilo.gram.pojo;

public class CustomNode {
//    这个id 是名字，不是Long型
    private String id;
//    区分颜色
    private int group;
    private Object obj;


    public CustomNode(String id, int group, Object obj) {
        this.id = id;
        this.group = group;
        this.obj = obj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
