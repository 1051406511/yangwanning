package com.briup.student.webcontroller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Message;
import util.MessageUtil;

import javax.xml.crypto.Data;

@RestController
@Api(description = "学生控制器")
public class studentcontroller {

    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add() {

        return MessageUtil.success("添加学生成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParam(name = "stuID",value = "学号",paramType = "query",dataType = "int")
    public Message delete(int suuID)  {

        return MessageUtil.success("删除学生成功");
}
}

