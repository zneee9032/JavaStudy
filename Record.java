/*	=========================
	�����Ŭ������ �ν��Ͻ������
	- Ŭ������ �ν��Ͻ�Ȱ��
	========================= */
/*�л� ���� ��������, ��������, ���������� �Է¹޾�
����,����� �Ի��ϴ� ���α׷��� �����Ѵ�.
��,Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
����, �̰������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�

/*Record Ŭ����
-�Ӽ��� ����*/

class Record

{
	//�л� 1���� ǥ���� �� �ִ� �Ӽ���� ����			check~!!!!
	String name;				//�̸�
	//int kor,eng,mat;			//�� ������ ����(����, ���� , ����)
	int[] score = new int[3];	//score[0] =����, score[1] = ����, score[2] =����
	int tot;					//����
	double avg;					//���
	int rank;					//����(���)

//=========================================================================================================Ŭ���� �������� �Ѿ��~!


	public void setName(String name)
	{
		this.name = name;

	}

	public String getName()

	{
		return name;
	}

	public void setScore(int a, int b, int c)	//���� ���� ���� ������ �������̴�
	{
		score[0]=a;
		score[1]=b;
		score[2]=c;
	}

	public int[] getScore()
	{
		return score;

	}

}
