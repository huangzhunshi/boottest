package com.yihui.tdd.tdd;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cucumber.api.java8.Zh_cn;


//@SpringBootTest(classes = TddApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class FixedAmountWithdrawSteps implements Zh_cn {
    @假如("^我的账户中有余额\"([^\"]*)\"元$")
    public void 我的账户中有余额_元(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @当("^我选择固定金额取款方式取出\"([^\"]*)\"元$")
    public void 我选择固定金额取款方式取出_元(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @那么("^我应该收到现金\"([^\"]*)\"元$")
    public void 我应该收到现金_元(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //     throw new PendingException();
    }

    @那么("^我账户的余额应该是\"([^\"]*)\"元$")
    public void 我账户的余额应该是_元(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
    }

}
