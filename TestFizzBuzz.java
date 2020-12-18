package javaProjectTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author viv1
 *
 */
public class TestFizzBuzz {

	@Test
	public void test_printFizzBuzz_inputIs1() {
		verify("1", 1);
	}

	@Test
	public void test_printFizzBuzz_inputIs2() {
		verify("2", 2);
	}
	
	@Test
	public void test_printFizzBuzz_inputIs3() {
		verify("Fizz",3);
	}
	
	@Test
	public void test_printFizzBuzz_multiplesOf3() {
		verify("Fizz",9);
		verify("Fizz",27);
		verify("Fizz",12);
	}
	
	@Test
	public void test_printFizzBuzz_inputIs5() {
		verify("Buzz",5);
	}
	
	@Test
	public void test_printFizzBuzz_multiplesOf5() {
		verify("Buzz",10);
		verify("Buzz",20);
		verify("Buzz",35);
		verify("Buzz",25);
		
	}
	
	@Test
	public void test_printFizzBuzz_inputIs15() {
		verify("FizzBuzz",15);
	}
	
	@Test
	public void test_printFizzBuzz_multiplesOf15() {
		verify("FizzBuzz",30);
		verify("FizzBuzz",45);
		verify("FizzBuzz",60);
		verify("FizzBuzz",75);
		
	}

	private FizzBuzz makeSUT() {
		return new FizzBuzz();
	}

	private void verify(String expectation, Integer input) {
		final var sut = makeSUT();
		var result = sut.printFizzBuzz(input);
		assertEquals(expectation, result);
	}

}
