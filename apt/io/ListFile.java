import java.io.*;
class ListFile{
	void traverse(String path){
		File file1 = new File(path);
		String name[] = file1.list();
		if(name!=null){
			for(int i=0;i<name.length;i++){
				System.out.println(name[i]);
				File file2 = new File(path+"/"+name[i]);
				if(file2.isDirectory()){
					traverse(file2.getPath());
				}
			}		
		}
		System.out.println("Total "+name.length+" files-----===---===---===--=-");
	}
	public static void main(String[] args) {
		ListFile list = new ListFile();
		list.traverse("E:/");
	}
}