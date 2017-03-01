package email_validator;

public class EmailValidator {

		public int validate(String email){
			
			int count = 0;
			int t1 = 0;
			int t2 =0;
			for(int i = 0; i < email.length(); i++){
				if(email.charAt(i) == '@')
					t1++;
				if(email.charAt(i) == '.')
					t2++;
			}
			if(t1 == 1){
				count++;
			}
			if(t2 >= 1){
				count++;
			}
			return count;
		}
}
