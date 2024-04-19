package javatest;

public class Customer extends User {
	private int point;
	
	
	public Customer() {
	}

	public Customer(int point) {
		this.point = point;
	}
	public Customer(String id, String pw, String name, int point) {
		super.setId(id);
		super.setPw(pw);
		super.setName(name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
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
		return super.toString() + "\t포인트:" + point;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
				System.out.println(super.toString() + "\t포인트:" + point);
	}
}
