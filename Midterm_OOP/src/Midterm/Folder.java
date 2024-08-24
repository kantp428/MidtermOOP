package Midterm;

public class Folder {
	private String name;
	private String date;
	private File[] files = new File[1000];	
	private Folder[] folds = new Folder[500];
	
	public Folder(String name) {
		this.name = name;
		this.date = "24/08/2024";
	}
	
	public Folder() {
		this.name = "New folder";
		this.date = "24/08/2024";
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return date;
	}
	
	public File[] getFiles() {
		return files;
	}
	public Folder[] getFolds() {
		return folds;
	}
	
	@Override
	public String toString() {
		return name+"\t"+date;
	}
	
	public boolean searchFile(String fname) {
		boolean out = false;
		for(File i : files) {
			if(i==null) continue;
			if(i.getName().equals(fname)) {
				out = true;
				break;
			}
		}
		
		return out;
	}
	
	public boolean searchFold(String fname) {
		boolean out = false;
		for(Folder i : folds) {
			if(i==null) continue;
			if(i.getName().equals(fname)) {
				out = true;
				break;
			}
		}
		
		return out;
	}
	
	public void addFile(File f) {
		if(this.searchFile(f.getName())) {
			System.out.println(f.getName()+" is in "+this.getName()+" already");
		}else {
			int emptyIndex=0;
			for(File i : files) {
				if(i==null) {
					this.files[emptyIndex] = f;
					break;
				}
				emptyIndex++;
			}
		}
	}
	
	public void addFolder(Folder f) {
		if(this.searchFold(f.getName())) {
			System.out.println(f.getName()+" is in "+this.getName()+" already");
		}else {
			int emptyIndex=0;
			for(Folder i : folds) {
				if(i==null) {
					this.folds[emptyIndex] = f;
					break;
				}
				emptyIndex++;
			}
		}
	}
	
	public void removeFile(String fname) {
		int remIndex=0;
		boolean found=false;
		for(File i : files) {
			if(i==null) continue;
			if(i.getName().equals(fname)) {
				files[remIndex] = null;
				found = true;
				break;
			}
			remIndex++;
		}
		if(!found) {
			System.out.println("There's no "+fname+" in "+this.getName());
		}
		
	}
	
	//midterm don't have remove folder
	
}
