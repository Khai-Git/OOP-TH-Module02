package Bai06;

import java.io.IOException;
import java.util.jar.JarException;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private int dungTichXyLanh;
	public ThongTinDangKyXe() {
		this.chuXe = "Chua co";
		this.loaiXe = "Chua co";
		this.triGiaXe = 0;
		this.dungTichXyLanh = 0;
	}
	public ThongTinDangKyXe(String chuXe, String loaiXe, double triGiaXe, int dungTichXyLanh) throws IOException {
		super();
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGiaXe(triGiaXe);
		setDungTichXyLanh(dungTichXyLanh);
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) throws IOException {
		if (!chuXe.isEmpty())
			this.chuXe = chuXe;
		else {
			throw new java.io.IOException("Chu xe khong duoc de trong");
		}
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) throws IOException {
		if (!loaiXe.isEmpty())
			this.loaiXe = loaiXe;
		else {
			throw new java.io.IOException("Loai xe khong duoc de trong");
		}
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe) {
		if (triGiaXe >= 0)
			this.triGiaXe = triGiaXe;
	}
	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}
	public void setDungTichXyLanh(int dungTichXyLanh) {
		if (dungTichXyLanh >= 0)
			this.dungTichXyLanh = dungTichXyLanh;
	}
	public double thuePhaiNop() {
		if (dungTichXyLanh < 100) {
				return 0.01 * triGiaXe;
		} else if (dungTichXyLanh <= 200) {
			return 0.03 * triGiaXe;
		} else {
			return 0.05 * triGiaXe;
		}
	}
	public static String getTieuDe() {
		return String.format("%-25s%-15s%10s%30s%30s\n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop") + String.format("==============================================================================================================");
	}
	@Override
	public String toString() {
		return String.format("%-25s%-15s%10d%30.2f%30.2f",chuXe,loaiXe,dungTichXyLanh,triGiaXe,thuePhaiNop());
	}
}
