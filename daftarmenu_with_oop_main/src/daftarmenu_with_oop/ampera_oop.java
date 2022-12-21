package daftarmenu_with_oop;
import java.util.Scanner;
public class ampera_oop {
    private void welcome() {
    }
    public static void main(String[] args) {
        
        Scanner input;
        String textInBold = "";
        System.out.print("\033[0;1m"+textInBold);
        
        char  ulang;
        double TK;
        Nasgor Ngr = new Nasgor();
        Nasduk Nuk = new Nasduk();
        Naskun Nkn = new Naskun();
        Nascing Nci = new Nascing();
        Nasrik Nok = new Nasrik();
        Naslang Nlg = new Naslang();
        
        do{
            input = new Scanner (System.in);
            ampera_oop DM= new ampera_oop ();
            DM.welcome();
            System.out.println("===#Ampera#===");
            System.out.println("===Urang Awak====");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Goreng ---- Rp.12.000");
            System.out.println();
            System.out.println("2. Nasi Uduk -------- Rp.7.000");
            System.out.println();
            System.out.println("3. Nasi Kuning ------ Rp.8.500");
            System.out.println();
            System.out.println("4. Nasi Kucing ------ Rp.1.500");
            System.out.println();
            System.out.println("5. Nasi Orak-arik --- Rp.7.500");
            System.out.println();
            System.out.println("6. Nasi Magelangan - Rp.9.000");
            System.out.println();
            System.out.println("7. Keluar -- Batal Metemesan");
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Pilih [1-7] ----------------:");
            System.out.print("Masukan Pilihan Anda        : ");
            int kode = input.nextInt();
            switch(kode){
                
                case 1 :
                Ngr.setNama("Nasgor");
                Ngr.Infodaftarmenu();
                System.out.println("Harga Nasi goreng Rp.12.000");
                System.out.print("Jumlah porsi yang akan anda pesan ? ");
                Ngr.setjml1(input.nextInt());
                System.out.println("===============================");
                System.out.println("Total pesanan adalah " +Ngr.getjml1()+" porsi, seharga Rp."+Ngr.getT1());
                System.out.println("Ditambahkan ke dalam pesanan");
                break;
                
                case 2 :
                Nuk.setNama("Nasduk");
                Nuk.Infodaftarmenu();
                System.out.println("Harga Nasi Uduk Rp.7.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nuk.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nuk.getjml2()+" porsi, seharga Rp."+Nuk.getT2());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 3 :
            Nkn.setNama("Naskun");
            Nkn.Infodaftarmenu();
            System.out.println("Harga Nasi Uduk Rp.8.500");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nkn.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nkn.getjml3()+" porsi, seharga Rp."+Nkn.getT3());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 4 :
            Nci.setNama("Nascing");
            Nci.Infodaftarmenu();
            System.out.println("Harga Nasi Uduk Rp.1.500");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nci.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nci.getjml4()+" porsi, seharga Rp."+Nci.getT4());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;

            case 5 :
            Nok.setNama("Nasrik");
            Nok.Infodaftarmenu();
            System.out.println("Harga Nasi Uduk Rp.7.500");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nok.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nok.getjml5()+" porsi, seharga Rp."+Nok.getT5());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 6 :
            Nlg.setNama("Naslang");
            Nlg.Infodaftarmenu();
            System.out.println("Harga Nasi Uduk Rp.9.000");
            System.out.print("Jumlah porsi yang akan anda pesan ? ");
            Nlg.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Nlg.getjml6()+" porsi, seharga Rp."+Nlg.getT6());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
            case 7:
            System.out.println();
            System.out.println("Anda Membatalkan Pemesanan, Tidak Jadi Memesan , Terkesan Tidak Mampu !");
            System.out.println();
            System.out.println();
            System.exit(0);
            
        }
        System.out.println();
        System.out.println("Ingin Menambah Pesanan? / Mengakhiri Pesanan ?");
                System.out.print("Ya untuk menambah pesanan (enter : y) atau Mengakhiri(enter : t) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
                
            }
            while (ulang !='t');
            TK=(Ngr.getT1()+Nuk.getT2()+Nkn.getT3()+Nci.getT4()+Nok.getT5()+Nlg.getT6());
            System.out.println("Keseluruhan Menu yang Anda Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Goreng Seharga Rp.12.000 sebanyak "+Ngr.getjml1()+" porsi, dengan total harga Rp."+Ngr.getT1());
            System.out.println();
            System.out.println("2. Nasi Uduk seharga Rp.7.000 sebanyak "+Nuk.getjml2()+" porsi, dengan total harga Rp."+Nuk.getT2());
            System.out.println();
            System.out.println("3. Nasi Kuning seharga Rp.8.500 sebanyak "+Nkn.getjml3()+" porsi, dengan total harga Rp."+Nkn.getT3());
            System.out.println();
            System.out.println("4. Nasi Kucing seharga Rp.1.500 sebanyak "+Nci.getjml4()+" porsi, dengan total harga Rp."+Nci.getT4());
            System.out.println();
            System.out.println("5. Nasi Orak-arik seharga Rp.7.500 sebanyak "+Nok.getjml5()+" porsi, dengan total harga Rp."+Nok.getT5());
            System.out.println();
            System.out.println("6. Nasi Magelangan seharga Rp.9.000 sebanyak "+Nlg.getjml6()+" porsi, dengan total harga Rp."+Nlg.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan yang di Bayar Rp."+TK);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Di Ampera Urang Awak ^^");
            input.close();
            
        }
    }
    