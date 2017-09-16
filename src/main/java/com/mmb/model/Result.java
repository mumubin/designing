package com.mmb.model;

import com.google.common.collect.Maps;
import java.util.Map;
import lombok.Data;

/**
 * Created by hubin on 2017/9/15.
 */
@Data
public class Result {
    private String resultCode;

    private String resultMsg;

    private Map<String,Object> data;

    public Result(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }


}
