import java.io.*;

public class test2{
	public static void main(String[] args){
		byte[] b=new byte[17*1024];
		File inF=new File("Gin.txt");
		File outF=new File("Gout.txt");
		try{
			FileInputStream fis=new FileInputStream(inF);
			FileOutputStream fops=new FileOutputStream(outF);
			fis.read(b);
			fops.write(b);
			fis.close();
			fops.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("FileNotFoundException fnfe");
			//fnfe.printStackTrace();
		}
		catch(IOException ie){
			System.out.println("IOException ie");
			//ie.printStackTrace();
		}
	}
}

