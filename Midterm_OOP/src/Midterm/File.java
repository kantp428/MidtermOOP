package Midterm;

public class File {
	private String name;
	private String date;
	private double size;
	private char access;
	private Folder parent;
	
	public File(String name,String date, double size, char access) {
		this.name = name;
		this.date = date;
		this.size = size;
		this.access = access;
	}
	
	public File(double size) {
		this.name = "Untitle.txt";
		this.date = "24/08/2024";
		this.size = size;
		this.access = 'r';
	}
	
	@Override
	public String toString() {
		return name+"\t"+date+"\t"+size+"\t"+access;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public double getSize() {
		return size;
	}

	public char getAccess() {
		return access;
	}
	
	public Folder getParent() {
		return parent;
	}
	
	public void setParent(Folder parent) {
		this.parent = parent;
	}
	
	
}
