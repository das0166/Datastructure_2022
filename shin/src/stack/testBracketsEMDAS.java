package stack;

public class testBracketsEMDAS {
	public static void main(String args[]) {
		
		System.out.println("== Stack Single Linked =================== �ㅽ깮 ====");
		StackSL myStack = new StackSL((char) 3);
		myStack.push((char) 7);		
		System.out.println(myStack);
		myStack.pop();		
		System.out.println(myStack);
		
		System.out.println("== Bracketed EMDAS ===================== �곗궛�� ====");
		String test = "((((3*5)-(6/2))/((4*2)-(8-4)))-2)";		
		System.out.println("expression given: " + test);
		
		if (BracketsEMDAS.isGoodPair(test)) {
			System.out.println("expression is good.");
		}
		else {
			System.out.println("error in arithmetic expression");
			return;
		}

		System.out.println("---------------------------------- postfix �곗궛 ----");
		String inFix   = BracketsEMDAS.toInFix(test);
		String postFix = BracketsEMDAS.toPosFix(test);
		
		System.out.println("       inFix > " + inFix);
		System.out.println("     postFix > " + postFix);
		System.out.println("  evaluation = " + BracketsEMDAS.evaluatePostFix(postFix));
	}
}