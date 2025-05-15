
public class P015_String {
	public static void main(String[] args) {
		String name = "My nam465$^&&e is java";
		System.out.println(name);
		System.out.println(name.length());
		String s1 = "java";
		String s2 = " technology";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		
		String s3 = "java";
		System.out.println("to upper case ->"+s3.toUpperCase());
//		s3  ="new java";
		String s4 = "JAVA";
		
		String s5 = new String("java");
		System.out.println("s5 = "+s5);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s6 = "		 ja  va			";
		System.out.println(s6);
		System.out.println(s6.trim());
		
		
		
		
		
	}
}
