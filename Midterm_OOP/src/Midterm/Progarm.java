package Midterm;

public class Progarm {
	
	public static void displayFold(Folder F) {
		System.out.println("\nDisplay Folder: "+F.getName());
		System.out.println("Folders: ");
		double sum_size=0;
		double sum_size_withFold=0;
		for(Folder i : F.getFolds()) {
			if(i==null) continue;
			System.out.println(i);
			for(File j : i.getFiles()) {
				if(j==null) continue;
				sum_size_withFold+=j.getSize();
			}
		}
		System.out.println();
		System.out.println("Files: ");
		for(File i : F.getFiles()) {
			if(i==null) continue;
			System.out.println(i);
			sum_size += i.getSize();
		}
		
		sum_size_withFold += sum_size;
		System.out.println("\nSize: "+(int)sum_size+" //not include folder size");
		System.out.println("Size: "+(int)sum_size_withFold+" //include folder size");
		System.out.println("///////////////////////////");
	}
	
	public static void searchFile(String fname, Folder F) {
		System.out.println("\nSearch "+fname+" in "+F.getName());
		for(File i : F.getFiles()) {
			if(i==null) continue;
			if(i.getName().equals(fname)) {
				System.out.println("found "+fname);
				break;
			}
		}
		for(Folder i : F.getFolds()) {
			if(i==null) continue;
			for(File j : i.getFiles()) {
				if(j==null) continue;
				if(j.getName().equals(fname)) {
					System.out.println("found "+fname+" in "+i.getName());
					break;
				}
			}
		}
		System.out.println("///////////////////////////////");
	}
	
	public static void main(String[] args) {
		File f1 = new File("File1.txt","10/07/2024",10,'w');
		File f2 = new File(10);
		File f3 = new File("File3.txt","1/10/2023",30,'r');
		File f4 = new File(5);
		
		
		Folder F1 = new Folder();
		Folder F2 = new Folder("Folder2");
		Folder F3 = new Folder("Folder3");
		
		F1.addFile(f1);
		F1.addFile(f2);
		F1.addFile(f3);
		F1.addFile(f4);
		F2.addFile(f1);
		F2.addFile(f4);
		
		F1.addFolder(F2);
		F1.addFolder(F3);
		F1.addFolder(F2);
		
		displayFold(F1);
		searchFile("Untitle.txt", F1);
		
//		for(File i : F1.getFiles()) {
//			if(i==null) continue;
//			System.out.println(i);
//		}
//		
//		for(Folder i: F1.getFolds()) {
//			if(i==null) continue;
//			System.out.println(i);
//		}
		
		System.out.println();
		F1.removeFile("File1.txt");
		F1.removeFile("File2.txt");
		
		displayFold(F1);
	}
}
