public class Massiv {
	double poiskmax (mas[]) {
		double mmax;
		for (int i = 0; i < mas.length; i++) {
			if (mmax < prim[i]) 
    			//Если мах меньше элемента массива - меняем мах
    			mmax = prim[i];
		}
		return mmax,i;
	}
	double poiskmin (mas[]) {
		double mmin;
		for (int i = 0; i < mas.length; i++) {
			if (mmin > prim[i])
			//Если мin больше элемента массива - меняем мin
    			mmin = prim[i];
		}
		return mmin,i;
	}
	double rassrd (mas[]) {
		double msrd;
		for (int i = 0; i < mas.length; i++) {
			msrd = msrd + prim[i];
		}
		return msrd;
	}
	int newmas (int raz,int min,int max) {
		int[] prim = new int[raz];
		for (int i = 0; i < prim.length; i++) {
   			int prim[i] = (Math.random()*((max-min)+1))+min;
		}
		return prim[];
	}
	public static void main (String args[]){
		m1 = newmas(5,0,100);
		for (int i = 0; i < m1.length; i++) {
			System.out.println("'элемент массива " + m1[i]);
		}
		System.out.println("Max: " + m1.poiskmax(m1).mmax);
		System.out.println("Min: " + m1.poiskmin(m1).mmin);
		System.out.println("Srd: " + m1.rassrd(m1));
	}
}