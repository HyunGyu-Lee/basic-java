package sample1;

import java.io.*;
public class Sample2_by {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�ο��� �����ÿ�");					//�� ó�� ��� �Ǵ� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));		// ���� �Է¹ޱ� ���� �ۼ�
		
		String str = br.readLine();			// str�̶�� �̸��� String ������ �Է°��� �Է� �޴´�
		int num = Integer.parseInt(str);		// �Է¹��� str ���� Int������ ��ȯ
		
		int[] test;							//test��� �̸��� �迭 ����
		test = new int[num];
		
		System.out.println("���� ���»�� ����ŭ ���� �Է��Ͻÿ�");		// ���� ���
		
		for(int i=0; i<num; i++) {							// �ݺ��� ����
			
			str = br.readLine();							// str ������ �Է� �޴´�
			int temp = Integer.parseInt(str);				// �Է¹��� str ���� temp��� int������ ���������ش�
			test[i] = temp;									// test ��� �迭[]�� temp ���� �־��ش�
		}
		for(int i=0; i<num; i++) {							//���� �ݺ��� ������ �ٸ��� ����
			System.out.println((i+1)+"��° ����� ������"+test[i]+"�Դϴ�.");
		}
		
	}

}
