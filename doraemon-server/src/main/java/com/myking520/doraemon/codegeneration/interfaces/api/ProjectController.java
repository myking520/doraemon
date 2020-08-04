package com.myking520.doraemon.codegeneration.interfaces.api;

import com.myking520.doraemon.codegeneration.applications.service.IProjectService;
import com.myking520.doraemon.codegeneration.interfaces.dto.project.input.ProjectAddDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.myking520.doraemon.codegeneration.interfaces.dto.ApiResult;
@RestController()
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private IProjectService projectService;
    @PostMapping("/save")
    public ApiResult save(@RequestBody  ProjectAddDTO projectAddDTO){
        projectService.add(projectAddDTO);
        return ApiResult.sucess();
    }
    @PatchMapping("/update")
    public ApiResult update(){
        return ApiResult.sucess();
    }
    @GetMapping("/{id}")
    public ApiResult findById(@PathVariable("id") String id){
        return ApiResult.sucess();
    }
    @PostMapping("/search")
    public ApiResult list(){
        return ApiResult.sucess();
    }
}
