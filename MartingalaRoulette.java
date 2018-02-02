import java.util.Random;
import java.util.Scanner;

public class MartingalaRoulette {
	
	public static void main(String[] args) {
		/** MARTINGALA */
		final Random rd = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("Saldo: ");
		int s1 = in.nextInt();
		System.out.print("Probabilidad/Seguridad: ");
		double prob = in.nextDouble();
		while (prob <= 0 || prob >= 100) {
			System.out.print("Probabilidad/Seguridad debe ser mayor de 0 y menor que 100!: ");
			prob = in.nextDouble();
		}
		System.out.print("Número de apuestas (infinity = -1): ");
		int max = in.nextInt();
		if (max == -1) max = Integer.MAX_VALUE;
		System.out.print("Meta de beneficios (infinity = -1): ");
		int meta = s1 + in.nextInt();
		if (meta < s1) meta = Integer.MAX_VALUE;
		System.out.print("Sistema 50% o 66%: ");
		boolean doblar = in.next().equals("50");
		int r;
		if (doblar)
			r = (int)((Math.log(-100/(prob-100))/Math.log(2)) + 1);
		else
			r = (int)(-(Math.log(1-prob/100))/(Math.log(37) - Math.log(13))) + 1;
		int x1;
		if (doblar)
			x1 = (int)(s1/(Math.pow(2, r) - 1));
		else {
			double xCheck = s1/(Math.pow(3, r) - 1);
			x1 = (int)xCheck < xCheck ? (int)xCheck : (int)xCheck - 1;
		}
		System.out.println("\nSeguridad hasta ronda: " + r);
		if (x1 >= 1) {
			System.out.println("Apostando " + x1 + " en " + (doblar ? "pares." : "2a 12 y 3a 12."));
			in.nextLine();
			int s = s1;
			int w = 0, l = 0;
			int i = 0, x = x1;
			while (i < max && s < meta && s > 0 && x <= s) {
				System.out.print("X = " + x + " | ");
				int n = rd.nextInt(37);
				if (n == 0) {
					s -= x;
					System.out.println("L (0) | " + "-" + x + " | " + s);
					x = doblar ? x << 1 : x*3;
					++l;
				}
				else if ((doblar && n%2 == 0) || (!doblar && n > 12)) {
					s += x;
					System.out.println("W | " + "+" + x + " | " + s);
					x = x1;
					++w;
				}
				else {
					s -= x;
					System.out.println("L | " + "-" + x + " | " + s);
					x = doblar ? x << 1 : x*3;
					++l;
				}
				++i;
			}
			
			System.out.println();
			
			if (i >= max)
				System.out.println("Se ha alcanzado la máxima ronda.");
			else if (s <= 0)
				System.out.println("Te quedaste sin dinero, pedazo de pobre. Pide un préstamo al banco de la esquina.");
			else if (x > s)
				System.out.println("No puedes apostar más.");
			else if (s >= meta)
				System.out.println("¡Qué suerte! ¡Ya eres un millonetis! Ve a gastártelo en otra ruleta.");
			System.out.println("STATS: Total ("+(w+l)+") / Won ("+w+") / Lost ("+l+") / " + String.format("%.2f", 100*((double)w/(w+l))) + "%");
			System.out.println("SALDO: " + s);
		}
		else
			System.out.println("Apuesta mínima inferior a 1");
		in.close();
	}

}