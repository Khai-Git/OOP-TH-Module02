package Bai01;

public class ChuyenXeNoiThanh {
	private int soTuyen;
	private double soKmDiDuoc;
	public ChuyenXeNoiThanh() {
		// TODO Auto-generated constructor stub
		this(0,0.0);
	}
	public ChuyenXeNoiThanh(int soTuyen, double soKmDiDuoc) {
		super();
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		if (soTuyen >= 0) {
			this.soTuyen = soTuyen;
		}
	}
	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	public void setSoKmDiDuoc(double soKmDiDuoc) {
		if (soKmDiDuoc >= 0) {
			this.soKmDiDuoc = soKmDiDuoc;
		}
	}
	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKmDiDuoc=" + soKmDiDuoc + "]";
	}
}
