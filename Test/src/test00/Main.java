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
        	 System.out.println("����0������ͨ��Ա");
            //System.out.println("����1��ȡ�����Ʒ");
            //System.out.println("�����ζ(������,�嵭,������)�������Ʒ");
            System.out.println("����1���й���Ա��¼");

            String limit = input.nextLine();
            if (limit.equals("0")){
            	while(true){
            		System.out.println("����1����������");
            		System.out.println("����2��ȡ�����Ʒ");
            		System.out.println("�����ζ(������,�嵭,������)�������Ʒ");
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
                            System.out.println("û�иÿ�ζ�Ĳ�ƷŶ��");
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
                    System.out.println("�������û�����");
                    String enter_name = input.nextLine();
                    System.out.println("����������");
                    String enter_password = input.nextLine();
                    if (name.equals(enter_name)&&password.equals(enter_password)){
                        break;
                    }else{
                        System.out.println("�û�����������������,���������룡\n");
                    }
                }
                while(true){
                    System.out.println("�����������ʹ�ù��ܣ�");
                    System.out.println("1.���Ӳ�Ʒ");
                    System.out.println("2.ɾ����Ʒ");
                    System.out.println("3.�޸Ĳ�Ʒ");
                    System.out.println("4.չʾ��Ʒ");
                    limit = input.nextLine();
                    if(limit.equals("1")){
                        System.out.println("�밴˳�������Ʒ��Ϣ(����:ʳ��15,14,�@��,�嵭,9.5)");
                        Database db = new Database();
                        db.connect();
                        limit = input.nextLine();
                        db.insert(limit);
                        db.close_connect();
                        System.out.println("�����Ϣ�ɹ���");
                    }
                    else if (limit.equals("2")){
                        Database db = new Database();
                        db.connect();
                        db.show();
                        System.out.println("��������Ҫɾ���Ĳ�Ʒ���");
                        limit = input.nextLine();
                        db.remove(Integer.parseInt(limit));
                        db.close_connect();
                        System.out.println("ɾ����Ϣ�ɹ���");
                    }
                    else if (limit.equals("3")){
                        Database db = new Database();
                        db.connect();
                        db.show();
                        System.out.println("��������Ҫ�޸ĵĲ�Ʒ��ż���Ϣ(���磺3 ʳ��2,4,������,����,25.4)");
                        int num = input.nextInt();
                        limit = input.nextLine();
                        db.update(num,limit);
                        db.close_connect();
                        System.out.println("�޸���Ϣ�ɹ���");
                    }
                    else if (limit.equals("4")){
                        Database db = new Database();
                        db.connect();
                        db.asc_show();
                        db.close_connect();
                    }
                    else{
                        System.out.println("��������,���������룡");
                    }

                }
            }
           /* else {
                Database db = new Database();
                db.connect();
                int flag = db.random(limit);
                if (flag<=0){
                    System.out.println("û�иÿ�ζ�Ĳ�ƷŶ��");
                }
                db.close_connect();
            }*/
        }



//        Database db = new Database();
//        db.connect();
//        db.insert("ʳ��8,8,����ǽ,����,999");
//        db.update(3,"ʳ��22,111,��̢,�տ�,4.5");
//        db.remove(9);4,"ʳ��2,11,˱ָԭζ��,��ը,13.5"
//        db.show();
//        db.close_connect();

    }
}
