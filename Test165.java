/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */		// �ٽ�!!!!!!!!!!!!!!!!!!!!���� �𸣰��� �̤̤�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

/*
�� Set �ڷᱸ�� ->HashSet/ TreeSet
- ���� ����
-�ߺ��� ������� �ʴ� ����(�⺻)


�� TreeSet<E>Ŭ����

	java.util.TreeSet<E>Ŭ������
	Set�������̽��� �����SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ ����ȴ�.			==>> �ڵ����� ��� ==> ���ҽ� �Һ� ��, ������ ������

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

public class Test165
{
	public static void main(String[]args)
	{
		//TreeSet�ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet �ڷᱸ�� set�� ��� �߰� -> add();
		set.add("�Ͽ��� �����̴� ��");
		set.add("�̿��������");
		set.add("�Ʊ����Ѹ�");
		set.add("�͸���Į��");
		set.add("�ܿ�ձ�");
		set.add("¯���¸�����");
		set.add("�λ��̵�ƿ�");
		set.add("��Ž���ڳ�");
		set.add("���ɰ���");

		//Iterator�� Ȱ���� set��� ��ü ���
		Iterator<String> it = set.iterator();	
		while (it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		//�ܿ�ձ� �͸���Į�� ��Ž���ڳ� �Ʊ����Ѹ� ���ɰ��� �̿�������� �λ��̵�ƿ� ¯���¸����� �Ͽ��� �����̴� ��
		//===> �����ٶ� ����..?

		//TreeSet�ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<String> set2 = new TreeSet<String>();
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//GradeVO ob = new GradeVO();

		set2.add(new GradeVO("18102146","������",90,80,70));
		set2.add(new GradeVO("16101596","���־�",99,88,77));
		set2.add(new GradeVO("18101395","������",66,55,44));
		set2.add(new GradeVO("18101334","������",33,22,11));
		set2.add(new GradeVO("18102122","������",45,55,65));

		//Iterator�� Ȱ���� set2 ��� ��ü ���												====>�ڱ���(��)�� �־�� ������ ��

		/*
		Iterator<GradeVo> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();	//==>���� �߻�
		*/
		
		/*
		// my comparactorŬ���� ����, TreeSet���� ���� ������ �ٽ� ����
		Iterator<GradeVo> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();

		//==> �ؽ��ڵ尡 �����ϴ� ��� ���								//����ؼ� Ȯ�� �ϼ��� �Ф�
		================================================================================================> */

		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = its.next();
			System.out.printf("%7s %7s %4d %4d %6d\n ", vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTot());
		}
		System.out.println();
	}
}


	// VO	-> Value Object==================================================���� �����
	// DTO	-> Data Trasfer Object===========================================������ ����
	// DAO	-> Data Access Object

	class GradeVO
	{
		//�ֿ�Ӽ� ����
		private String hak;
		private String name;
		private int kor, eng, mat;
		
		//������ ����-> 5���� �Ű����� �� ���� ������
		GradeVO(String hak, String name, int kor, int eng, int mat)
		{
			this.hak = hak;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
			
		//������ (����� ���� ������-> �Ű����� ���� ������)
		// �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ�
		// default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ� �߰��� ������ ������
	
		//get,set
		GradeVO()
		{	
			//�й�
			String getHak()
			{
				return hak;
			}
			void setHak(String hak)
			{
				this.hak = hak;
			}
			//�̸�
			String getName()
			{
				return name;
			}
			void setName (String name)
			{
				this.name = name;
			}
			//����
			int getKor()
			{
				return kor;
			}
			void setKor(int kor)
			{
				this.kor = kor;
			}

			//����
			int getEng()
			{
				return eng;
			}
			void setEng(int eng)
			{
				this.eng = eng;
			}
			
			//����
			int getMat()
			{
				return mat;
			}
			void setMat(int mat)
			{
				this.mat = mat;
			}
		}
		// �߰� �޼ҵ� ���� (���� ����)
		int getTot()
		{
			return kor+eng+mat;
		}
	}//end class GradeVO

class MyComparator<T>implements Comparator<T>
{
	@Override	//������
	public int compare(T o1,T o2)	//��Ҹ� �� �� ����� ��ȯ! 
	{
		GradeVO s1 = (GradeVo)o1;
		GradeVO s2 = (GradeVo)o2;

		//�й� ����(��������)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//             "18102146"					"16101596"
		// return Integer.parseInt( "18102146") - Integer.parseInt("16101596");
		// return "18102146"- "16101596";
		// return -1

		// �й� ���� (���� ����)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		//���� ����(��������)
		//return s1.getTot() - s2.getTot();		//����ؼ� Ȯ���ϼ���̤�
	
		//���� ����(��������)
		//return s2.getTot() - s1.getTot();		//����ؼ� Ȯ���ϼ���̤�

		/*
		//�̸��� ����(��������)
		//return ������;
		System.out.println(s1.getName().compareTo(s2.getName()));	
		return	s1.getName().compareTo(s2.getName());	
		*/


		//�̸��� ����(��������)
		return	s2.getName().compareTo(s1.getName());
	}
}