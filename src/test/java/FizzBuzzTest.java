import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FizzBuzzTest {

    // arrange step-1
    FizzBuzz fizzBuzz;

    // arrange step-2
    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canReturnFizz(){
        // act
        String result = fizzBuzz.getFizzBuzz(3);
        // assert
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void canReturnBuzz(){
        // act
        String result = fizzBuzz.getFizzBuzz(5);
        // assert
        String expected = "Buzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnFizzBuzz(){
        // act
        String result = fizzBuzz.getFizzBuzz(15);
        // assert
        String expected = "FizzBuzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnNumberIfNotFizzBuzz(){
        // act
        String result = fizzBuzz.getFizzBuzz(2);
        // assert
        String expected = "2";
        assertThat(result).isEqualTo(expected);
    }

}
