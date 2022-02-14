import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A, B, C, D, E, F, H, Hx, Hy, x, y;
        System.out.println("Nhap he so A: ");
        A = sc.nextDouble();
        System.out.println("Nhap he so B: ");
        B = sc.nextDouble();
        System.out.println("Nhap he so C: ");
        C = sc.nextDouble();
        System.out.println("Nhap he so D: ");
        D = sc.nextDouble();
        System.out.println("Nhap he so E: ");
        E = sc.nextDouble();
        System.out.println("Nhap he so F: ");
        F = sc.nextDouble();
        String strHeSo = "";
        System.out.println(" Phuong trinh thu nhat co dang: " + A + "x + " + B + "y = " + C + "");
        System.out.println(" phuong trinh thu hai co dang: " + D + "x + " + E + "y = " + F + "");
        H = A * E - D * B;
        Hx = C * E - B * F;
        Hy = A * F - D * C;
        if (H == 0) {
            if (Hx + Hy == 0)
                System.out.println("He Phuong trinh co vo so nghiem!");
            else
                System.out.println("He Phuong trinh vo nghiem!");
        } else {
            System.out.println("Phuong trinh co hai nghiem:");
            x = Hx / H;
            y = Hy / H;
            System.out.println("Phuong trinh co hai nghiem = " + x + " và y = " + y);
            sc.close();
        }
    }
}