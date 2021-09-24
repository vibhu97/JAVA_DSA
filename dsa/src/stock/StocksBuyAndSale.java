package stock;

public class StocksBuyAndSale {
	public static void main(String[] args) {
		int price[]= {3,5,1,7,4,0,3};
		System.out.println("Max Profit : "+maxProfit(price));
	}
	public static int maxProfit(int price[]) {
		int max=0;
		int min=price[0];
		int profit=-1;
		for(int i=0;i<price.length;i++) {
			min=Math.min(min, price[i]);
			profit=price[i]-min;
			max=Math.max(profit, max);
		}
		return max;
	}

}
