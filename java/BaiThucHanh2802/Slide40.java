package BaiThucHanh2802;
    import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args){
        int day;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap ngay:");
        day = scanner.nextInt();
        
        switch(day) {
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("thu hai");
                break;
             case 3:
                System.out.println("thu ba");
                break;
            case 4:
                System.out.println("thu tu");
                break;
            case 5:
                System.out.println("thu namm");
                break;
            case 6:
                System.out.println("thu sau");
                break;
            case 7:
                System.out.println("thu bay");
                break;
            default:
                System.out.println("nhap lai");
                break;
        }
    }

}

