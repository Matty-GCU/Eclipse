package junxindazuoye;
import java.util.*;
public class Set {					//集合类
	String x;						
	String [] y;					//存储集合的元素
	ArrayList<String> list;			//存储集合的元素
	Iterator<String> iter;			//集合链表对应的iter
	Relation r;						//关系
	public Set(String x){				//存储数据
		this.x=x;
		list=new ArrayList();
		y=x.split("[{,}]+");		//分割出 元素
		for(int i=1;i<y.length;i++){
			list.add(y[i]);
		}
	}
	public int[][] Juzhen (Relation r){					//输出矩阵,返回矩阵
		int[][] juzhen=new int[list.size()][list.size()];
		iter=r.list.iterator();
		ArrayList<String> list1=new ArrayList();
		ArrayList<String> list2=new ArrayList();
		String[] w;
		int w1,w2;
		while(iter.hasNext()){
			w=iter.next().split(",");
			if(w.length==2){
				w1=list.indexOf(w[0]);
				w2=list.indexOf(w[1]);
				juzhen[w1][w2]=1;
			}
		}
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++){
				System.out.print(juzhen[i][j]+"   ");
			}
			System.out.println();
		}
		return juzhen;
	}
	public ArrayList Dengjialei(Relation r,String z){	//获取等价类，返回等价类对应的关系集
		this.r=r;
		if(r.DengjiaGuanxi()){
			ArrayList<String> list1=new ArrayList();
			iter=r.list.iterator();
			String[] w;
			String[] w1=new String[r.list.size()];
			String[] w2=new String[r.list.size()];
			int i=0;
			while(iter.hasNext()){
				w=iter.next().split(",");
				if(w.length==2){
					w1[i]=w[0];
					w2[i]=w[1];
					i++;
				}
			}
			for(int j=0;j<r.list.size();j++){
				if(r.list.indexOf(z+","+w2[j])!=-1&&list1.indexOf(w2[j])==-1){
					list1.add(w2[j]);
				}
				if(r.list.indexOf(w1[j]+","+z)!=-1&&list1.indexOf(w1[j])==-1){
					list1.add(w1[j]);
				}
			}
			return list1;
		}
		return null;
	}
	public ArrayList Jizhi(Relation r){			//返回极值对应的链表
		this.r=r;
		ArrayList<String> list1=new ArrayList();
		if(r.Pianxu()){
			int[][] juzhen=Juzhen(r);
			int k=0,l=0;
			for(int i=0;i<list.size();i++){
				for(int j=0;j<list.size();j++){
					if(juzhen[i][j]==0){
						k++;
					}
					if(juzhen[j][i]==0){
						l++;
					}
				}
				if(k==list.size()-1){
					list1.add(list.get(i)+"极大值");
				}
				if(l==list.size()-1){
					list1.add(list.get(i)+"极小值");
				}
				k=0;
				l=0;
			}
			return list1;
		}
		return null;
	}
	public ArrayList Zuizhi(Relation r){		//最值,返回最值对应的链表
		this.r=r;
		ArrayList<String> list1=new ArrayList();
		if(r.Pianxu()){
			int[][] juzhen=Juzhen(r);
			int k=0,l=0;
			for(int i=0;i<list.size();i++){
				for(int j=0;j<list.size();j++){
					if(juzhen[i][j]==1){
						k++;
					}
					if(juzhen[j][i]==1){
						l++;
					}
				}
				if(k==list.size()){
					list1.add(list.get(i)+"最小值");
				}
				if(l==list.size()){
					list1.add(list.get(i)+"最大值");
				}
				k=0;
				l=0;
			}
			return list1;
		}
		return null;
	}
}