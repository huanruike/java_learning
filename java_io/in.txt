import java.io.*;

public class test1{
	public static void main(String[] args){
		String path="in.txt";
		File filePath=new File(path);
		System.out.println("路径: "+filePath.getParent());
		System.out.println("文件: "+filePath.getName());
		System.out.println("绝对路径: "+filePath.getAbsolutePath());
		System.out.println("文件大小: "+filePath.length());
		System.out.println("是否为文件: "+(filePath.isFile()?"yes":"no"));
		System.out.println("是否为目录: "+(filePath.isDirectory()?"yes":"no"));
		System.out.println("是否为隐藏: "+(filePath.isHidden()?"yes":"no"));
		System.out.println("是否为可读: "+(filePath.canRead()?"yes":"no"));
		System.out.println("是否为写入: "+(filePath.canWrite()?"yes":"no"));
		//System.out.println("最后修改时间: "+ new Date(filePath.lastModified()));
	}
}
