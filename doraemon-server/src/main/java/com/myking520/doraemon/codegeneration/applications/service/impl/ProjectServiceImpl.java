package com.myking520.doraemon.codegeneration.applications.service.impl;

import com.myking520.doraemon.codegeneration.applications.service.IProjectService;
import com.myking520.doraemon.codegeneration.domain.project.IProjectRepository;
import com.myking520.doraemon.codegeneration.domain.project.entity.Project;
import com.myking520.doraemon.codegeneration.infrastructure.mapper.MapperObject;
import com.myking520.doraemon.codegeneration.interfaces.dto.project.input.ProjectAddDTO;
import com.myking520.doraemon.codegeneration.interfaces.dto.project.output.ProjectEditDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements IProjectService {
    @Autowired
    private IProjectRepository projectRepository;
    @Autowired
    private MapperObject mapperObject;
    @Override
    public void add(ProjectAddDTO projectAddDTO) {
        Project project= mapperObject.map(projectAddDTO, Project.class);
        projectRepository.save(project);
    }

    @Override
    public void edit(ProjectEditDTO projectEditDTO) {

    }
}
