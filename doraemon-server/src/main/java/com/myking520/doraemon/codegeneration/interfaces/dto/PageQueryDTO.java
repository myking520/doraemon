package com.myking520.doraemon.codegeneration.interfaces.dto;

public class PageQueryDTO<T> {
    private int page;
    private long size;
    private T condition;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }
}
