package test;
import java.io.*;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.PrintStream;
 

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("你好 世界！我要去文件里打印了。");
		PrintStream out=System.out;
		try {
			PrintStream ps=new PrintStream("./log.txt");
			System.setOut(ps);
			
			String s="GoDie";
			for (int i = 0; i < 10; i++) {
				System.out.println(" i=" + i);
			}
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	// 哈哈我又回來了，System.out.println("kkk");
		System.setOut(out);		
		System.out.println(" 哈哈我又回來了，System.out.println(\"kkk\")");
	*/
		try {
			FileReader fr=new FileReader("./log.txt");
			BufferedReader br=new BufferedReader(fr);
			try {
				String s=br.readLine();
				
				while (s!=null) {
					
					System.out.println(s);
					s=br.readLine();					
					
				}
				br.close();
				fr.close();
				
				String c="";
				switch (c) {
				case "23":
					
					break;

				default:
					break;
				}
				Color color=Color.BLANK;
				switch (color) {
				case BLANK:
					
					break;

				default:
					break;
				}
			} catch (IOException e) {
				// TODO: handle exception		
				
				e.printStackTrace();
			} 
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		
//		123456
//		bilunu1
//		123456
		
		
	}

}


  enum Color {  
	  RED, GREEN, BLANK, YELLOW  
	} 
