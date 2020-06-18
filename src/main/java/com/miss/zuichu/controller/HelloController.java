package com.miss.zuichu.controller;

import com.miss.zuichu.vo.req.HelloReqVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "测试模块",description = "测试模块相应接口")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "模块Hello测试")
    public HelloReqVo hello(@RequestBody HelloReqVo vo) {
        HelloReqVo helloReqVo = new HelloReqVo();
        helloReqVo.setName("zuiChu");
        helloReqVo.setAge("26");
        return helloReqVo;
    }

}
