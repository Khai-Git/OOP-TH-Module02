package Bai01;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		List dsXe = new ArrayList<>();
		ChuyenXeNgoaiThanh xNGT1 = new ChuyenXeNgoaiThanh("Vung Tau", 3);
		ChuyenXeNgoaiThanh xNGT2 = new ChuyenXeNgoaiThanh("Bac Lieu", 2);
		ChuyenXeNoiThanh xNT1 = new ChuyenXeNoiThanh(1, 300);
		ChuyenXeNoiThanh xNT2 = new ChuyenXeNoiThanh(2, 500);
		ChuyenXe cx = new ChuyenXe("001", "Banh Thi Hue", "4", 300000);
		
		dsXe.add(xNGT1);
		dsXe.add(xNGT2);
		dsXe.add(xNT1);
		dsXe.add(xNT2);
		dsXe.add(xNT2);
		cx.getDsXe();

	}
}