package Bai07;

import java.time.LocalDate;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public HangThucPham() {
		this.maHang = "Trong";
		this.tenHang = "Trong";
		this.donGia = 0;
		
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
}
