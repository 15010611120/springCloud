package com.yxd.sc_customer_a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class CustomerAController {
	@Autowired  
    HelloService service;  
  
    @RequestMapping("/ribbon-consumer")  
    public String coutomerA() {  
        return service.helloService();  
    }  
}
