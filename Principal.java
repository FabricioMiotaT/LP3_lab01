import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        try (Scanner sc = new Scanner (System.in)) {
            do{
                vida = numeroVidas(vida);
                System.out.println("Vida:"+ vida + "\tCual es el número secreto? ");
                rp = sc.nextInt();
                if (rp == 343)
                    fl = true;
            }while(vida < 4 && !fl);
        }
        if (fl == true)
            System.out.println("FELICIDADES, te ganaste un yapeo de 10 SO");
            else
            System.out.println("QUE MALO, perdiste");
        }

public static int numeroVidas(int vida){
            vida ++;
            return vida;

    }

}









