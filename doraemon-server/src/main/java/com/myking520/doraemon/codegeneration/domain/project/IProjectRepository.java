package com.myking520.doraemon.codegeneration.domain.project;

import com.myking520.doraemon.codegeneration.domain.project.entity.Project;

public interface IProjectRepository {
    /**
     * 将实体持久化到仓储中，具体实现交由基础设施层的持久化工具来完成
     * @param project
     */
    Project  save(Project project);
}
