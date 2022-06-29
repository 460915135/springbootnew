package com.yu.springbootnew.bean;

public class Result {
    private Integer status;
    private String node;

    public Result(Integer status, String node) {
        this.status = status;
        this.node = node;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }
}
