import java.util.Scanner;

public class Massiv1 {
    private static int poiskmax (int[] mas) {
        int mmax = mas[0];
        for (int ma : mas) {
            if (mmax < ma)
                //Если мах меньше элемента массива - меняем мах
                mmax = ma;
        }
        return mmax;
    }
    private static int poiskmin (int[] mas) {
        int mmin = mas[0];
        for (int ma : mas) {
            if (mmin > ma)
                //Если мin больше элемента массива - меняем мin
                mmin = ma;
        }
        return mmin;
    }
    private static double rassrd (int[] mas) {
        double msrd = 0;
        for (int ma : mas) {
            msrd += ma;
        }
        return msrd;
    }
    private static int[] newmas (int raz,int min,int max) {
        int[] mas = new int[raz];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * ((max-min) +1 )) + min;
        }
        return mas;
    }
    public static void main (String[] args){
        int raz=5;
        int min=0;
        int max=100;
        int[] m1 = newmas (raz,min,max);
        for (int value : m1) {
            System.out.println("элемент массива 1 " + value);
        }
        System.out.println("Max: " + poiskmax(m1));
        System.out.println("Min: " + poiskmin(m1));
        System.out.println("Srd: " + rassrd(m1));
        int[] m2 = m1.clone();
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length-i-1; j++) {
                if (m2[j] > m2[j+1]) {
                    int sum = m2[j];
                    m2[j]=m2[j+1];
                    m2[j+1]=sum;
                }

            }
        }
        for (int j : m2) {
            System.out.println("элемент массива 2 " + j);
        }
        Scanner c = new Scanner(System.in);
        System.out.print("введите число исключение из массива: ");
        int s = c.nextInt();
        int met=1;
        int sch=0;
        m2[0]=m2[m2.length-1];
        while (met == 1) {
            met=0;
            for (int i = 0; i < m2.length-sch; i++) {
                if (m2[i] == s) {
                    for (int k = i; k < m2.length-sch-1; k++) {
                        m2[k]=m2[k+1];
                    }
                    sch++;
                    met=1;
                    break;
                }
            }
        }
        int[] m3 = new int[m2.length-sch];
        for (int i = 0; i < m2.length-sch; i++) {
            m3[i] = m2 [i];
            System.out.println("элемент массива 3 " + m3[i]);
        }
    }
}