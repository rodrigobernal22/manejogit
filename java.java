import java.util.Scanner;
public class E021i_dosnumerosdiv{
	public static void main(String[] arg){
		
		Scanner sc= new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.printf("Introduce un numero: ");
		n1= sc.nextInt();
		
		System.out.printf("Introduce un numero: ");
		n2= sc.nextInt();
		
		if (n1==0||n2==0){
			System.out.printf("Uno de los numeros es cero");
			
		}else{
			if (n1%n2==0){
				System.out.printf("El segundo numero es divisor del primero");
			}else{
				System.out.printf("El segundo no numero es divisor del primero");
			}
		}
	}
}
