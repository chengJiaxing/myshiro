package com.jx.comment;

import org.springframework.stereotype.Controller;

/**
 * Created by CHEN JX on 2017/11/11.
 */
public class ControllerResult {

    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";

    private String result;
    private String msg;
    private String url;

    public ControllerResult(){

    }

    public ControllerResult(String result,String msg){
        this.result=result;
        this.msg=msg;
    }



    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static ControllerResult getSuccessResult(String msg){
        return new ControllerResult(SUCCESS,msg);
    }
    public static ControllerResult getFailResult(String msg){
        return new ControllerResult(FAIL,msg);
    }
}
