package homework;

import java.io.*;

public class MightBeRight {
	class CopyPi {
		String srcPath,dstPath;
		File src,dst;
		CopyPi(String srcPath,String dstPath){
			this.srcPath=srcPath;
			this.dstPath=dstPath;
			src=new File(srcPath);
			dst=new File(dstPath);
		}
		public int detect(){
			try{
				src.createNewFile();
				dst.createNewFile();
			}
			catch(Exception e){
				System.out.println("创建失败");
				return 3;
			}
			if(src.exists()||src.isFile()&&dst.isDirectory()){
				return 1;
			}
			else{
				return 0;
			}
		}
		public int copy(){
			if(this.detect()==1){
				File file=new File(dst,src.getName());
				try{
					file.createNewFile();
				}
				catch(Exception e){
					System.out.println("创建新文件失败");
				}
				try {
					FileInputStream fi=new FileInputStream(src);
					FileOutputStream fo=new FileOutputStream(file);
					byte[] b=new byte[8];
					try {
						int i=0;
						while(i!=-1){
							i=fi.read(b);
							fo.write(b);
						}
						fo.close();
					} 
					catch (IOException e) {
						System.out.println("读取失败");
					}  
				} 
				catch (FileNotFoundException e) {
					System.out.println("输入输出流创建失败");
				}
				return 1;
			}
			else{
				return 0;
			}
	 	}
	}
}
