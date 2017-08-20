import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Parameterized.class)
public class ForgottenNumberParameterizedTest {
    ForgottenNumber forgottenNumber;

    private int[] input;
    private int expectedOutput;

    public ForgottenNumberParameterizedTest(int[] input, int expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {new int[] {-3,-1,1,3,4,5}, 2},
                {new int[] {0,1,20,5,4,2}, 3},
                {new int[] {1}, 2},
                {new int[] {-3,-1,-14}, 1},
                {new int[] {}, 1},
                {new int[] {2,3,5,8}, 4},
                {new int[] {-2,0,1}, 2},
                {new int[] {-2,0,2}, 1},
                {new int[] {-2,-1,-5}, 1},
                {new int[] {-1,2,3,4,5}, 6}
        });
    }

    @Test
    public void findForgottenNumberTest(){
        forgottenNumber = new ForgottenNumber();

        Assert.assertEquals(expectedOutput,forgottenNumber.findNumber(input));
        Assert.assertThat(forgottenNumber.findNumber(input),equalTo(expectedOutput));
    }

   /* @Test
    public void findForgottenNumber2(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {-1,2,3,4,5};
        Assert.assertEquals(6,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(6));
    }*/
/*
    @Test
    public void findForgottenNumber3(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {-1,-2,-3,-4,-5};
        Assert.assertEquals(1,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(1));
    }
    @Test
    public void findForgottenNumber4(){
        forgottenNumber = new ForgottenNumber();
        int[] A = {};
        Assert.assertEquals(1,forgottenNumber.findNumber(A));
        Assert.assertThat(forgottenNumber.findNumber(A),equalTo(1));
    }*/
}
