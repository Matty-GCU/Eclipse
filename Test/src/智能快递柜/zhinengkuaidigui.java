package 智能快递柜;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
public class zhinengkuaidigui {
    static Scanner scan = new Scanner(System.in);
    boolean judge;
    SqList sq = new SqList(36);
    public zhinengkuaidigui(boolean judge) {
        this.judge=judge;
        for(int i=0;i<=35;i++){
            sq.insert("0",i);
        }
        }

    Rootuser r1 = new Rootuser("13322777846", 123);
    Rootuser r2 = new Rootuser("17825836780", 456);



    /*
    定义一个画格子的方法
   */
    public void drawlocation() {
        System.out.println("大格子：");
        for (int i = 0; i < 12; i++) {// 遍历第一行的12个格子
            if (sq.get(i).equals("0")) {// 判断格子中是否有东西
                System.out.print(" □ ");// 打印空格子
            } else {// 格子中有东西
                System.out.print(" ■ ");// 打印实心格子
            }
        }
        System.out.println();
        for (int j = 1; j <= 12; j++) {
            System.out.printf(" %2d ", j);// 给前12个格子编号
        }
        System.out.println();

        System.out.println("中格子：");
        for (int x = 12; x < 24; x++) {// 打印中间12个格子
            if (sq.get(x).equals("0")) {// 判断格子中是否有东西
                System.out.print(" □ ");
            } else {// 格子中有东西
                System.out.print(" ■ ");
            }
        }
        System.out.println();
        for (int y = 13; y <= 24; y++) {
            System.out.printf(" %2d ", y);// 给中间12个格子编号
        }
        System.out.println();

        System.out.println("小格子：");
        for (int x = 24; x < 36; x++) {// 打印后12个格子
            if (sq.get(x).equals("0")) {// 判断格子中是否有东西
                System.out.print(" □ ");
            } else {// 格子中有东西
                System.out.print(" ■ ");
            }
        }
        System.out.println();
        for (int y = 25; y <= 36; y++) {
            System.out.printf(" %2d ", y);// 给后12个格子编号
        }
        System.out.println();
    }

    public void login() {
        System.out.println("请你先登录账号再进行存包操作，输入进行登录操作");
        System.out.println("输入账号:");
        String accountant = scan.next();
        System.out.println("输入密码:");
        int passWord = scan.nextInt();
        if (passWord == r1.password && accountant.equals(r1.phoneNumber)) {
            System.out.println("登录成功");
            this.judge=true;
            write("用户" + r1.phoneNumber + "登录成功\r\n");
            deposit();

        } else {
            System.out.println("密码或者账号错误，请重新输入");
        }
    }


    public void deposit() {
        Random rd = new Random();
        System.out.println("请输入格子大小（1、大格子，2、中格子，3、小格子）：");
        write("您正在存快递，请选择格子大小！（1、大格子，2、中格子，3、小格子）\r\n");
        int size = scan.nextInt();
        switch (size) {
            case 1:
                System.out.println("您选择了大格子：");
                write("您选择了大格子\r\n");
                System.out.println("输入用户手机号码:");
                String phNumber =scan.next();
                for (int i = 0; i <= 11; i++) {
                    if (sq.get(i).equals("0")) {// 格子是空的
                        int h = rd.nextInt(999) + 100;// 生成密码
                        String password=phNumber+h;
                        sq.set(password,i);
                        System.out.println((i + 1) + "号格子可以使用");
                        System.out.println("这是您的取件码：" + sq.get(i) + ",切勿告诉他人");
                        write((i + 1) + "号格子可以使用，这是您的密码：" + sq.get(i) + ",切勿告诉他人\r\n");
                        break;
                    }
                    if (i == 11) {
                        System.out.println("格子已经满了，请稍后！");
                        write("格子已经满了，请稍后！\r\n");
                    }
                }
                break;
            case 2:
                System.out.println("您选择了中格子：");
                write("您选择了中格子\r\n");
                System.out.println("输入用户手机号码:");
                String phNumber2 =scan.next();
                for (int i = 12; i <= 23; i++) {
                    if (sq.get(i).equals("0")) {// 格子是空的
                        int h = rd.nextInt(999) + 100;// 生成密码
                        String passwor1=phNumber2+h;
                        sq.set(passwor1,i);
                        System.out.println((i + 1) + "号格子可以使用");
                        System.out.println("这是您的取件码：" + sq.get(i) + ",切勿告诉他人");
                        write((i + 1) + "号格子可以使用，这是您的取件码：" + sq.get(i) + ",切勿告诉他人\r\n");
                        break;
                    }
                    if (i == 23) {
                        System.out.println("格子已经满了，请稍后！");
                        write("格子已经满了，请稍后！\r\n");
                    }
                }
                break;
            case 3:
                System.out.println("您选择了小格子：");
                write("您选择了小格子\r\n");
                System.out.println("输入用户手机号码:");
                String phNumber3 =scan.next();
                for (int i = 24; i <= 35; i++) {
                    if (sq.get(i).equals("0")) {// 格子是空的
                        int h = rd.nextInt(999) + 100;// 生成密码
                        String password2=phNumber3+h;
                        sq.set(password2,i);
                        System.out.println((i + 1) + "号格子可以使用");
                        System.out.println("这是您的取件码：" + sq.get(i) + ",切勿告诉他人");
                        write((i + 1) + "号格子可以使用，这是您的取件码：" + sq.get(i) + ",切勿告诉他人\r\n");
                        break;
                    }
                    if (i == 35) {
                        System.out.println("格子已经满了，请稍后！");
                        write("格子已经满了，请稍后！\r\n");
                    }
                }
                break;
        }
    }

    public void pickUp() {
        int count = 0;// 计数器，记录密码输错次数
        System.out.println("请输入箱号：");
        write("您正在取快递，请输入箱号！\r\n");
        int i = scan.nextInt() - 1;
        if (i > 35) {
            System.out.println("不存在该储物格子");
            write("不存在该储物格子\r\n");
        } else {
            if (sq.get(i).equals("0")) {
                System.out.println("该格子中并没有东西！");
                write("该格子中并没有东西！\r\n");
            } else {
                while (true) {
                    System.out.println("请输入格子密码：");
                    write("请输入格子密码：\r\n");
                    String  pwd = scan.next();
                    if (sq.get(i).equals(pwd)) {
                        System.out.println((i + 1) + "号格子打开,请取走您的贵重物品！");
                        write((i + 1) + "号格子打开,请取走您的贵重物品！\r\n");
                        sq.set("0",i);
                        break;
                    } else {
                        count++;
                        System.out.println("密码错误，请重新输入！");
                        write("密码错误，请重新输入！\r\n");
                        if (count >= 3) {
                            System.out.println("密码输错3次，储物箱被锁定，请联系前台服务人员解决。");
                            write("密码输错3次，储物箱被锁定，请联系前台服务人员解决。\r\n");
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void exit() {
        System.out.println("欢迎下次再来，Bye Bye!!!");
        write("欢迎下次再来，Bye Bye!!!\r\n");
        System.exit(0);

    }
    public static void write(String text) {
        try {
            File file = new File("C:/Users/Matty's PC/Desktop/CabinetOpeWrite.txt");
            Writer fw = new FileWriter(file, true);
            // 创建一个字符输出流对象
            BufferedWriter pw = new BufferedWriter(fw);
            // 输出文字到文件中
            pw.write(text);
            // 刷新流
            pw.flush();
            // 关闭流
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void operate() {
        while (true) {
            System.out.println("\t--------------------------------------\n");
            System.out.println("\t     1、存包     2、取包   3、退出登录  4、查询使用状态  0、退出  ");
            System.out.println("请选择操作：");
            int select = scan.nextInt();
            write("1、存包     2、取包     0、退出,您选择了" + select + "。\r\n");
            switch (select) {
                case 1:
                    if(this.judge){
                        deposit();
                    }else {
                        login();
                    }
                    break;
                case 2:
                    pickUp();
                    break;
                case 0:
                    exit();
                    break;
                case 3:
                    this.judge=false;
                    break;
                case 4:
                    if(this.judge){
                        drawlocation();
                    }else{
                        System.out.println("暂时没有完全开放");
                    }
                    break;
                default:
                    System.out.println("输入错误");
                    write("输入错误\r\n");
                    break;
            }
        }

    }
    public  void welcome() {
        System.out.println("\t------------快递柜管理系统------------\n\n");
        write("欢迎光临快递柜管理系统！\r\n");
        operate();
    }
    public static void main(String[] args) {
       zhinengkuaidigui z1=new zhinengkuaidigui(false);
       z1.welcome();

    }
}

