import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        //khai báo số dòng và số cột của ma trận 
int m, n;
Scanner scanner = new Scanner(System.in);
System.out.println("nhap vao so dong cua ma tran: ");
m = scanner.nextInt();
System.out.println("nhap vao so cot cua ma tran: ");
n = scanner.nextInt();
// khai báo ma trận A có m dòng, n cột
int A[][] = new int[m][n];
System.out.println("nhap cac phan tu cho ma tran: ");
for (int i = 0; i < m; i++) {
   for (int j = 0; j < n; j++) {
System.out.print("A[" + i + "]["+ j + "]= ");
A[i][j] = scanner.nextInt();  
	}    
}
 // tìm phần tử có giá trị lớn nhất trong ma trận
// giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
int max = A[0][0];
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
       if (max < A[i][j]) {
           max = A[i][j];
         } 
      }  }
 System.out.println("phan tu lon nhat cua ma tran la = " + max);
}

    }

