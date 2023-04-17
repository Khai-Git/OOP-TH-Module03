package Bai03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Sach> list = new ArrayList<>();
		SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK", LocalDate.of(2023, 4, 20), 300000, 20, "Kim Dong", false);
		SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK", LocalDate.of(2023, 4, 21), 223000, 11, "Kim Dong", false);
		SachThamKhao stk1 = new SachThamKhao("STK", LocalDate.of(2023, 11, 2), 15000, 1, "Ohayo", 10000);
		SachThamKhao stk2 = new SachThamKhao("STK", LocalDate.of(2023, 11, 23), 11000, 100, "Ohayo", 10000);
		list.add(sgk1);
		list.add(sgk2);
		list.add(stk1);
		list.add(stk2);
		
		for (Sach a : list) {
			System.out.println(a);
		}
	}
}