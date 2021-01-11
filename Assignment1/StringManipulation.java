package example;

public class StringManipulation {

	public static void main(String[] args) {
		String s1="Welcome to Java";
		String s2="Start Learning";
		char c='A';
		String s3=s1.concat(s2);
		System.out.println("String1 : "+s1);
		System.out.println("String2 : "+s2);
		System.out.println("Concatenation : "+s3);
		System.out.println("Concatenation : "+s1+" "+s2);
		System.out.println("Substring : "+s1.substring(0,7));
		System.out.println("Substring : "+s1.substring(11));
		System.out.println("Index value of 'J' : "+s1.indexOf('J'));
		System.out.println(String.valueOf(c));
		System.out.println("Uppercase : "+s1.toUpperCase());
		System.out.println("toLowerase : "+s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println("String1 length is :"+s1.length());

	}

}
