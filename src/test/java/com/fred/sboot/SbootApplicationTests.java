package com.fred.sboot;

import com.fred.sboot.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbootApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }


    @Test
    public  void testIoc(){
            Boolean b= ioc.containsBean("helloService");
            System.out.println(b);
    }

    private Logger looger=LoggerFactory.getLogger(getClass());

    @Test
    public void testlog(){
        looger.trace("这是trace日志");
        looger.debug("调试信息日志");
        looger.info("自定义info日志");
        looger.warn("这是warn日志");
        looger.error("这是error日志");
    }
}
