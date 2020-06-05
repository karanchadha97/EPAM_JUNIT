package com.epam.ttdjunit;

public class RemoveAInString {

	public String removeA(String string) {
		String result = string;

		if(string.length() < 2)
			result = string.replace("A", "");

		else

			if(string.charAt(0) == 'A')

				if(string.charAt(1) == 'A')
					result =  string.substring(2);			

				else
					result =  string.charAt(1)
					+ string.substring(2);

			else if(string.charAt(1) == 'A')
				result =  string.charAt(0)
				+ string.substring(2);

		return result;
	}

}
