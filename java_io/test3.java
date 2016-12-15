import java.io.*;

public class test3{
	public static void main(String[] args){
		byte[] b=new byte[200*1024];
		try{
			File inF=new File("Gin.txt");
			File outF=new File("Gout.txt");
			FileInputStream in=new FileInputStream(inF);
			FileOutputStream out=new FileOutputStream(outF);
			in.read(b);
			out.write(b);
			in.close();
			out.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("FileNotFound");
		}
		catch(IOException ie){
			System.out.println("IO");
		}
	}
}
