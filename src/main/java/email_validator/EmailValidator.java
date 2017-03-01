package email_validator;

public class EmailValidator {

		public int validate(String email){
			
			int count = 0;
			int t1 = 0, t2 =0;
			
			for(int i = 0; i < email.length(); i++){ //look through the email string
				
				if(email.charAt(i) == '@') //if there is @ in the string
					t1++;
				if(email.charAt(i) == '.') //if there is . in the string
					t2++;

			}
				
			if(t1 == 1) //if there is one single @ in the string
				count++;
			
			if(t2 >= 1) //if there is at least one . in the string
				count++;
			
			return count;
		}
}
