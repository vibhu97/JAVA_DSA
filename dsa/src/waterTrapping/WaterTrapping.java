package waterTrapping;

public class WaterTrapping {
	public static void main(String[] args) {
		int a[]= {3,1,2,4,0,1,3,2};
		System.out.println(getWater(a));
		
	}
	public static int getWater(int h[]) {
		int ans=0;
		int n=h.length;
		int left[]=new int[n];
		int right[]=new int[n];
		left[0]=h[0];
		right[n-1]=h[n-1];
		for(int i=1;i<n;i++)
			left[i]=Math.max(left[i-1], h[i]);
		for(int i=n-2;i>=0;i--)
			right[i]=Math.max(right[i+1], h[i]);
		for(int i=0;i<n;i++)
			ans+=Math.min(left[i], right[i])-h[i];
		return ans;
	}

}
