package q101q2;

public class UniqueQuestion2 {
	public static boolean uniqueCheck(String s){
		if (s.length() >26){
			return false;
		}
		int checker = 0;
		for(int i =0; i<s.length(); i++){
			int val = s.charAt(i) - 'a';
			if (( checker & 1<<val) >0 ){
				return false;
			}
			checker |= (1 << val);
		}
		return true;	
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + uniqueCheck(word));
		}
	}
}
