package com.ssm.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Slf4j
@ContextConfiguration(locations = {"classpath:com.spring.config/config-all.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Test
    public void test() {

    }

    @BeforeSuite
    public void setUp() {
        log.info("-------------测试案例启动-------------");
    }

    @AfterSuite
    public void after() {
        log.info("-------------测试案例结束-------------");
    }
}
