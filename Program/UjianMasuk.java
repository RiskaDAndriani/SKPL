import java.util.Scanner;
class UjianMasuk extends Mahasiswa{
    static String tanya1, tanya2, tanya3, tanya4;
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
        tanya1 = input.nextLine();
        System.out.print("2. ");
        tanya2 = input.nextLine();
        System.out.print("3. ");
        tanya3 = input.nextLine();
        System.out.print("4. ");
        tanya4 = input.nextLine();


        if(tanya1 == "a"){
            skor1 = 25;
        }
        if(tanya2 == "a"){
            skor2 = 25;
        }
        if (tanya3 == "b"){
            skor3 = 25;
        }
        if(tanya4 == "b"){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " +skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
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
        tanya1 = input.nextLine();
        System.out.print("2. ");
        tanya2 = input.nextLine();
        System.out.print("3. ");
        tanya3 = input.nextLine();
        System.out.print("4. ");
        tanya4 = input.nextLine();


        if(tanya1 == "b"){
            skor1 = 25;
        }
        if(tanya2 == "b"){
            skor2 = 25;
        }
        if (tanya3 == "a"){
            skor3 = 25;
        }
        if(tanya4 == "a"){
            skor4 = 25;
        }

        skor = skor1 + skor2 + skor3 + skor4;
        System.out.println("Skor Anda : " +skor);

        if(skor == 100 || skor == 75 || skor == 50){
            System.out.println("Selamat Anda LULUS");
            System.out.println("NPM ANDA : 17111001");
        }else{
            System.out.println("Maaf Anda TIDAK LULUS");
        }
    }
   

}