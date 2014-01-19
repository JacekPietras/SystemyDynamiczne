
package graph.pkgfor.latex;

import static java.lang.Math.exp;

public class GraphForLatex {

	static double f(double x){
		double y = 1+Math.exp(-x);
		y*=.5;//scale
		return y;
	}
	static double cut(double x){
		int div = 100;
		return ((double)((int)(x*div)))/div;
	}
	
	public static void main(String[] args) {
		double start=-1.75;
		double end= 3;
		double step = 0.25;
		
		System.out.print("\\draw [color=red, thick]");
		System.out.print("("+cut(start)+","+cut(f(start))+")");
		for(double i=start+step; i<=end;i+=step){
			
			System.out.print("--("+cut(i)+","+cut(f(i))+")");
			
		}
		System.out.println(";");
		
	}
	
}
