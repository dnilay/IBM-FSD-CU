package com.jpassion.mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ComputerTest {

	@Mock
	private Adder adder;

	@Mock
	private Subtractor subtracter;

	@InjectMocks
	private Computer computer;
	
	private int x, y;

	@Before
	public void setup() {
		computer = new Computer();
		x = 5; y = 2;
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void should_return_square_value_after_adding_two_values() throws Exception {
		Mockito.when(adder.add(x, y)).thenReturn(7);
		assertThat(computer.computeSquareAfterAddition(x, y), equalTo(49));
		Mockito.verify(adder, Mockito.times(2)).add(x, y);
	}
	
	@Test public void 
	should_return_square_value_after_subtracting() throws Exception {
		Mockito.when(subtracter.subtract(x, y)).thenReturn(4);
		assertThat(computer.computeSquareAfterSubtraction(x, y), equalTo(9));
		Mockito.verify(subtracter, Mockito.times(2)).subtract(x, y);
	}
	
	@Test(expected=RuntimeException.class)
	public void should_throw_RuntimeException_when_negative_number_is_given() throws Exception {
		x = -2;
		Mockito.when(adder.add(x, y)).thenThrow(new RuntimeException("negative number not allowed: " + x + " " + y));
		computer.computeSquareAfterAddition(x, y);
		Mockito.verify(adder, Mockito.atLeast(1)).add(x, y);
	}
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void should_throw_RuntimeException_with_message_when_negative_number_is_given() throws Exception {
		x = -2;
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("negative number not allowed: "+ x + " " + y);
		Mockito.when(adder.add(x, y)).thenThrow(new RuntimeException("negative number not allowed: " + x + " " + y));
		computer.computeSquareAfterAddition(x, y);
		Mockito.verify(adder, Mockito.atLeast(1)).add(x, y);
	}

}
