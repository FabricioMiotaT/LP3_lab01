import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        try (Scanner sc = new Scanner (System.in)) {
            do{
                vida ++;
                System.out.println("Vida:"+ vida + "\tCual es el número secreto? ");
                rp = sc.nextInt();
                if (rp == 343)
                    fl = true;
            }while(vida < 4 && !fl);
        }
        if (fl == true)
            System.out.println("Bien, Adivinaste!");
            else
            System.out.println("QUE MALO, perdiste");
        }
    }










