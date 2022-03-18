package com.nara.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface DemoMapper {

    List<Map> getDemo1(Map<String, Object> param);
    List<Map> getDemo2(Map<String, Object> param);
}
