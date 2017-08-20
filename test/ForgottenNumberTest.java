import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class ForgottenNumberTest {
    ForgottenNumber forgottenNumber;

    @Test
    public void findForgottenNumberTest1(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {-3,-1,1,3,4,5};
        Assert.assertEquals(2,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(2));
    }

    @Test
    public void findForgottenNumberTest2(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {-1,2,3,4,5};
        Assert.assertEquals(6,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(6));
    }

    @Test
    public void findForgottenNumberTest3(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {-1,-2,-3,-4,-5};
        Assert.assertEquals(1,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(1));
    }
    @Test
    public void findForgottenNumberTest4(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {};
        Assert.assertEquals(1,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(1));
    }
}
