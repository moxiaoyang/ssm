package com.ssm.test;


import com.baofu.global.cross.border.logback.ex.constant.MDCPropertyConsts;
import com.ssm.dao.mapper.DataMapper;
import com.ssm.dao.model.DataDo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.UUID;


@Slf4j
public class ApolloTest extends BaseTest {

    @Autowired
    private DataMapper dataMapper;

    @Test
    public void test_01() {
        MDC.put(MDCPropertyConsts.TRACE_LOG_ID, UUID.randomUUID().toString());
        DataDo dataDo =  dataMapper.selectByKey(1L);
        log.info("call dataDao = {}",dataDo);
    }

}
