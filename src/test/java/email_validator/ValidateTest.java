package email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTest {

	@Test
	public void testValidator() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@dal.ca");
		assertEquals(2,result);
	}

}
