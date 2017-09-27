package main;

public class MainController {
	public static void main(String[] args){
		// static���� Ŭ������ �����ϸ�, �ش� ��ü�� �ڹٰ� ������ �Ǵ� ���� ���� ��. �׸��� ���� static�� �ƴ� ��ü�� ���� ��.
		// static��ü���� �� static ��ü�� ȣ�� �Ұ�. ���� ���ǉ� ���� ��ü�̱� ����.
		
		System.out.println("��: " + solution(123456789));

	}
	
	public static int solution(int Number) {
		int result = 0;
		
		// int�� String ����ȯ
		String a = Number+"";				// ������ ����ȯ	
		String b = Integer.toString(Number);// �� ����ȯ
		String c = String.valueOf(Number);	// valueOf�� ���ο��� Integer.toString�� ȣ��
		
//		char[] arr  = a.toCharArray();
//		
//		for(int i=0; i < arr.length; i++){
//			result += (int)arr[i]-48;
//		}
//		
		for(int i=0; i < a.length(); i++){
			result += Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		
		/*
		 * Integer.parseInt : String to Integer
		 * String.valueOf	: AnyType to String	
		 */
		
		return result;
	}
}
