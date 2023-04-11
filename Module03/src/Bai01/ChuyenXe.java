package Bai01;

import java.util.ArrayList;
import java.util.List;

public class ChuyenXe {
	private List dsXe;
	private String maSoChuyen;
	private String hoTenTX;
	private String soXe;
	private double doanhThu;
	public ChuyenXe() {
		// TODO Auto-generated constructor stub
		this("xxx","Khong ten","0000",0.0);
	}
	public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
		super();
		setDsXe(dsXe);
		setMaSoChuyen(maSoChuyen);
		setHoTenTX(hoTenTX);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	public List getDsXe() {
		return dsXe;
	}
	public void setDsXe(List dsXe) {
		this.dsXe = dsXe;
	}
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		if (!maSoChuyen.isEmpty()) {
			this.maSoChuyen = maSoChuyen;
		}
	}
	public String getHoTenTX() {
		return hoTenTX;
	}
	public void setHoTenTX(String hoTenTX) {
		if (!hoTenTX.isEmpty()) {
			this.hoTenTX = hoTenTX;
		}
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		if (!soXe.isEmpty()) {
			this.soXe = soXe;
		}
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		if (doanhThu >= 0) {
			this.doanhThu = doanhThu;
		} else {
			doanhThu = 0;
		}
	}
	@Override
	public String toString() {
		return "ChuyenXe [maSoChuyen=" + maSoChuyen + ", hoTenTX=" + hoTenTX + ", soXe=" + soXe + ", doanhThu="
				+ doanhThu + "]";
	}
	
}