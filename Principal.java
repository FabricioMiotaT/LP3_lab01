import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("vida: "+ vida + "\t¿cual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}
		while ( vida < 3 && !fl);
		if (fl == true) {
			String Regalito = Regalo.elegir(vida);
			System.out.println("Acabas de ganar...."+ Regalito + "......");
		}
		else
			System.out.println("ups, perdiste....");
		}
	public static int numeroVidas(int vida) {
		vida ++;
		return vida;
	}

}