package Bai05;

public class HinhTamGiacDemo {
	public static void main(String[] args) {
		HinhTamGiac h1 = new HinhTamGiac(-2,-4,-9);
		HinhTamGiac h2 = new HinhTamGiac(-5,0,9);
		HinhTamGiac h3 = new HinhTamGiac(4,6,3);
		HinhTamGiac h4 = new HinhTamGiac(5,5,3);
		HinhTamGiac h5 = new HinhTamGiac(4,4,4);
		
		System.out.println(HinhTamGiac.getTieuDe());
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
	}
}