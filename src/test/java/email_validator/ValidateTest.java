package email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTest {

	/* one single @ and at least one . in the email string and no space, special character,
	 * end with .com or .ca
	 * 5 rules pass
	 */
	@Test
	public void testValidator1() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@dal.ca");
		assertEquals(5,result);
	}
	
	/* include special character
	 * 4 rules pass
	 */
	@Test
	public void testValidator2() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("%123@dal.ca");
		assertEquals(4,result);
	}
	
	/* include space
	 * 4 rules pass
	 */
	@Test
	public void testValidator3() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123 @dal.ca");
		assertEquals(4,result);
	}
	
	/* include special character and space
	 * 3 rules pass
	 */
	@Test
	public void testValidator4() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("%123 @dal.ca");
		assertEquals(3,result);
	}
	
	
	/* domain not end with .com or .ca
	 * 4 rules pass
	 */
	@Test
	public void testValidator5() {
		EmailValidator test = new EmailValidator();
		int result = test.validate("123@dal.cn");
		assertEquals(4,result);
	}
}
