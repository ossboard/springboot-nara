package com.nara.service;

import com.nara.mapper.DemoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Map> getDemo1(Map<String, Object> param) {
        return demoMapper.getDemo1(param);
    }

    public List<Map> getDemo2(Map<String, Object> param) {
        return demoMapper.getDemo2(param);
    }

}

