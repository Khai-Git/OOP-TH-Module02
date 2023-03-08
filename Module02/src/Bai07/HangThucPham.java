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
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = ngaySanXuat;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang.isEmpty()) {
			this.tenHang = "xxx";
		} else {
			this.tenHang = tenHang;
		}
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else {
			this.donGia = 0;
		}
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isAfter(ngaySanXuat.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else {
			this.ngaySanXuat = LocalDate.now();
		}
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		} else {
			this.ngayHetHan = ngaySanXuat;
		}
	}
	@Override
	public String toString() {
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]";
	}
	
}
