package javatest;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		List<User> rList = new ArrayList<>();
//		List<Customer> customers = new ArrayList<>();
//		List<Staff> staffs = new ArrayList<>();
		Customer c1 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		Customer c2 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		Customer c3 = new Customer("ms-Park", "y2345", "박명수", 1200);
		Staff s1 = new Staff("master", "m7788", "운영자", 3500000);
		int i = 1;
		rList.add(s1);
		rList.add(c1);
		rList.add(c2);
		rList.add(c3);

//		s1.setId("master");
//		s1.setPw("m7788");
//		s1.setName("운영자");
//		s1.setMon(3500000);
		

//		c1.setId("jung-ws");
//		c2.setId("LeeHR");
//		c3.setId("ms-Park");
//
//		c1.setPw("j1357913579");
//		c2.setPw("a123!!");
//		c3.setPw("y2345");
//
//		c1.setName("정우성");
//		c2.setName("이효리");
//		c3.setName("박명수");
//
//		c1.setPoint(1000);
//		c2.setPoint(2500);
//		c3.setPoint(1200);

//		staffs.add(s1);
//		customers.add(c1);
//		customers.add(c2);
//		customers.add(c3);

		System.out.println("------------------회원+운영자 전체리스트--------------------------");
		
		for (User n : rList) {
			System.out.print(i + ".");
			n.showInfo();
			i++;
		}
		int year = 0;

//		for (Staff n : staffs) {
//			System.out.print(i + ".");
//			n.showInfo();
//			i++;
//		}

//		i = 1;
//		for (Customer n : customers) {
//			System.out.print(i + ".");
//			n.showInfo();
//			i++;
//		}
//
		int x = 0;
		System.out.println();
		for (User n : rList) {
		if (n instanceof Staff) {
			Staff staff = (Staff)n;
			int month = staff.getMon();
			year = month * 12;
			x++;
		}
		}
		System.out.printf("운영자의 연봉은 %d 입니다.", year/x);
//		System.out.println();
//		for (Staff n : staffs) {
//			year = n.getMon() * 12;
//		}

	}

}
