package ds.stack;

public class App {

	public static void main(String[] args) {
		
		// LIFO = Last in, first out
		
		/*
		Stack theStack = new Stack(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		*/
		
		String reversed = reverse("Buddy");
		System.out.println(reversed);

	}
	
	public static String reverse(String word) {
		String reversedWord = "";
		int len = word.length();
		
		Stack charStack = new Stack(len);
		
		for(int i=0; i<len; i++) {
			charStack.push(Character.getNumericValue(word.charAt(i)));
		}
		
		while(!charStack.isEmpty()) {
			char c = Character.forDigit((int) charStack.pop(), Character.MAX_RADIX);
			reversedWord = reversedWord + c;
		}
		
		return reversedWord;
	}

}
