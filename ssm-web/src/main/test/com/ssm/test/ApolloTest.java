package com.ssm.test;


import com.ssm.dao.mapper.DataMapper;
import com.ssm.dao.model.DataDo;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class ApolloTest extends BaseTest {

    @Autowired
    private DataMapper dataMapper;

    @Test
    public void test_01() {
        DataDo dataDo = dataMapper.selectByKey(1L);
        System.out.println(dataDo);
    }
}
