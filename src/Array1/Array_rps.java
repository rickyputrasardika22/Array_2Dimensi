package Array1;
import java.awt.Point;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Array_rps 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ricky = new Scanner(System.in);
		int banyakData;
		int jumlah_MK;
		int totalSKS;
		int poin;
		double min, maks;
		
		System.out.print("Masukkan Banyak Data = ");
		banyakData = ricky.nextInt();
		System.out.print("Masukkan Jumlah MK = ");
		jumlah_MK = ricky.nextInt();
		System.out.println("");

		ricky.nextLine();
		//deklarasi array
		String [] nama = new String[banyakData];
		String [] npm = new String[banyakData];
		String [] prodi = new String[banyakData];
		String [] tahunMasuk = new String[banyakData];
		double [] ip = new double[banyakData];
		char [] nilaiMK = new char[jumlah_MK];
		int [] sks = new int[jumlah_MK];
		
		
		//mengisi data array
		for (int i = 0; i < banyakData; i++)
		{
			poin = 0;
			totalSKS = 0;
			System.out.println("");
			System.out.println("Data Mahasiswa Ke-" + (i+1));
			
			System.out.print("Masukkan Nama \t= ");
			nama[i] = ricky.next();
			System.out.print("Masukkan NPM \t= ");
			npm[i] = ricky.next();
//			System.out.print("Masukkan Prodi \t= ");
//			prodi[i] = ricky.nextLine();
			
			if (npm[i].substring(4, 6).equals("24"))
			{
				prodi[i] = "SI";
			}	
			else if (npm[i].substring(4, 6).equals("25"))
			{
				prodi[i] = "TI";
			}
			
			if (npm[i].substring(0, 2).equals("21"))
			{
				tahunMasuk[i] = "2021";
			}	
			else if (npm[i].substring(0, 2).equals("22"))
			{
				tahunMasuk[i] = "2022";
			}
			
			//untuk perulangan MK
			for (int j = 0; j<jumlah_MK; j++)
			{
				System.out.print("Masukkan nilai MK " + (j+1) + " = ");
				nilaiMK [j] = ricky.next().charAt(0);
				System.out.print("Masukkan SKS MK " + (j+1) + " = ");
				sks [j] = ricky.nextInt();
				if (nilaiMK[j] == 'A')
				{
					poin = poin + (sks[j]*4);
				}
				else if (nilaiMK[j] == 'B')
				{
					poin = poin + (sks[j]*3);
				}
				else if (nilaiMK[j] == 'C')
				{
					poin = poin + (sks[j]*2);
				}
				else if (nilaiMK[j] == 'D')
				{
					poin = poin + (sks[j]*1);
				}
				else
				{
					poin = poin + (sks[j]*0);
				}
				totalSKS = totalSKS + sks[j];
			}
			ip[i] = (double) poin/totalSKS;
		}
		
		System.out.println("");
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nama " + "\t" + "NPM" + "\t\t" + "Prodi" + "\t" + "Tahun Masuk" + "\tIP");
		System.out.println("-------------------------------------------------");
		
		
		//menampilkan data array
		for (int i = 0; i < banyakData; i++)
		{
			System.out.println(nama[i] + "\t" + npm[i] + "\t" + prodi[i] + "\t" + tahunMasuk[i] + "\t\t" + df.format(ip[i]));
		}
		System.out.println("-------------------------------------------------");
		
		//MENENTUKAN NILAI MAKS DAN MIN IP
		min = ip[0];
		maks = ip[0];
		
		for(int i = 1; i < banyakData; i++)
		{
			if (ip[i] < min)
			{
				min = ip[i];
			}	
			if (ip[i] > maks)
			{
				maks = ip[i];
			}	
		}	
		System.out.println("IP Maksimum = " + df.format(maks));
		System.out.println("IP Minimum = " + df.format(min));
	}
}
