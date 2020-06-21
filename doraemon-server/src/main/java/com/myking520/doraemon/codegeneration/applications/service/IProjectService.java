package com.myking520.doraemon.codegeneration.applications.service;

import com.myking520.doraemon.codegeneration.interfaces.dto.project.input.ProjectAddDTO;
import com.myking520.doraemon.codegeneration.interfaces.dto.project.output.ProjectEditDTO;

public interface IProjectService {
    public void add(ProjectAddDTO projectAddDTO);
    void edit(ProjectEditDTO projectEditDTO);
}
