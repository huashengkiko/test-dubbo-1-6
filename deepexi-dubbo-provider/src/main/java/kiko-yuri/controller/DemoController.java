package kiko-yuri.controller;

import kiko-yuri.model.vo.DemoVO;
import kiko-yuri.model.query.ValidDemoQuery;
import kiko-yuri.util.ValidationUtils;
import kiko-yuri.exception.common.DataExistException;
import kiko-yuri.extension.web.Payload;
import kiko-yuri.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import javax.validation.Valid;
import kiko-yuri.converter.DemoConverter;


@RestController
@RequestMapping("demo")
@Payload
public class DemoController {

    @Autowired
    private DemoService service;
    
    @Autowired
    private DemoConverter convert;

    @GetMapping("convert")
    public DemoVO doConvert() {
       return convert.dto2vo(service.get());
    }
            
    
    @GetMapping("greeting")
    public String sayHello() {
        return service.sayHello();
    }

    @GetMapping("biz-error")
    public void bizerror() {
        throw new DataExistException("Demo数据已存在");
    }

    @GetMapping("valid")
    public String valid(@Valid ValidDemoQuery query, BindingResult result) {
        BindingResult errors = ValidationUtils.validate(query, ValidDemoQuery.Role.class);
        if (result.hasErrors() || errors.hasErrors()) {
            return "fail";
        }
        return "success";
    }

}
