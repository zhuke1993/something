package com.zhuke.something.spring.mvc;

import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

/**
 * Created by ZHUKE on 2016/9/27.
 */
public class Spittle {
    @Null
    @Size(max = 1)
    private String id;
    @Null
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Spittle{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
