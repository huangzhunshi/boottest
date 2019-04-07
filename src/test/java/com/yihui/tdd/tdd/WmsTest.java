package com.yihui.tdd.tdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.fail;

public class WmsTest {
    @Given("^选择要盘点的仓库$")
    public void selectWms(){

    }

    @When("^开始盘点$")
    public void startOk(){

    }

    @When("^输入盘点后结果$")
    public void insertOk(){

    }

    @Then("^数据入库$")
    public void inwms(){
       //fail("xxx");
    }

}
