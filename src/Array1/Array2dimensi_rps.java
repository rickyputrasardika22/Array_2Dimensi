package Array1;
import java.util.Scanner;
public class Array2dimensi_rps 
{
	public static void main(String[] args) 
	{
		//contoh array 2 dimensi
//		1	2	3		diisi baris pertama dulu baru baris ke2
//		4	5	6
//		7	8	9
		
		int [][] matriks = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		for (int i = 0; i < 3; i++) 		//perulangan baris
		{
			for (int j = 0; j<3; j++)
			{
				System.out.print(matriks[i][j] + " ");
			}
			System.out.println(); //untuk pindah baris
		}
		//----------------------------------------------------------------//
		int baris, kolom;
		Scanner ricky = new Scanner(System.in);
		System.out.print("Masukkan Baris Matriks A = ");
		baris = ricky.nextInt();
		System.out.print("Masukkan Kolom Matriks A ");
		kolom = ricky.nextInt();
		
		int [][] matriks_A = new int[baris][kolom];
		
		//input matriks
		for (int i = 0; i < baris; i++)
		{
			for (int j = 0; j<kolom; j++)
			{
				System.out.printf("Indeks [%d][%d] = ", i, j);
				matriks_A[i][j] = ricky.nextInt();
			}
		}
		
		//tampilan matriks
		for (int i = 0; i < baris; i++)
		{
			for (int j = 0; j<kolom; j++)
			{
				System.out.print(matriks_A[i][j] + " ");
			}
			System.out.println("");	
		}
	}
}
