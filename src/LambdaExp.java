import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileFilter ff=new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".zip");
			}
		};*/
		FileFilter ff=(pathname)->pathname.getName().endsWith(".zip");
		File f=new File("E:\\Eworkspace");
		File [] files=f.listFiles(ff);
//		for(File i:files)
//		 System.out.println(i.getName());
//		File []fileArray
	Comparator<String> cmp=(x,y) -> Integer.compare(x.length(), y.length());
		
	List<String> strArr= Arrays.asList("****","***","**");
	Collections.sort(strArr,cmp);
	strArr.forEach(System.out::println);
     /*for(String s:strArr)
     {
    	 System.out.println();
     }*/
	}
	

}
