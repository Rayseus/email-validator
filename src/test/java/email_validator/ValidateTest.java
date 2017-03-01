package email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTest {

	//one single @ and at least one . in the email string
	@Test
	public void testValidator1() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@dal.ca");
		assertEquals(2,result);
	}
	
	//no @ and at least one . in the email string
	@Test
	public void testValidator2() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123dal..ca");
		assertEquals(1,result);
	}
	
	//one single @ and no . in the email string
	@Test
	public void testValidator3() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@dalca");
		assertEquals(1,result);
	}
	
	//more than one @ and at least one . in the email string
	@Test
	public void testValidator4() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@@dal.ca");
		assertEquals(1,result);
	}
	
	//either @ or no . in the email string
	@Test
	public void testValidator5() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123dalca");
		assertEquals(0,result);
	}

}
