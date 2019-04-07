package com.yihui.tdd.tdd;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"json:target/json-report/dw.json"}
        , features = {"classpath:"}
       // , glue = {"io.cucumber.samples.dw.steps"}
)
@ContextConfiguration // 不加此注解，bean会注入不进去
@SpringBootTest
public class TddApplicationTests {


}
