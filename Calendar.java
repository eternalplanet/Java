package demo;
import java.util.*;
public class demo1 {
	
	public static void main(String[] args) {
		Calendar ���� = Calendar.getInstance();
		����.set(1931,8,1);
		int ���ڼ� = ����.get(Calendar.DAY_OF_WEEK)-1;
		String a[] = new String[���ڼ�+30];
		for(int i =0;i<���ڼ�;i++)
		{
			a[i]="";
		}
		for(int i = ���ڼ�,n=1;i<���ڼ�+30;i++)
		{
			a[i]=String.valueOf(n);
			n++;
		}
		int year = ����.get(Calendar.YEAR),month = ����.get(Calendar.MONTH)+1;
		System.out.println(" "+year+"��"+month+"��"+"18�գ��ձ������ֻ�ս��");
		System.out.printf("%5c%5c%5c%5c%5c%5c%5c\n",'��','һ','��','��','��','��','��');
		for(int i=0;i<a.length;i++)
		{
			if(i%7==0&&i!=0)
				System.out.printf("\n");
			System.out.printf("%5s",a[i]);
		}
	}
}