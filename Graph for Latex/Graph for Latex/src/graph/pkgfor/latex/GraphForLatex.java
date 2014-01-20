
package graph.pkgfor.latex;

public class GraphForLatex {
		static double start;
		static double end;
		static double step;
		

	static double f(double x){
		double y = Math.sqrt(x*x-.2);
		return y;
	}
	static double f2(double x){
		double y = Math.sqrt(x*x+.2);
		return y;
	}
	static double cut(double x){
		int div = 100;
		return ((double)((int)(x*div)))/div;
	}
	
	public static void main(String[] args) {
		start = -3;
		end = 0;
		step = 0.0625;
		
		System.out.print("\\draw [color=blue]");
		if(f(start)>-3&&f(start)<3)
			System.out.print("("+cut(start)+","+cut(f(start))+")");
		for(double i=start+step; i<=end;i+=step)
			if(f(i)>-3&&f(i)<3)
				System.out.print("--("+cut(i)+","+cut(f(i))+")");
		
		
		for(double i=end; i>=start;i-=step)
			if(f(i)>-3&&f(i)<3)
				System.out.print("--("+cut(i)+","+cut(-f(i))+")");
		System.out.println(";");
		
		
		start = 0;
		end = 3;
		step = 0.0625;
		
		System.out.print("\\draw [color=blue]");
		if(f(start)>-3&&f(start)<3)
			System.out.print("("+cut(start)+","+cut(f(start))+")");
		for(double i=end; i>=start;i-=step)
			if(f(i)>-3&&f(i)<3)
				System.out.print("--("+cut(i)+","+cut(f(i))+")");
		
		
		for(double i=start+step; i<=end;i+=step)
			if(f(i)>-3&&f(i)<3)
				System.out.print("--("+cut(i)+","+cut(-f(i))+")");
		System.out.println(";");
		
		start = -3;
		end = 3;
		step = 0.0625;
		
		System.out.print("\\draw [color=blue]");
		if(f2(start)>-3&&f2(start)<3)
			System.out.print("("+cut(start)+","+cut(f2(start))+")");
		for(double i=start+step; i<=end;i+=step)
			if(f2(i)>-3&&f2(i)<3)
				System.out.print("--("+cut(i)+","+cut(f2(i))+")");
		System.out.println(";");
		
		
		System.out.print("\\draw [color=blue]");
		if(-f2(start)>-3&&-f2(start)<3)
			System.out.print("("+cut(start)+","+cut(-f2(start))+")");
		for(double i=start+step; i<=end;i+=step)
			if(-f2(i)>-3&&-f2(i)<3)
				System.out.print("--("+cut(i)+","+cut(-f2(i))+")");
		System.out.println(";");
		
		
		
	}
	
}
