package function;

public class Function {

	public double[][] arrayFilling(String a, String b, String c){
		int n = Integer.parseInt(a);
		int m = Integer.parseInt(b);
		int s = Integer.parseInt(c);
		
		int l = (Math.abs(n-m))/s; 
		double table[][] = new double[l][1];
		return table;
	}
	
	public double[][] function(double a, double b, double h, double array[][]) {
		
		for (double i = a; i < b; i += h) {
			for (int j = 0; j < array.length; j++) {
				
			}
		}
		return null;	
	}
}
