package com.yaya.toytiger.mapper;

import com.yaya.toytiger.entity.ConsumerEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerMapper {

    ConsumerEntity selectById(@Param("id") Integer id);

    int updateById (ConsumerEntity entity);


}
