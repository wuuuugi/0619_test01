package day04;

public class TV {
	private String name;
	private int year=0;
	private int inch =0;
	public TV(String name, int year, int inch) {
		this.name=name;
		this.year=year;
		this.inch=inch;
	}
	public void show(){
		System.out.println(name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}

}
