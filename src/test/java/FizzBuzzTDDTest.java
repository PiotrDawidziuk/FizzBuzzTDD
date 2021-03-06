import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTDDTest {

    // Fizz buzz (often spelled FizzBuzz in this context) has been used as an interview screening device for computer programmers.
    // Writing a program to output the first 100 FizzBuzz numbers is a trivial problem for any would-be computer programmer,
    // so interviewers can easily sort out those with insufficient programming ability.


    /*
    1==1
    2==2
    3==Fizz
    4==4
    5==Buzz
    6==Fizz
    7==7
    8=8
    9==Fizz
    10==Buzz
    15==FizzBuzz
    100 == Buzz
     */

    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1",fizzBuzz.convert(1));
        Assert.assertEquals("2",fizzBuzz.convert(2));

    }

    @Test
    public void fizzBuzzConverterMultiplesOfThree(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz",fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz",fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzConverterMultiplesOfFiveAndThree(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz",fizzBuzz.convert(15));
    }

    @Test
    public void ifMultiplesBy15IsTheSameAsModuloFrom3And5(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        for (int i = 1; i <= 100; i++){

            if (i%3 == 0 && i%5 ==0) {
                Assert.assertEquals("FizzBuzz", fizzBuzz.convert(i));
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        fizzBuzz.convert(-1);
    }



}
