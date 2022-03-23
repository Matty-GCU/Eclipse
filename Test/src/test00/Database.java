package test00;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Database {
    Wenjian wenjian = new Wenjian();
    public static Shunxubiao list = null;
    private String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "051510";
    private PreparedStatement preparedStatement = null;
    private String sql;
    private Connection conn;
    private Statement smt;
    private ResultSet rs;
    private static Shunxubiao convertList(ResultSet rs) throws SQLException{
    	Shunxubiao list = new Shunxubiao(30);
        ResultSetMetaData md = rs.getMetaData();//获取键名
        int columnCount = md.getColumnCount();//获取行的数量
        while (rs.next()) {
            Map rowData = new HashMap();//声明Map
            for (int i = 1; i <= columnCount; i++) {
                rowData.put(md.getColumnName(i), rs.getObject(i));//获取键名及值
            }
            list.insert(rowData);
        }
        return list;
    }
    public void connect()throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
        smt = conn.createStatement();
        sql = "select * from tb1";
        rs = smt.executeQuery(sql);
        list = convertList(rs);
//        for (int i =1;i<ls.length()+1;i++){
//            System.out.println(ls.get(i)+""+i);
//        }
//        rs.close();
//        smt.close();
//        conn.close();
    }
    public void close_connect()throws SQLException {
        rs.close();
        smt.close();
        conn.close();
    }
    public void insert(String t) throws SQLException {
        list.insert(t);
        String[] x = t.split(",");
        sql = "insert into tb1 values(null,?,?,?,?,?)";
//        System.out.println(Integer.parseInt(x[2]));
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,x[0]);
        preparedStatement.setInt(2,Integer.parseInt(x[1]));
        preparedStatement.setString(3,x[2]);
        preparedStatement.setString(4,x[3]);
        preparedStatement.setDouble(5,Double.parseDouble(x[4]));
        preparedStatement.executeUpdate();
    }
    public void remove(int i) throws SQLException {
        String str = list.get(i).toString();
        String[] x =str.split(",");
        x = x[2].split("=");
        sql = "delete from tb1 where id = ?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(x[1]));
        preparedStatement.executeUpdate();
        list.remove(i);
    }
    public void update(int i,String t) throws SQLException {
//      i是数据在链表中的位置,t是需要插入的字符串

        String str = list.get(i).toString();
        String[] x =t.split(",");
        String[] y =str.split(",");
        y = y[2].split("=");

        sql = "update tb1 set mess= ?,`window`= ?,name= ?,message= ?,price = ? where id = ?";
//      window是sql里的保留字,使用时需要用反引号``来包围
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,x[0]);
        preparedStatement.setInt(2,Integer.parseInt(x[1]));
        preparedStatement.setString(3,x[2]);
        preparedStatement.setString(4,x[3]);
        preparedStatement.setDouble(5,Double.parseDouble(x[4]));
        preparedStatement.setInt(6, Integer.parseInt(y[1]));
        preparedStatement.executeUpdate();
        list.remove(i);
        list.insert(t);
    }
    public void show() throws SQLException {
        sql = "select * from tb1";
        rs = smt.executeQuery(sql);
        list = convertList(rs);
        for (int i=1;i<list.length()+1;i++){
            System.out.print(i);//序号
            System.out.println(list.get(i));
        }
    }

    public void asc_show() throws SQLException {
        sql = "select * from tb1 order by price";
        rs = smt.executeQuery(sql);
        list = convertList(rs);
        for (int i=1;i<list.length()+1;i++){
            System.out.print(i);//序号
            System.out.println(list.get(i));
        }
    }
    public void random() throws SQLException, IOException {
        sql = "select * from tb1";
        rs = smt.executeQuery(sql);
        list = convertList(rs);
        int random = 1+(int)(Math.random()*list.length());
        System.out.println(list.get(random));
        wenjian.write(list.get(random).toString());
        rs.close();
    }
    public int random(String s) throws SQLException, IOException {
        sql = "select * from tb1 where find_in_set('"+s+"',message)";
        rs = smt.executeQuery(sql);
        list = convertList(rs);
        int random = 1+(int)(Math.random()*list.length());
        System.out.println(list.get(random));
        wenjian.write("随机限定词:"+s+list.get(random).toString());
        rs.close();
        return list.length();
    }
}
