package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());	
		Differential_lib dlib = new Differential_lib(a,h);
		
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("(f(x-h)-f(x))/hのx="+a+"における微分係数は"+dlib.getDx());
		System.out.println("理論値と計算値の相対誤差は"+dlib.getRe());

	}

}
//制度が一番良いh=1249001e-12