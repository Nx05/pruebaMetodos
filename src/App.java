import java.util.Scanner;


public class App {

    static int MyMethod(int x, int y, int w){
        return ((5*x)*(3*w)-(7*y));
    }

    public static void main(String[] args) throws Exception { 
        int x = 0, y = 0, w = 0, z = 0;
        try( Scanner teclado = new Scanner(System.in);){

            System.out.print("Digite un valor para x: ");
            x = teclado.nextInt();

            System.out.print("Digite un valor para w: ");
            w = teclado.nextInt();

            System.out.print("Digite un valor para y: ");
            y = teclado.nextInt();

            z = MyMethod(x, y, w);

            System.out.print(z);
        }
    }     
}
