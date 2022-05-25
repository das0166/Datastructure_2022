package stack;

public class StackNodeSL {
	
	/**
	 * 데이터를 저장하는 장소
	 * @see #getData()
	 * @see #setData(char aData)
	 */
	private char data;


	
	/**
	 * 아래 다음 데이터로 연결
	 * @see #getNext()
	 * @see #setNext(StackNodeSL aNext)
	 */
	public StackNodeSL next = null;

	/**
	 * 데이터 1개를 갖는 스택을 생성
	 * @param item 저장하려는 글자 1개
	 */
	public StackNodeSL(char item) {
		 this.data = item;
         this.next =null;


	}

	/**
	 * 저장된 정보를 검사
	 * @return 저장된 전보
	 */
	public char getData() {
		return data;
	}

	/**
	 * 정보를 저장
	 * @param aData 저장하려는 글자 1개
	 */	
	public void setData(char aData) {
		this.data = aData;
	}
	
	/**
	 * 저장된 아래 다음 정보를 검사
	 * @return 다음 층 정보
	 */
	public StackNodeSL getNext() {
		return this.next;
	}

	/**
	 * 아래 다음 정보를 연결
	 * @param aNext 연결하려는 다음 정보 1개
	 */		
	public void setNext(StackNodeSL aNext) {
		this.next = aNext;
	}


	/**
	 * 객체를 문자열로 변환
	 * @return 단항식 표현 문자열
	 */
	public String toString() {	
		String buff = "";		
		buff += data + 0;		
		return buff;
	}
}
