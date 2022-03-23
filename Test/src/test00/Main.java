package test00;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        final String name = "admin";
        final String password = "3366";
        while(true){
        	 System.out.println("输入0进入普通人员");
            //System.out.println("输入1获取随机菜品");
            //System.out.println("输入口味(如香辣,清淡,特辣等)以随机菜品");
            System.out.println("输入1进行管理员登录");

            String limit = input.nextLine();
            if (limit.equals("0")){
            	while(true){
            		System.out.println("输入1返回主界面");
            		System.out.println("输入2获取随机菜品");
            		System.out.println("输入口味(如香辣,清淡,特辣等)以随机菜品");
            		String limit1 = input.nextLine();
            		
            		if (limit1.equals("1")){
            			main(args);
                    }
            		if (limit1.equals("2")){
            			Database db = new Database();
                        db.connect();
                        db.random();
                        db.close_connect();
                    }
            		
            		else {
            			Database db = new Database();
                        db.connect();
                        int flag = db.random(limit1);
                        if (flag<=0){
                            System.out.println("没有该口味的菜品哦！");
                        }
                        db.close_connect();
                    
            		}
            }
            }
            
            
            /*if (limit.equals("1")){
                Database db = new Database();
                db.connect();
                db.random();
                db.close_connect();
            }*/
            else if (limit.equals("1")){
                while(true){
                    System.out.println("请输入用户名：");
                    String enter_name = input.nextLine();
                    System.out.println("请输入密码");
                    String enter_password = input.nextLine();
                    if (name.equals(enter_name)&&password.equals(enter_password)){
                        break;
                    }else{
                        System.out.println("用户名或密码输入有误,请重新输入！\n");
                    }
                }
                while(true){
                    System.out.println("请输入序号来使用功能：");
                    System.out.println("1.增加菜品");
                    System.out.println("2.删除菜品");
                    System.out.println("3.修改菜品");
                    System.out.println("4.展示菜品");
                    limit = input.nextLine();
                    if(limit.equals("1")){
                        System.out.println("请按顺序输入菜品信息(例如:食堂15,14,粿条,清淡,9.5)");
                        Database db = new Database();
                        db.connect();
                        limit = input.nextLine();
                        db.insert(limit);
                        db.close_connect();
                        System.out.println("添加信息成功！");
                    }
                    else if (limit.equals("2")){
                        Database db = new Database();
                        db.connect();
                        db.show();
                        System.out.println("请输入需要删除的菜品序号");
                        limit = input.nextLine();
                        db.remove(Integer.parseInt(limit));
                        db.close_connect();
                        System.out.println("删除信息成功！");
                    }
                    else if (limit.equals("3")){
                        Database db = new Database();
                        db.connect();
                        db.show();
                        System.out.println("请输入需要修改的菜品序号及信息(例如：3 食堂2,4,麻辣烫,香辣,25.4)");
                        int num = input.nextInt();
                        limit = input.nextLine();
                        db.update(num,limit);
                        db.close_connect();
                        System.out.println("修改信息成功！");
                    }
                    else if (limit.equals("4")){
                        Database db = new Database();
                        db.connect();
                        db.asc_show();
                        db.close_connect();
                    }
                    else{
                        System.out.println("输入有误,请重新输入！");
                    }

                }
            }
           /* else {
                Database db = new Database();
                db.connect();
                int flag = db.random(limit);
                if (flag<=0){
                    System.out.println("没有该口味的菜品哦！");
                }
                db.close_connect();
            }*/
        }



//        Database db = new Database();
//        db.connect();
//        db.insert("食堂8,8,佛跳墙,蒸煮,999");
//        db.update(3,"食堂22,111,蛋挞,烧烤,4.5");
//        db.remove(9);4,"食堂2,11,吮指原味鸡,油炸,13.5"
//        db.show();
//        db.close_connect();

    }
}
