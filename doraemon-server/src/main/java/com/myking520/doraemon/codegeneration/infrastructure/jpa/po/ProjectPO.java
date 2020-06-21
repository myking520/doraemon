package com.myking520.doraemon.codegeneration.infrastructure.jpa.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Table(name="tb_project")
@Entity
public class ProjectPO {
    @Id
    private Long id;
    private String name;
    private String mark;
    private Instant createTime;
    private Instant updateTime;
    private Long userId;
}
