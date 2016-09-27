package main;

import function.Function;

public class Main {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double h = Double.parseDouble(args[2]);
		
		
		/*int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int s = Integer.parseInt(args[2]);*/
		
		//int l = (Math.abs(n-m))/s; 
				
		//double table[][] = new double[l][1];
		Function solution = new Function();
		solution.arrayFilling(args[0], args[1], args[2]);
		System.out.println(solution.function(a, b, h));
		 

	}

}
