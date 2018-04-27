
public class Task5 {
	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		int gcd;
		int lcm;
		
		//blacklittle：不會寫啦～ T__T
		
		for(int x=a; x>1; x--) {
			if(a%x==0 && b%x==0) {
				lcm=x;
				gcd=a*b/lcm;
				System.out.println(a + " 跟 " + b + " 的 LCM 為 " + lcm);
				System.out.println(a + " 跟 " + b + " 的 GCD 為 " + gcd);
				break;
			}	
		}
	}
}
