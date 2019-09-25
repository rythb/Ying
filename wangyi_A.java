package test;

import java.util.Scanner;

public class wangyi_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t--!=0) {
			int n = in.nextInt();
			int k = n;
			long l = 0;
			while(k > 0) {
				k /= 10;
				l++;
			}
			if(n < 10) {
				System.out.println(n);
			}else {
				int x = 0;
				x = n/9;
				int m = n%9;
				StringBuilder sb = new StringBuilder();
				if(m!=0)
					sb.append(m);
				for(int i = 0; i < x; i++) {
					sb.append("9");
				}
				System.out.println(sb.toString());
			}
		}
	}

}
