package com.mmb.model;

import lombok.Getter;

/**
 * Created by hubin on 2017/9/15.
 */
@Getter
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
