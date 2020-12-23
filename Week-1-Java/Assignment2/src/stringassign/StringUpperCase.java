package stringassign;

public class StringUpperCase {
	public static void main(String[] args) {
		
		String s="hello hi good evening how are you doing today";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			//original example
			//sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			
			//changed the order of substring and toUpperCase and changed the index you are capturing to the last index of the word
			sb.append(ar[i].substring(0, ar[i].length() -1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length() - 1))).append(" ");
		}
		System.out.println(sb.toString());
	}
}
//Task - Convert every word's last character to uppercase and print back the sentence.