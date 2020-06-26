package com.jpassion.tdd;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringConcatenatorTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	private StringConcatenator stringConcatenator;
	private String string1;
	private String string2;
	private String result;

	public StringConcatenatorTest(String string1, String string2, String result) {
		this.string1 = string1;
		this.string2 = string2;
		this.result = result;
	}

	@Parameters
	public static Collection testValues() {
		return Arrays.asList(new Object[][] {
				{ "hello ", "world", "hello world" },
				{ "Code ", "with Passion!", "Code with Passion!" },
				{ "Life is ", "good", "Life is good" },
		});
	}

	@Before
	public void setup() {
		stringConcatenator = new StringConcatenator();
	}

	@Test
	public void should_concatenate_two_strings() throws Exception {
		assertThat(stringConcatenator.concatenate(string1, string2),
				is(result));
	}

	@Test(expected = StringTooShortException.class)
	public void should_throw_StringTooShortException_when_less_than_2_string() {
		String string1 = "a";
		String string2 = "Code";
		stringConcatenator.concatenate(string1, string2);
	}

	@Test
	public void should_throw_StringTooShortException_with_mesaage() throws Exception {
		String string1 = "a";
		String string2 = "Code";
		expectedException.expect(StringTooShortException.class);
		expectedException.expectMessage("Too short string:  " + string1 + " " + string2);
		stringConcatenator.concatenate(string1, string2);
	}

}
