import java.util.Scanner;
class Mahasiswa{
    String nama, email, mk1, mk2, mk3;
    int pil, no_hp, jurusan, bayar, semester, npm, sks, sks1, sks2, sks3;
    boolean simpan;
        
    void pembayaran(){
        Scanner input = new Scanner (System.in);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Pembayaran");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Masukkan Nominal : ");
        bayar = input.nextInt();

        if (bayar == 300000){
            System.out.println("Pembayaran Sukses !");
            registrasi();
        }else if (bayar == 4725000){
            System.out.println("Pembayaran Sukses !");
            perwalian();
        }else{
            System.out.println("Lakukan Pembayaran sesuai dengan nominal yg ditentukan !");
            pembayaran();
        }

    }
    void registrasi(){
        Scanner input = new Scanner (System.in);
        UjianMasuk ujian = new UjianMasuk();

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Pendaftaran");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Nama              : ");
        nama = input.nextLine();
        System.out.print("Email             : ");
        email = input.nextLine();
        System.out.print("No Hp             : ");
        no_hp = input.nextInt();
        System.out.println("Jurusan         : 1. Teknik Industri ");
        System.out.println("                  2. Teknik Informatika");
        System.out.print("Masukkan Pilihan  : ");
        jurusan = input.nextInt();
        switch (jurusan){
            case 1 :
                System.out.print("Teknik Industri");
                break;
            case 2 :
                System.out.print("Teknik Informatika");
                break;
            default :
            System.out.println("Masukkan Pilihan 1 - 2 !");
            registrasi();
        }

        System.out.println("");
        System.out.print("Simpan Data ? (true/false) : ");
        simpan = input.nextBoolean();

        if (simpan == true && jurusan == 1){
            System.out.println("Data Berhasil Disimpan");
            ujian.industri();
        }else if (simpan == true && jurusan == 2){
            System.out.println("Data Berhasil Disimpan");
            ujian.informatika();
        }else{
            System.out.println("Data Gagal Disimpan");
            registrasi();
        }
    }

    void perwalian(){
        Scanner input = new Scanner (System.in);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Form Perwalian");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Masukkan NPM      : ");
        npm = input.nextInt();
        System.out.print("Masukkan Semester : ");
        semester = input.nextInt();
        System.out.println("Jurusan         : 1. Teknik Industri ");
        System.out.println("                  2. Teknik Informatika");
        System.out.print("Masukkan Jurusan  : ");
        jurusan = input.nextInt();

        if (semester == 1 && jurusan == 1){
            mkIndustri();
        }else if (semester == 1 && jurusan == 2){
                mkInformatika();
        }else{
                perwalian();
            }

    }
    void mkIndustri(){
        
    }
    void mkInformatika(){

            Scanner input = new Scanner (System.in);

            System.out.println("");
            System.out.println("Jumlah SKS yang harus diambil adalah : 9");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("                                Daftar Mata Kuliah");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("a. Agama                  3 SKS");
            System.out.println("b. pancasila              4 SKS");
            System.out.println("c. Agama                  2 SKS");
            System.out.println("d. pancasila              6 SKS");
            System.out.println("Input Mata Kuliah yang akan diambil (a/ b/c): ");
            System.out.print("1. ");
            mk1 = input.nextLine();
            System.out.print("2. ");
            mk2 = input.nextLine();
            System.out.print("3. ");
            mk3 = input.nextLine();

            System.out.print("Simpan Data ? (true/false) : ");
            simpan = input.nextBoolean();

            if (mk1 == "a" ){
                sks1 = 3;
            }else if(mk1 == "b"){
                sks1 = 4;
            }else if (mk1 == "c"){
                sks1 = 2;
            }else if (mk1 == "d"){
                sks1 = 6;
            }

            if (mk2 == "a" ){
                sks2 = 3;
            }else if(mk2 == "b"){
                sks2 = 4;
            }else if (mk2 == "c"){
                sks2 = 2;
            }else if (mk2 == "d"){
                sks2 = 6;
            }

            if (mk3 == "a" ){
                sks3 = 3;
            }else if(mk3 == "b"){
                sks3 = 4;
            }else if (mk3 == "c"){
                sks3 = 2;
            }else if (mk3 == "d"){
                sks3 = 6;
            }

            sks = sks1 + sks2 + sks3;

            if (sks == 9){
                System.out.println("berhasil");
            }else{
                System.out.println("gagal");
            }         

        
    }
}