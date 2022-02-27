package 俊鑫大作业;
import java.util.*;
public class Relation {
	String x;					
	String[] y;					//存储关系分割的元素
	ArrayList<String> list;		//存储关系的元素
	Iterator<String> iter;		//关系链表对应的iter
	public Relation(String x){			//创建关系集
		list=new ArrayList<String>();
		this.x=x;
		y=x.split("[()]+");		//分割出  x,y 
		for(int i=0;i<y.length;i++){
			if(!y[i].equals("")&&!y[i].equals(",")){
				list.add(y[i]);
			}
		}
	}
	public boolean Zifan(){				//自反
		iter=list.iterator();
		String[] w;
		String[] w1=new String[list.size()];
		String[] w2=new String[list.size()];
		int i=0;
		int[] c=new int[list.size()];
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2){
				w1[i]=w[0];
				w2[i]=w[1];
				i++;
			}
		}
		for(int j=0;j<w1.length;j++){
			if(list.indexOf(w1[j]+","+w2[j])==-1){
				return false;
			}
		}
		return true;
	}
	public boolean Duichen(){			//对称
		iter=list.iterator();
		String[] w;
		int j=0;
		int n=0;
		int[] w1=new int[list.size()];
		int[] w2=new int[list.size()];
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2){
				w1[j]=Integer.parseInt(w[0]);			//w1 第一位数	
				w2[j]=Integer.parseInt(w[1]);			//w2 第2位数
				j++;
			}
		}
		for(int i=0;i<w1.length;i++){
			for(int k=0;k<w2.length;k++){
				if(w1[i]==w2[k]&&w1[k]==w2[i]){
					n++;
				}					
			}
		}
		if(n==list.size()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean Chuandi(){			//传递
		iter=list.iterator();
		String[] w;
		String[] w1=new String[list.size()];
		String[] w2=new String[list.size()];
		int i=0;
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2){
				w1[i]=w[0];
				w2[i]=w[1];
				i++;
			}
		}
		for(int j=0;j<list.size();j++){
			for(int k=0;k<list.size();k++){
				if(w2[j].equals(w1[k])){
					if(list.indexOf(w1[j]+","+w2[k])==-1){
						return false;
					}
				}
			}
		}
		return true;
	}
	public boolean FanZifan(){			//反自反
		iter=list.iterator();
		String[] w;
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2&&w[0].equals(w[1])){
				return false;
			}
		}
		return true;
	}
	public boolean FanDuichen(){		//反对称
		iter=list.iterator();
		String[] w;
		String[] w1=new String[list.size()];
		String[] w2=new String[list.size()];
		int j=0,i=0,k=0;
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2){
				w1[i]=w[0];
				w2[i]=w[1];
				i++;
			}
		}
		for(j=0;j<list.size();j++){
			for(k=0;k<list.size();k++){
				if(w1[j].equals(w2[k])&&w1[k].equals(w2[j])&&!w1[j].equals(w2[j])){
					return false;
				}
			}
		}
		return true;
	}
	public ArrayList ZifanBibao(){		//自反闭包
		ArrayList list1=list;
		if(Zifan()){
			return list1;
		}
		else{
			iter=list1.iterator();
			String[] w;
			String[] w1=new String[list1.size()];
			String[] w2=new String[list1.size()];
			int i=0;
			while(iter.hasNext()){
				w=iter.next().split(",");
				if(w.length==2){
					w1[i]=w[0];
					w2[i]=w[1];
					i++;
				}
			}
			for(int j=0;j<w1.length;j++){
				if(list1.indexOf(w1[j]+","+w1[j])==-1){
					list1.add(w1[j]+","+w1[j]);
				}
				else if(list1.indexOf(w2[j]+","+w2[j])==-1){
					list1.add(w2[j]+","+w2[j]);
				}
			}
			return list1;
		}
	}
	public ArrayList DuichenBibao(){		//对称闭包
		ArrayList list1=list;
		if(Duichen()){
			return list1;
		}
		else{
			iter=list1.iterator();
			String[] w;
			String[] w1=new String[list1.size()];
			String[] w2=new String[list1.size()];
			int i=0;
			while(iter.hasNext()){
				w=iter.next().split(",");
				if(w.length==2){
					w1[i]=w[0];
					w2[i]=w[1];
					i++;
				}
			}
			for(int j=0;j<w1.length;j++){
				if(list1.indexOf(w2[j]+","+w1[j])==-1){
					list1.add(w2[j]+","+w1[j]);
				}
			}
			return list1;
		}
	}
	public ArrayList ChuandiBibao(){		//传递闭包
		ArrayList<String> list1=list;
		if(Chuandi()){
			return list1;
		}
		iter=list1.iterator();
		String[] w;		
		ArrayList<String> list2=new ArrayList();
		ArrayList<String> list3=new ArrayList();
		for(int j=0;j<list1.size();j++){
			w=list1.get(j).split(",");
			if(w.length==2){
				list2.add(w[0]);
				list3.add(w[1]);
			}
			for(int k=0;k<list2.size();k++){
				for(int l=0;l<list3.size();l++){
					if(list2.get(k).equals(list3.get(l))){
						if(list1.indexOf(list2.get(l)+","+list3.get(k))==-1){
							list1.add(list2.get(l)+","+list3.get(k));
						}
					}
				}
			}
		}
		return list1;
	}
	public boolean DengjiaGuanxi(){			//等价关系
		if(Duichen()&&Zifan()&&Chuandi())
			return true;
		else
			return false;
	}
	public boolean Pianxu(){			//偏序关系
		if(FanDuichen()&&Zifan()&&Chuandi()){	
			return true;
		}
		return false;
	}
}
