package javademo5_31;

public class Example5_31 {

	public static void main(String[] args) {
		double[] a = {0.88,1.5,5.45};
		int b[]= {10,151,1001};
		System.out.print("        ��Ȫˮ        ���        ����\n");
		System.out.print("��λ");
		for(int i=0;i<3;i++)
		{
			System.out.printf("%10.2f",a[i]);
		}
		System.out.print("\n����");
		for(int i=0;i<3;i++)
		{
			System.out.printf("%10d",b[i]);
		}
		System.out.print("\n�ܶ�");
		System.out.printf("%10.2f%10.2f%10.2f",8.8,a[1]*b[1],a[2]*b[2]);
	}
}
