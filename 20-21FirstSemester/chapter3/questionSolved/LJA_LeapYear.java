package questionSolved;
//静态导入java.lang(package)的System(class)的out静态属性
import static java.lang.System.out;
import java.util.*;
//刘家安的水仙花数作业
public class LJA_LeapYear {
	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		//初始化方法中的局部变量x
		int x=0,a,b,c;
		//实用交互细节
		String line = "========================";
		out.println(line);
		out.println("[请输入三位整数查看是否为水仙花数]");
		
		//无限循环机制，只有输入格式正确才能触发break结束循环
		while(1==1) {
			//String：字符串数据类型，属于引用数据类型中的一个类
			String T = type.next();
			//尝试执行可能出现异常的代码
			try {
				//使用Integer类中的parseInt方法，将String类型的数字转换成int型
				x = Integer.parseInt(T);
				if (x<1000&&x>99) {
					break;
				}
				else {
					out.println(line);
					out.println("[范围错误,请输入三位整数]");
				}
				//捕获异常，命名异常类，执行异常处理
			}
			catch(Exception abc) {
				out.println(line);
				out.println(abc);
				out.println("[操作错误，请输入三位整数]");
			}
		}
		
		/*
		 * 必须初始化变量x，原因如下：
		 * 若前面是常规的计次有限循环，且的确出现错误输入，那么在try中x将无法被赋值
		 * 而int型变量默认初始值为0，故以下代码可正常运行
		 * 若错误输入为非三位数字，最终会打印该数字不是水仙花数
		 * 若错误输入为非数字，最终会打印0不是水仙花数
		 *
		*/
		a = x/100;
		b = x/10%10;
		c = x%10;
		/*
		 * 方法：Math.pow(a,b)
		 * 作用：计算a的b次幂
		 * 参数：	a:底数
		 * 				b:指数
		 * 返回类型：double型
		 * 返回值：a的b次幂的值
		 */
		double flower1 = Math.pow(a, 3);
		double flower2 = Math.pow(b, 3);
		double flower3 = Math.pow(c, 3);
		int FLOWER = (int)(flower1+flower2+flower3);
		if(x == FLOWER) {
		out.println(x+"是水仙花数");
		}
		else {
		out.println(x+"不是水仙花数");
		}
	}
}
//20.10.18