
public class PermutationString {

	public static void main(String[] args) {
		
		permutations("abc");
	}
	
	
	public static void permutations(String s) {
		for(int i=0;i<s.length();i++) {
			StringBuilder result = new StringBuilder();
			result.append(String.valueOf(s.charAt(i)));
			for(int j=0;j<s.length();j++) {
				if(i!=j) {
					result.append(String.valueOf(s.charAt(j)));
				}
			}
			System.out.println(result.toString());
			
		}
	}

}
