package deberes4;

public class ejerciciosApp {

	public static void main(String[] args) {
		
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		ejercicio5 ();
		
	}
	public static void ejercicio1 () {
		int n1= 4, n2 = 5;
		System.out.println("suma : " + (n1 + n2));
		System.out.println("resta : " + (n1 - n2));
		System.out.println("multiplicacion :" + (n1 * n2));
		System.out.println ("division :" + ( n1 / n2));
		System.out.println ("resto de la division :" + (n1%n2));
	}
	
	public static void ejercicio2 () {
		int n= 4;
		double a= 20.4;
		char c = 't';
		System.out.println ("n :" + n);
		System.out.println ("a :" + a);
		System.out.println ("c :" + c);
		System.out.println ("suma :" + (n +a));
		System.out.println ("resta :" + (n - a));
		System.out.println ("valor de c :" + (int) c);
	}
	
	public static void ejercicio3 () {
		int x = 4, y = 8;
		double n = 5, m = 9;
		System.out.println("X = " + x + "\nY = " + y + "\nN = " + n + "\nM = " + m);
        System.out.println("Suma X + Y = " + (x + y));
        System.out.println("Resta X - Y = " + (x - y));
        System.out.println("Producto X * Y = " + (x * y));
        System.out.println("Cociente X / Y = " + (x / y));
        System.out.println("Resto X % Y = " + (x % y));
        System.out.println("Suma N + M = " + (n + m));
        System.out.println("Resta N - M = " + (n - m));
        System.out.println("Producto N * M = " + (n * m));
        System.out.println("Cociente N / M = " + (n / m));
        System.out.println("Resto N % M = " + (n % m));
        System.out.println("El doble de X " + (x * 2));
        System.out.println("El doble de Y " + (y * 2));
        System.out.println("El doble de N " + (n * 2));
        System.out.println("El doble de M " + (m * 2));
        System.out.println("La suma de todas las variables = " + (x + y + n + m));
        System.out.println("El producto de todas las variables = " + (x * y * n * m));
	}
	
	public static void ejercicio4 () {
		int n = 6;
		n += 77; //n = n + 77
		System.out.println (n);
		n -= 3;
		System.out.println (n);
		n *= 2;
		System.out.println (n);
	}
	
	public static void ejercicio5 () {
		int a = 3, b = 7, c =2, d =5;
		b = c;
		c = a;
		a = d;
		d = b;
		System.out.println (a + " " + b + " " + c + " " + d );
	}
}

	