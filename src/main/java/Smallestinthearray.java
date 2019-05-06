import java.util.Scanner;
public class Smallestinthearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array1 = {1,2,3,4,5,6,7,8,-1};
        System.out.println("vi tri xuat hien phan tu nho nhat : " + location(array1));
    }
    public static int location(int []array){
        int number = array[0];
        int index = 0;
        for (int i =1;i<array.length;i++){
            if (number > array[i]){
                number = array[i];
                index += i;

            }
        }
        return index;

    }
}
