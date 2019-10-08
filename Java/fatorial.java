import java.util.Scanner;

public class fatorial {
   
   public static int fatorial(int n) {
   	int fat = 1;
   
   	if (n > 0) {
   		fat = n * fatorial(n-1);
   	}
   
   	return fat;
   } // fim o fatorial()
   
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	int n;
   
   	System.out.println("Hello HacktoberFest!");
   	System.out.print("Digite o valor desejado para calcular o fatorial: ");
   	n = scanner.nextInt();
   
   	System.out.println(fatorial(n));
   	System.out.print("\nFim do programa.");
   } // fim do main()
   
} // fim da class