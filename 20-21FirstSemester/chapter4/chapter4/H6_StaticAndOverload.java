package chapter4;
import static myUtil.Printer.*;

import java.lang.Math;

public class H6_StaticAndOverload {

	public static void main(String[] args) {
		p(Math.E);					//˫���ȸ�������������Ȼ����e�Ľ���ֵ
		p(Math.PI);					//˫���ȸ�����������Բ����pi�Ľ���ֵ
		double a = 2.4;
		p(a);
		p(Math.sin(a));			//���ز��������ȣ�������ֵ
		p(Math.cos(a));			//���ز��������ȣ�������ֵ
		p(Math.ceil(a));			//���ضԲ�����������ȡ���Ľ��
		p(Math.floor(a));			//���ضԲ�����������ȡ���Ľ��
		p(Math.log(a));			//���ز�������Ȼ����
		p(Math.sqrt(a));			//���ز���������ƽ����
		p(Math.round(a));		//���ضԲ���������������ȡ���Ľ��
		p(Math.exp(a));			//����e�Ĳ�������
		String s = "CHINA";
		p(s.length());				//�����ַ������������ַ������飩�ĳ���
		p(s.substring(4));		//���ظ��±��Ӧ�����ַ�����ֵ
		p(s.indexOf("H"));		//���ظ����ַ�����Ӧ���±�
	}

}
//20201208