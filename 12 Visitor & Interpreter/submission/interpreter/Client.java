package interpretorPattern;

import interpretorPattern.context.Context;

public class Client {
	public static void main(String[] args){
		String tokenString = "- + 10 5 - 8 2";
		Context context = new Context(tokenString);
		
		System.out.println(context.interpret());
	}
}
