package maths;

public class TrailingZeroInFactorial {
	public static void main(String[] args) {
		System.out.println(getZeros(5));
		System.out.println(getZeros(16));
	}
	public static int getZeros(int n) {
		int ans=0;
		for(int i=5;i<=n;i=i*5)
			ans+=n/i;
		return ans;
	}

}
