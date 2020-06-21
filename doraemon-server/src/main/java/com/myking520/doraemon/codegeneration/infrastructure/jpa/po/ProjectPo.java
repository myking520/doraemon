package com.myking520.doraemon.codegeneration.infrastructure.jpa.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_project")
@Entity
public class ProjectPo {
    @Id
    private String id;
}
