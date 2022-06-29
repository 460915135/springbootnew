package com.yu.springbootnew.controller;

import com.yu.springbootnew.bean.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping("add")
    @ResponseBody
    public Result add(){
        return new Result(200,"成功");
    }
}
