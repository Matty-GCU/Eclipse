package part01;

public class Example8_10 {

	public static void main(String[] args) {
		String str = "欢迎大家访问http://www.xiaomi.cn了解参观公司";
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		//http://或www
		//.（0或1次)
		//可用于标识符的字符(1次或多次）
		//.（恰好1次）
		//可用于标识符的字符(1次或多次）
		//.（恰好1次）
		//字母（1次或多次）
		
		//等价写法：System.out.printf("替换\n\"%s\"\n中的网站链接信息后得到的字符串:\n", str);
		System.out.println("替换");
		System.out.println("\"" + str + "\"");
		System.out.println("得到的字符串：");
		String strNew = str.replaceAll(regex, "******");
		System.out.println(strNew);
		
		String money = "89,235,678$";
		System.out.println(money + "转化为数字：");
		String s = money.replaceAll("[,\\p{Sc}]","");
		//匹配到逗号就换成空，匹配到货币符号也换成空
		long number = Long.parseLong(s);
		System.out.println(number);
	}

}