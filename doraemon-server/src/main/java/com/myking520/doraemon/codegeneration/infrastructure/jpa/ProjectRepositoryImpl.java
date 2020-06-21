package com.myking520.doraemon.codegeneration.infrastructure.jpa;

import com.myking520.doraemon.codegeneration.domain.project.IProjectRepository;
import com.myking520.doraemon.codegeneration.domain.project.entity.Project;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {
    @Override
    public Project save(Project project) {
        return null;
    }
}
