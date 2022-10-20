package com.yaya.toytiger.service;

import com.yaya.toytiger.entity.ConsumerEntity;
import com.yaya.toytiger.mapper.ConsumerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServer {

    @Autowired
    ConsumerMapper consumerMapper;

    public ConsumerEntity selectById (Integer id){
        return consumerMapper.selectById(id);
    }

}
