package com.tesquare.base.controller;

import com.tesquare.base.pojo.Label;
import com.tesquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

/**
 * @ProjectName: tensquare_parent53
 * @Package: com.tesquare.base.controller
 * @ClassName: LabelController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 22:32
 * @Version: 1.0
 */
@RestController//Controller和responcebody的结合
@CrossOrigin//跨域调用
@RequestMapping("/laber")
public class LabelController {
    @Autowired
    private LabelService labelService;
    @RequestMapping(method =RequestMethod.GET)
    public Result findAll(){
        return new Result(true,StatusCode.OK,"查询成功");
    }
    @RequestMapping(value="/{labelId}",method =RequestMethod.GET)
    public Result findById(@PathVariable("labelId") String labelId){
        return new Result(true,StatusCode.OK,"查询成功");
    }
    //前台会将数据转给我们然后我们转换成label对象 进行保存,
    @RequestMapping(method = RequestMethod.PUT)
    public Result save(@RequestBody Label label){
        return new Result(true,StatusCode.OK,"添加成功");

    }
    @RequestMapping(value ="{labelId}",method = RequestMethod.PUT)
    public Result updateById(@PathVariable String labelId,@RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }
}
