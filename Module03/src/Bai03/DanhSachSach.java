package Bai03;

import java.util.List;

public class DanhSachSach {
	private List<Sach> list;
	
	public DanhSachSach() {}
	
	public boolean them(Sach s) {
		if (!list.contains(s)) {
			list.add(s);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "DanhSachSach [list=" + list + "]";
	}
	
	public double tinhTongThanhThienSachGiaoKhao() {
		double tong = 0;
		for (Sach a: list) {
			if (list.equals("SGK")) {
				tong = tong;
			}
		}
		return 0;
	}
	
	public List<Sach> timSachGiaoKhoaTheoNhaXuatBan(String s) {
		return list;
	}
	
	public double timThanhTienCaoNhat() {
		return 0;
	}
}
