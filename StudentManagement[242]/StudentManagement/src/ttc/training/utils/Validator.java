package ttc.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	private static final String VALID_STUDENT_ID_REGEX = "[SV]+[0-9]{3}$";

	public static boolean isStudentId(String id) {
		Pattern pattern = Pattern.compile(VALID_STUDENT_ID_REGEX);
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
	}

	public static boolean isGender(String type) {
		if ((type.equals("MALE")) || (type.equals("FEMALE")) || (type.equals("GAY"))) {
			return true;
		}
		return false;
	}

}
