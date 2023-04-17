package Bai03;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private boolean tinhTrang;
	
	public SachGiaoKhoa() {
		this.tinhTrang = true;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}
	
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		if (tinhTrang == true) {
			this.tinhTrang = tinhTrang;
		}
	}

	public double getThanhTien() {
		if (tinhTrang == true) {
			return getSoLuong() * getDonGia();
		} else {
			return getSoLuong() * getDonGia() * 50/100;
		}
	}

	@Override
	public String toString() {
		return String.format(" %s | " + getNgayNhap() + " | %.0f | %d | %s | " + (tinhTrang ? "moi" : "cu"), getMaSach(), getDonGia(), getSoLuong(), getNhaXuatBan());
	}
}
