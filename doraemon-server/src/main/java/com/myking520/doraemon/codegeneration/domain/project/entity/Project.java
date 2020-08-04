package com.myking520.doraemon.codegeneration.domain.project.entity;

import java.time.Instant;

/**
 * 实体对象。充血模型。
 * 领域实体的业务逻辑尽可能的不暴露在外界
 */
public class Project {
    private Long id;
    private String name;
    private String mark;
    private Instant createTime;
    private Instant updateTime;
    private Long userId;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


}
