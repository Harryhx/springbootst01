package com.harryst.entity;

import org.springframework.data.annotation.*;

import javax.persistence.*;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by harryhx on 2019/11/14.
 */
@Entity
@Table(name="t_logger_infos")
public class LoggerEntity {
    //编号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ali_id")
    private Long id;
    //客户端请求IP
    @Column(name="ali_client_ip")
    private String clientIp;
    //客户端请求路径
    @Column(name="ali_uri")
    private String uri;
    //终端请求方式，普通请求，ajax请求
    @Column(name="ali_type")
    private String type;
    //请求方式method ，post,get等
    @Column(name="ali_method")
    private String method;
    //请求参数内容,json
    @Column(name="ali_param_data")
    private String paramData;
    //请求接口唯一session标识
    @Column(name="ali_session_id")
    private String sessionId;
    //请求时间
    @Column(name="ali_time",insertable = false)
    private Timestamp time ;
    //接口返回时间
    @Column(name="ali_return_time")
    private String returnTime;
    //接口返回数据json
    @Column(name="ali_return_data")
    private String returnData;
    //请求时httpStatusCode代码,如:200,400,404等
    @Column(name="ali_http_status_code")
    private String httpStatusCode;
    //请求耗时秒单位
    @Column(name="ali_time_consuming")
    private int timeConsuming;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoggerEntity)) return false;

        LoggerEntity that = (LoggerEntity) o;

        if (timeConsuming != that.timeConsuming) return false;
        if (!id.equals(that.id)) return false;
        if (clientIp != null ? !clientIp.equals(that.clientIp) : that.clientIp != null) return false;
        if (uri != null ? !uri.equals(that.uri) : that.uri != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (paramData != null ? !paramData.equals(that.paramData) : that.paramData != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (returnTime != null ? !returnTime.equals(that.returnTime) : that.returnTime != null) return false;
        if (returnData != null ? !returnData.equals(that.returnData) : that.returnData != null) return false;
        return httpStatusCode != null ? httpStatusCode.equals(that.httpStatusCode) : that.httpStatusCode == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (clientIp != null ? clientIp.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (paramData != null ? paramData.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (returnTime != null ? returnTime.hashCode() : 0);
        result = 31 * result + (returnData != null ? returnData.hashCode() : 0);
        result = 31 * result + (httpStatusCode != null ? httpStatusCode.hashCode() : 0);
        result = 31 * result + timeConsuming;
        return result;
    }

    @Override
    public String toString() {
        return "LoggerEntity{" +
                "id=" + id +
                ", clientIp='" + clientIp + '\'' +
                ", uri='" + uri + '\'' +
                ", type='" + type + '\'' +
                ", method='" + method + '\'' +
                ", paramData='" + paramData + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", time=" + time +
                ", returnTime='" + returnTime + '\'' +
                ", returnData='" + returnData + '\'' +
                ", httpStatusCode='" + httpStatusCode + '\'' +
                ", timeConsuming=" + timeConsuming +
                '}';
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public int getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(int timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

}
