package ejercicio1;

public class Serie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int  N1, N2, Sum;
	       Sum = 0;
	       N1 = 0;
	       N2 = 1;

	       while (N1 < 100) 
	       {
	           if (N2 > N1) 
	           {
	               Sum = N1 + N2;
	           }

	           N1++;
	           N2++;

	           System.out.println("El resultado de la suma es: " + Sum);
	       }
	       
	 }
	
}
