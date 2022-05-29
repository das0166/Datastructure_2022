package stack;

public class BracketsEMDAS {
	public static boolean isGoodPair(String expr) {
		StackSL myStack = new StackSL();
		char currBrackets, lastBrackets;
		int expSize = expr.length();
		for(int i = 0; i < expSize; i++) {
			currBrackets = expr.charAt(i);
			
		    if (currBrackets == '(') {
		    	myStack.push(currBrackets);
		    }
		    else if (currBrackets == ')') {
		    	if(myStack.isEmpty()) {
		    		return false;
		    	}
		    	else {
		            lastBrackets = myStack.pop();
		            if (lastBrackets != '(') {
		            	return false;
		            }
		        }
		    }
		}
		if (myStack.isEmpty()) return true;
		else                   return false;
	}
	public static int evaluatePostFix(String postFix) {
		StackSL myStack = new StackSL();
		int expSize = postFix.length();
		int opr1, opr2;
		int value = 0;
		char aChar;
		for (int i = 0; i < expSize; i++) {
			aChar = postFix.charAt(i);
			if (aChar != '+' && aChar != '-' && aChar != '*' && aChar != '/' && aChar != '^') {
				myStack.push((char) (aChar - '0'));
			}
			else {
				opr2 = myStack.pop();
				opr1 = myStack.pop();
		
				switch (aChar) {
				case '+':
					value = opr1 + opr2;
					break;
				case '-':
					value = opr1 - opr2;
					break;
				case '*':
					value = opr1 * opr2;
					break;
				case '/':
					value = opr1 / opr2;
					break;
				case '^':
				     int r = 1; 
				     for (int x = 0; x < opr2; x++) { 
				         r = r * opr1; 
				     } 
					value = r;
					break;
				}
				myStack.push((char) value);
			}
		}
		return myStack.pop();
	}
	public static String toPosFix(String expr) {
		if (!BracketsEMDAS.isGoodPair(expr)) {
			System.out.println("toPostFix fail!"); 
			return "";
		}
		String postFix = "";
		StackSL myStach = new StackSL();
		int expSize = expr.length();
		char testCh;
		for (int i = 0; i < expSize; i++) {
			testCh = expr.charAt(i);
			switch (testCh) {
			case '0': case '1': case '2': case '3': case '4':
			case '5': case '6': case '7': case '8': case '9':
				postFix += testCh;
				break;
			case '+': case '-': case '*': case '/': case '^':
				myStach.push(testCh);
				break;
			case ')':
				postFix += myStach.pop();
				break;
			default:
			}
		}
		return postFix;
	}
	public static String toInFix (String expr) {
		if (!BracketsEMDAS.isGoodPair(expr)) {
			System.out.println("toInFix fail!"); 
			return "";
		}
		expr = expr.replace("(", "");
		expr = expr.replace(")", "");
		return expr;
	}
}
