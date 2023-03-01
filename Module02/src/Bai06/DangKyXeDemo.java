package Bai06;

import java.io.IOException;
import java.util.Scanner;

public class DangKyXeDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Thu Loan", "Future Neo", 35000000, 100);
		ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Le Minh Tinh", "Ford Ranger", 250000000, 3000);
		ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh Triet", "Landscape", 1000000000, 1500);
		System.out.println(ThongTinDangKyXe.getTieuDe());
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
		System.out.print("\nBan muon nhap bao nhieu chiec xe: ");
		int n = sc.nextInt();
		
		ThongTinDangKyXe[] arr = new ThongTinDangKyXe[n];
		for (int i = 0; i < arr.length; i++) {
			sc.nextLine();
			System.out.println("Nhap thong tin chiec xe thu " + (i+1));
			System.out.print("Ten chu xe: ");
			String tenChuXe = sc.nextLine();
			System.out.print("Loai xe: ");
			String loaiXe = sc.nextLine();
			System.out.print("Dung tich xe: ");
			int dungTich = sc.nextInt();
			System.out.print("Tri gia xe: ");
			double triGiaXe = sc.nextDouble();
			ThongTinDangKyXe xeNew = new ThongTinDangKyXe(tenChuXe, loaiXe, triGiaXe, dungTich);
			arr[i] = xeNew;
		}
		System.out.println("\nThong tin danh sach sau khi cap nhat :\n");
		System.out.println(ThongTinDangKyXe.getTieuDe());
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
		for (ThongTinDangKyXe dsThongTin : arr) {
			System.out.println(dsThongTin);
		}
	}
}
