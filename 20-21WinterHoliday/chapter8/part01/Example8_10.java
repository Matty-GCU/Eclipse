package part01;

public class Example8_10 {

	public static void main(String[] args) {
		String str = "��ӭ��ҷ���http://www.xiaomi.cn�˽�ι۹�˾";
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		//http://��www
		//.��0��1��)
		//�����ڱ�ʶ�����ַ�(1�λ��Σ�
		//.��ǡ��1�Σ�
		//�����ڱ�ʶ�����ַ�(1�λ��Σ�
		//.��ǡ��1�Σ�
		//��ĸ��1�λ��Σ�
		
		//�ȼ�д����System.out.printf("�滻\n\"%s\"\n�е���վ������Ϣ��õ����ַ���:\n", str);
		System.out.println("�滻");
		System.out.println("\"" + str + "\"");
		System.out.println("�õ����ַ�����");
		String strNew = str.replaceAll(regex, "******");
		System.out.println(strNew);
		
		String money = "89,235,678$";
		System.out.println(money + "ת��Ϊ���֣�");
		String s = money.replaceAll("[,\\p{Sc}]","");
		//ƥ�䵽���žͻ��ɿգ�ƥ�䵽���ҷ���Ҳ���ɿ�
		long number = Long.parseLong(s);
		System.out.println(number);
	}

}