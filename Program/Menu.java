import java.util.Scanner;
public class Menu{
        int pil;
        Keuangan pay = new Keuangan();
        
        void printMenu(){
        
        Scanner in = new Scanner (System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                      Menu");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1. Registrasi");
        System.out.println("2. Perwalian");
        System.out.println("3. Exit");
        System.out.print("Masukkan Pilihan : ");
        pil = in.nextInt();
        switch (pil){
            case 1:
                pay.bayarRegis();
                break;
            case 2 :
                pay.bayarPerwalian();
                break;
            case 3: 
                break;
            default :
            System.out.println("Masukkan Pilihan 1 - 3 !");
            printMenu();
            
        }
        

    }

    }
