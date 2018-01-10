import java.util.Scanner;
class UjianMasuk extends Mahasiswa{
    static String jwb1, jwb2, jwb3, jwb4;
    static int skor, skor1, skor2, skor3, skor4, skor5;
    
    void industri(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                     Form Tes Jurusan Teknik Industri");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1. 5 x 2000 =");
        System.out.println("    a.10000      b. 5000");
        System.out.println("2. 625 : 5 = ");
        System.out.println("    a. 125       b.225");
        System.out.println("3. 5 + 5 = ");
        System.out.println("    a. 25       b.10");
        System.out.println("4.  55 : 11 x 20 =");
        System.out.println("    a. 25     b.100");
        

        System.out.println("Jawaban");
        System.out.print("1. ");
        jwb1 = input.nextLine();
        System.out.print("2. ");
        jwb2 = input.nextLine();
        System.out.print("3. ");
        jwb3 = input.nextLine();
        System.out.print("4. ");
        jwb4 = input.nextLine();


        if(jwb1.equalsIgnoreCase("a") || jwb1.equalsIgnoreCase("A")){
            skor1 = 25;
        }
        if(jwb2.equalsIgnoreCase("a") || jwb2.equalsIgnoreCase("A")){
            skor2 = 25;
        }
        if (jwb3.equalsIgnoreCase("b") || jwb3.equalsIgnoreCase("B")){
            skor3 = 25;
        }
        if(jwb4.equalsIgnoreCase("b") || jwb3.equalsIgnoreCase("B")){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " + skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
            System.out.println("NPM ANDA : 17111002");
        }else{
            System.out.println("Maaf Anda TIDAK LULUS");
        }


    }

    void informatika(){
        
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                    Form Tes Jurusan Teknik Informatika");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("1. Software komputer yang harus dipasang pada setiap komputer agar komputer dapat digunakan untuk bekerja adalah : ");
        System.out.println("    a. MS.Windows      b. Sistem Operasi");
        System.out.println("2. Fungsi CTRL + C pada MS Windows adalah :  ");
        System.out.println("    a. Mengatur tulisan ke tengah baris       b.Mengcopy File");
        System.out.println("3. Program komputer yang digunakan untuk mengakses informasi yang ada di internet adalah : ");
        System.out.println("    a. Browser Internet       b.HTTP");
        System.out.println("4. Software komputer yang digunakan untuk mengelola data nilai disebut : ");
        System.out.println("    a. MS.Excel     b.MS.Access");
        

        System.out.println("Jawaban");
        System.out.print("1. ");
        jwb1 = input.nextLine();
        System.out.print("2. ");
        jwb2 = input.nextLine();
        System.out.print("3. ");
        jwb3 = input.nextLine();
        System.out.print("4. ");
        jwb4 = input.nextLine();

        
        if(jwb1.equalsIgnoreCase("b") || jwb1.equalsIgnoreCase("B")){
            skor1 = 25;
        }
        if(jwb2.equalsIgnoreCase("b") || jwb2.equalsIgnoreCase("B")){
            skor2 = 25;
        }
        if (jwb3.equalsIgnoreCase("a") || jwb3.equalsIgnoreCase("A")){
            skor3 = 25;
        }
        if(jwb4.equalsIgnoreCase("a") || jwb3.equalsIgnoreCase("A")){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " + skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
            System.out.println("NPM ANDA : 17111001");
        }else{
            System.out.println("Maaf Anda TIDAK LULUS");
        }
    }
   

}