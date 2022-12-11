import java.util.Scanner;
public class TheTransposeOfTheMatrix{
    public static void main(String[] args) {
        System.out.println("Find the transpose of the matrix \n");
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix : ");
        int rows = row.nextInt();
        Scanner col = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix : ");
        int columns = col.nextInt();
        double Matrix[][] = new double[rows][columns];
        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Scanner ele = new Scanner(System.in);
                System.out.print("Enter the number in row " + (i + 1) + " and column " + (j + 1) + " : ");
                Matrix[i][j] = Double.parseDouble(ele.nextLine());
            }
        }
        transpose obj = new transpose();
        obj.matrixTranspose(Matrix, rows, columns);
    }
}
class transpose {
    public void matrixTranspose(double matrix[][], int rows, int columns ){
        double The_Matrix[][] = matrix;
        double Transpose_Matrix[][] = new double[columns][rows];
        for(int i =0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                Transpose_Matrix[j][i] = The_Matrix[i][j];
            }
        }
        display(The_Matrix, Transpose_Matrix, rows, columns);
    }
    public void display(double matrix1[][], double matrix2[][], int rows, int columns){
        System.out.println("The matrix you entered is : ");
        for(int i =0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" \n The transpose is  : ");
        for(int i =0 ; i < columns ; i++){
            for(int j = 0 ; j < rows ; j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}