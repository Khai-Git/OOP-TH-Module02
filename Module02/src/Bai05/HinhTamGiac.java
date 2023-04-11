package Bai05;

public class HinhTamGiac {
	private double ma;
	private double mb;
	private double mc;
	public HinhTamGiac() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}
	private boolean isTamGiac(double ma, double mb, double mc) {
		if(ma + mb > mc && ma + mc > mb && mb + mc > ma)
			return true;
		return false;
	}
	public HinhTamGiac(double ma, double mb, double mc) {
		super();
		if (ma < 0 || mb < 0 || mc < 0 || !isTamGiac(ma, mb, mc)) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		if(ma >= 0 && isTamGiac(ma, mb, mc))
			this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		if(mb >= 0 && isTamGiac(ma, mb, mc))
			this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		if(mc >= 0 && isTamGiac(ma, mb, mc))
			this.mc = mc;
	}
	public String checkTamGiac() {
		if (!isTamGiac(ma, mb, mc)) {// Khong phai tam giac
			return "Khong phai tam giac";
		} else if ((ma == mb && ma != mc && mb != mc) || (mb == mc && mb != ma && mc != ma) || (ma == mc && ma != mb && mc != mb)){// Tam giac can
			return "Can";
		} else if (ma == mb && mb == mc && ma == mc) {//Tam giac deu
			return "Deu";
		} else {
			return "Thuong";
		}
	}
	public double chuViTamGiac() {
		return ma+mb+mc;
	}
	public double dienTichTamGiac() {
		double p = (ma+mb+mc)/2;
		
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
//	@Override
//	public String toString() {
//		return "HinhTamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", checkTamGiac()=" + checkTamGiac() + ", Ptg()=" + Ptg() + ", Stg()=" + Stg() + "]";
//	}
	public static String getTieuDe() {
		return String.format("%15s|%8s|%8s|%20s|%17s|%17s|","ma","mb","mc","LoaiTamGiac","Chu vi","Dien tich");
	}
	@Override
	public String toString() {
		return String.format("%15.2f|%8.2f|%8.2f|%20s|%17.2f|%17.2f|",ma,mb,mc,checkTamGiac(),chuViTamGiac(),dienTichTamGiac());
	}
	
}
