package stack;

public class StackSL {

	/**
	 * stack에 가장 나중에 입력(Last In)된 정보
	 * 
	 * @see #getTop()
	 * @see #setTop(StackNodeSL top)
	 */
	private StackNodeSL top;

	/**
	 * 내용이 없는 빈 스택을 생성
	 */
	public StackSL() {
		this.top = null;
	}

	/**
	 * 데이터 1개를 저장한 스택을 생성
	 * 
	 * @param item 저장하려는 초기 정보 1개
	 */
	public StackSL(char item) {
		this.push(item);
	}

	/**
	 * 스택의 top 데이터를 검사
	 * 
	 * @return top에 저장된 데이터
	 */
	public StackNodeSL getTop() {
		return this.top;
	}

	/**
	 * 스택에서 가장 위에 있는 top 데이터를 변경
	 * 
	 * @param top 저장하려는 글자 1개
	 */
	public void setTop(StackNodeSL top) {
		this.top = top;
	}

	/**
	 * 스택에 데이터가 비어 있는지 검사
	 * 
	 * @return true: 비었음, false: 내용 있음
	 */
	public boolean isEmpty() {
		if (top == null) return true;
		else return false;
	}

	/**
	 * 스택에 신규 데이터를 저장
	 * 
	 * @param item 저장하려는 문자 1개
	 */
	public void push(char item) {
		StackNodeSL node = new StackNodeSL(item);
         if(isEmpty()){
                top = node;
         }else{
                node.next= top;
                top= node;
         }
	}

	/**
	 * 스택에서 정보 1개를 꺼냄
	 * 
	 * @return 스택에서 받은 데이터 1개
	 */
	public char pop() {
		  if(isEmpty()){
              System.out.println("stack is empty");
              return 0;
       }else{
    	   StackNodeSL node = top;
              top = node.next;
              return node.getData();
       }
	}

	/**
	 * 객체를 문자열로 변환
	 * 
	 * @return 단항식 표현 문자열
	 */
	public String toString() {
		StackNodeSL here = this.top;
		String buff = "Linked Stack >";

		while (here != null) {
			buff += "> " + here + " ";
			here = here.getNext();
		}

		return buff;
	}
}