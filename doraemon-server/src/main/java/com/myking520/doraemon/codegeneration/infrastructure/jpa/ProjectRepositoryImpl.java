package com.myking520.doraemon.codegeneration.infrastructure.jpa;

import com.myking520.doraemon.codegeneration.domain.project.IProjectRepository;
import com.myking520.doraemon.codegeneration.domain.project.entity.Project;
import com.myking520.doraemon.codegeneration.infrastructure.jpa.po.ProjectPO;
import com.myking520.doraemon.codegeneration.infrastructure.mapper.MapperObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {
    @Autowired
    private IProjectJapRepository projectJapRepository;
    @Autowired
    private MapperObject objectMapper;
    @Override
    public Project save(Project project) {
        ProjectPO projectPO= objectMapper.map(project, ProjectPO.class);
        projectJapRepository.save(projectPO);
       return objectMapper.map(projectPO,Project.class);
    }
}
