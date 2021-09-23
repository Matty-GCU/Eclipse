package chapter4;
import static myUtil.Printer.*;

import java.lang.Math;

public class H6_StaticAndOverload {

	public static void main(String[] args) {
		p(Math.E);					//双精度浮点数，返回自然对数e的近似值
		p(Math.PI);					//双精度浮点数，返回圆周率pi的近似值
		double a = 2.4;
		p(a);
		p(Math.sin(a));			//返回参数（弧度）的正弦值
		p(Math.cos(a));			//返回参数（弧度）的余弦值
		p(Math.ceil(a));			//返回对参数进行向上取整的结果
		p(Math.floor(a));			//返回对参数进行向下取整的结果
		p(Math.log(a));			//返回参数的自然对数
		p(Math.sqrt(a));			//返回参数的算术平方根
		p(Math.round(a));		//返回对参数进行四舍五入取整的结果
		p(Math.exp(a));			//返回e的参数次幂
		String s = "CHINA";
		p(s.length());				//返回字符串（本质是字符型数组）的长度
		p(s.substring(4));		//返回该下标对应的子字符串的值
		p(s.indexOf("H"));		//返回该子字符串对应的下标
	}

}
//20201208