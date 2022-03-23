package test01;

import java.util.Scanner;

public class P1420 {

	//20220214Âå¹ÈP1420
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		int prevX = sc.nextInt(), count = 1;
		for(int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if(x - prevX == 1) {
				count++;
			}
			else {
				ans = Math.max(count, ans);
				count = 1;
			}
			prevX = x;
		}
		ans = Math.max(count, ans);
		System.out.println(ans);
		sc.close();
	}

}
