import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        int dong,cot;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang:");
        dong=scanner.nextInt();
        System.out.println("Nhap vao so cot cua mang:");
        cot=scanner.nextInt();

        int [][]mang= new int[dong][cot];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i=0 ; i<dong; i++){
            for (int j=0 ; j<cot ; j++){
                System.out.print("mang[" +i+"]["+j+"]" + "\t");
                mang[i][j]=scanner.nextInt();
            }
        }
        int max =mang[0][0];
        String tem="";
        for (int i=0 ; i<dong ; i++){
            for (int j=0 ; j<cot ; j++){
                if (max<mang[i][j]){
                    max=mang[i][j];
                    tem="mang[" +i+"]["+j+"]";
                }
            }
        }
        System.out.println("Max trong mang la =" +max + " toa do: "+tem);
    }
}
