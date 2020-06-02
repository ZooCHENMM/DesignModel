package com.chen;

public class ProtoType implements Cloneable{

    private int id;
    private String name;
    private AccProtoType accProtoType;
    public ProtoType(){};

    public Object clone() throws CloneNotSupportedException {
        return  (ProtoType)super.clone();
    }
}
