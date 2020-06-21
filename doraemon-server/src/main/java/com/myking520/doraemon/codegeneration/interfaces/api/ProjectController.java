package com.myking520.doraemon.codegeneration.interfaces.api;

import com.myking520.doraemon.codegeneration.infrastructure.result.ApiResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @GetMapping("/save")
    public ApiResult save(){
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
