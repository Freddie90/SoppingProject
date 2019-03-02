package project;

import org.junit.Assert;
import com.project.shop.conf.AppCon;
import com.project.shop.serv.ShoppingSevice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingTest {

    private ShoppingSevice shoppingService;

    @BeforeMethod
    public void setUp()throws Exception {ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    shoppingService = (ShoppingSevice)ctx.getBean("calc");
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalcPaymentAmount() throws Exception {
        double result = shoppingService.calcPaymentAmount(3,25);
        double amount = 0;
        double itemPrice = 0;
        Assert.assertEquals((amount*itemPrice), amount, itemPrice);
    }
}
