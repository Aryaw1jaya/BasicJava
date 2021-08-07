package kalkulator;

import javax.swing.JOptionPane;

public class kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        float n1,n2,pilih,hasil;
        input=JOptionPane.showInputDialog(" Pilih Menu \n "
                                        + "================================ \n "
                                        + "1. Penjumlahan \n "
                                        + "2. Pengurangan \n "
                                        + "3. Perkalian \n "
                                        + "4. Pembagian \n "
                                        + "================================");
        pilih   = Integer.parseInt(input);
        input   = JOptionPane.showInputDialog("Masukkan Angka Pertama");
        n1      = Integer.parseInt(input);
        input   = JOptionPane.showInputDialog("Masukkan Angka Kedua");
        n2      = Integer.parseInt(input);
            if(pilih==1)
            {
                hasil=n1+n2;
                JOptionPane.showMessageDialog( null,"Hasilnya : " + hasil ,"Thank You!", JOptionPane.INFORMATION_MESSAGE );
            }
            else if(pilih==2)
            {
                hasil=n1-n2;
                JOptionPane.showMessageDialog( null,"Hasilnya : " + hasil ,"Thank You!", JOptionPane.INFORMATION_MESSAGE );
            }
            else if(pilih==3)
            {
                hasil=n1*n2;
                JOptionPane.showMessageDialog( null,"Hasilnya : " + hasil ,"Thank You!", JOptionPane.INFORMATION_MESSAGE );
            }
            else if(pilih==4)
            {
                hasil=n1/n2;
                JOptionPane.showMessageDialog( null,"Hasilnya : " + hasil ,"Thank You!", JOptionPane.INFORMATION_MESSAGE );
            }
            else
            {
                JOptionPane.showMessageDialog( null,"Kode Yang Anda Masukkan Salah" ,"ERROR MASBRO!!!", JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }