package com.kingnetdc.dataplatform.service.model;

import java.lang.*;
/**
 * Created by zhoujiongy on 2016/9/6.
 */
public enum Period {
    MINUTE("MINUTE"),
    HOUR("HOUR"),
    DAY("DAY"),
    WEEK("WEEK"),
    MONTH("MONTH");

    private final String value;

    private Period(String v) {
        this.value = v;
    }

    public String toString() {
        return this.value;
    }

    public static Period get(int v) {
        String str = String.valueOf(v);
        return get(str);
    }

    public static Period get(String str) {
        for (Period e : values()) {
            if(e.toString().equals(str)) {
                return e;
            }
        }
        return null;
    }
}
