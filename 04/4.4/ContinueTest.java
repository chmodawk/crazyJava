

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ContinueTest
{
	public static void main(String[] args)
	{
		// һ���򵥵�forѭ��
		for (int i = 0; i < 3 ; i++ )
		{
			System.out.println("i��ֵ��" + i);
			if (i == 1)
			{
				// ���Ա���ѭ����ʣ�����
				continue;
			}
			System.out.println("continue���������");
		}
	}
}