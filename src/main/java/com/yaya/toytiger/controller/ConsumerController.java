package com.yaya.toytiger.controller;

import com.yaya.toytiger.entity.ConsumerEntity;
import com.yaya.toytiger.service.ConsumerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerServer consumerServer;

    @RequestMapping("/selectConsumerById/{id}")
    public String  selectConsumerById(@PathVariable Integer id){
        ModelAndView ww;
        ConsumerEntity entity = consumerServer.selectById(id);
        if (entity != null){
            System.out.println(entity.getName());
            System.out.println(entity.getAddress());

        }
        return entity.toString();
    }

}
