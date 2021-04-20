package uts;
import java.util.Scanner;
public class nomor_1 {
    
   public static void shellSort (int[] arr) {
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >=1){
            jarak = jarak/2;
            Sudah = true;
            while (Sudah){
                Sudah = false;
                for (j=0;j<n-jarak;j++){
                    i = j+jarak;
                    C++;
                    if (arr[j]>arr[i]){
                        temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
        
        
    }
    public static void tampil(int data[]) {
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data[]={3,10,4,2,8,13};
        nomor_1.tampil(data);
        nomor_1.shellSort(data);
        int search=8;
        int IndeksAwal=0;
        int IndeksAkhir=data.length-1;
        int ketemu = 0;
        int point=0;
        
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        while((IndeksAwal<=IndeksAkhir)&&(ketemu==0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+point);
            if(search == data[point]){
                ketemu = 1;
                System.out.println("Data "+search+" Telah Ditemukan di indeks ke : "+point);
                }else if (search<data[point]){
                    System.out.println("Cari di kiri ");
                    IndeksAkhir = point-1;
                }
                else{
                    IndeksAwal = point+1;
                    System.out.println("Cari di kanan");
                }
        }
        if(ketemu==1){
            System.out.println("Kesimpulan : Data diTemukan ");
        }else{
            System.out.println("Kesimpulan : Data tidak ditemukan ");
        }
        
    }
}