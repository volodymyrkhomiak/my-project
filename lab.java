import java.util.Scanner;
import java.lang.Math;
public class lab{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
	System.out.print("vvedit kilkist trukutnyku :");
	int n;
		n=scn.nextInt();
		int mas[]= new int[n];
		int x[]=new int[n];
		int y[]=new int[n];
		int x2[]=new int[n];
		int y2[]=new int[n];
		int x3[]=new int[n];
		int y3[]=new int[n];
		int x4[]=new int[n];
		int y4[]=new int[n];
		int S[]=new int[n];
		
		//Заповнення
		for(int i=0; i<n;i++)
		{
			mas[i] = i;
		System.out.println("Trukutnyk #"+i);
			System.out.println("Vvedit koordynaty tochka 1: ");
			System.out.println("X: ");
			x[i]=scn.nextInt();
			System.out.println("Y: ");
			y[i]=scn.nextInt();
		
		System.out.println("Vvedit koordynaty tochka 2: ");
			System.out.println("X: ");
			x2[i]=scn.nextInt();
			System.out.println("Y: ");
			y2[i]=scn.nextInt();
			
					System.out.println("Vvedit koordynaty tochka 3: ");
			System.out.println("X: ");
			x3[i]=scn.nextInt();
			System.out.println("Y: ");
			y3[i]=scn.nextInt();
		
		System.out.println("Vvedit koordynaty tochka 4: ");
			System.out.println("X: ");
			x4[i]=scn.nextInt();
			System.out.println("Y: ");
			y4[i]=scn.nextInt();
			
		double Storona1;
			Storona1=Math.sqrt(((x2[i]-x[i])*(x2[i]+x[i]))+(y2[i]-y[i])*(y2[i]+y[i]));
		System.out.println("Storona1: " + Storona1);
		
		double Storona2;
			Storona2=Math.sqrt(((x4[i]-x3[i])*(x4[i]+x3[i]))+(y4[i]-y3[i])*(y4[i]+y3[i]));
		System.out.println("Storona2: " + Storona2);
		
		double ploshcha;
		ploshcha=Storona1*Storona2;
		System.out.println("ploshcha: " + ploshcha );
		}

		int tempmas;
		int tempx;
		int tempy;
		double temps;
		for(int q=0;q<n;q++){
			for(int f =0; f<n-1; f++){
				if(x[f]>x[f+1]){
					tempmas = mas[f+1];
					mas[f+1] = mas[f];
					mas[f] = tempmas;
					
					tempx = x[f+1];
					x[f+1] = x[f];
					x[f] = tempx;
					
					tempy = y[f+1];
					y[f+1] = y[f];
					y[f] = tempy;
					
		
				}
			}
		}

		
		//Виведення
		for(int i=0; i<n; i++){
			System.out.println("Trukutnyk #"+ mas[i]);
		
			System.out.println("x: " + x[i]);
			
			System.out.println("y: " + y[i]);
			
			System.out.println("ploscha: " + ploscha);
		}
		
		}
}