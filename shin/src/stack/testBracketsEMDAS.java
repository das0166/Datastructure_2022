package stack;

public class testBracketsEMDAS {
	public static void main(String args[]) {
		
		System.out.println("== Bracketed EMDAS ===================== 연산식 ====");
		String test = "((3^3)-(6/2))";		
		System.out.println("expression given: " + test);
		
		if (BracketsEMDAS.isGoodPair(test)) {
			System.out.println("expression is good.");
		}
		else {
			System.out.println("error in arithmetic expression");
			return;
		}
		System.out.println("---------------------------------- postfix 연산 ----");
		String inFix   = BracketsEMDAS.toInFix(test);
		String postFix = BracketsEMDAS.toPosFix(test);
			
		System.out.println("       inFix > " + inFix);
		System.out.println("     postFix > " + postFix);
		System.out.println("  evaluation = " + BracketsEMDAS.evaluatePostFix(postFix));
	}
}