package com.example;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wanganbang on 7/5/16.
 */

@RestController
@RequestMapping("/api/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/show", method= RequestMethod.POST)// 这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，在实际应用中，具体指定请求类型也使接口更为严谨。
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public String show(
            @ApiParam(required=true, name="name", value="姓名")
            @RequestParam(name = "name") String stuName){
        return "success";
    }
}
