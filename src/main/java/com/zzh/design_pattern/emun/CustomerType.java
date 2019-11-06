package com.zzh.design_pattern.emun;

public enum CustomerType {

    NORMAL(0, "普通用户"),

    PLATINUM(1, "白金用户"),

    DUAMOND(2, "钻石用户");

    private int index;

    private String message;

    CustomerType(int index, String message) {
        this.index = index;
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "index=" + this.index +
                ", message='" + this.message + '\'' +
                '}';
    }
}
