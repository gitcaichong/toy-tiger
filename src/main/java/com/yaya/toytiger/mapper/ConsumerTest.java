package com.yaya.toytiger.mapper;

import com.yaya.toytiger.entity.ConsumerEntity;

public class ConsumerTest implements ConsumerMapper{
    @Override
    public ConsumerEntity selectById(Integer id) {
        return null;
    }

    @Override
    public int updateById(ConsumerEntity entity) {
        return 0;
    }

    public int updateBy() {
        return 0;
    }
}
