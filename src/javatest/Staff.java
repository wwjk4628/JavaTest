package javatest;

public class Staff extends User {
	private int mon;

	public Staff() {
		
	}

	public Staff(String id, String pw, String name, int mon) {
		super.setId(id);
		super.setPw(pw);
		super.setName(name);
		this.mon = mon;
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getPw() {
		// TODO Auto-generated method stub
		return super.getPw();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void setPw(String pw) {
		// TODO Auto-generated method stub
		super.setPw(pw);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t월급:" + mon;
	}

	
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + "\t월급:" + mon);
	}
}
