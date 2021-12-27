package org.xujin.halo.seckill.base;

import lombok.Data;

import java.io.Serializable;

/**
 * 〈〉
 * ResultData
 *
 * @author xujin
 * @date 2021/12/27 下午10:45
 * @since
 */
@Data
public class ResultData<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int code = 200;
    private String msgCode = "200";
    private String msgContent = "success";

    private T data;

    public ResultData() {
    }

    public T getData() {
        return this.data;
    }

    public ResultData<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static <T> ResultData<T> success() {
        ResultData<T> resultData = new ResultData();
        return resultData;
    }

    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData();
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(String msgContent) {
        return (ResultData<T>) fail((Object) null, "500", msgContent);
    }


    private static <T> ResultData<T> fail(T data, String msgCode, String msgContent) {
        ResultData<T> resultData = new ResultData();
        resultData.setData(data);
        resultData.setMsgCode(msgCode);
        resultData.setMsgContent(msgContent);
        return resultData;
    }

    public static <T> ResultData<T> failWithCode(T data, int code, String msgCode, String msgContent) {
        ResultData<T> resultData = new ResultData();
        resultData.setCode(code);
        resultData.setData(data);
        resultData.setMsgCode(msgCode);
        resultData.setMsgContent(msgContent);
        return resultData;
    }

    @Override
    public String toString() {
        return "Response{code=" + this.getCode() + ", msgCode='" + this.getMsgCode() + "', msgContent='" + this.getMsgContent() + "', data='" + this.data + "'" + '}';
    }

}