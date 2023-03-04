import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int kilos;
        
        System.out.println("Escriba su peso: ");
        kilos = entrada.nextInt();

        if(kilos < 45)
        {
            System.out.println("Es una persona delgada");
        }
        else if(kilos < 80 && kilos > 45)
        {
            System.out.println("Tienes un peso normal");
        }else
        {
            System.out.println("Es una persona obesa");
        }
    }
    
}
