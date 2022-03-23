package test00;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Wenjian {
    public void write(String s) throws IOException {
        File file = new File("data.txt");
        String message;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true));
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            message = dateFormat.format(date)+"\n";
            bw.write(message+s+"\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void read() throws FileNotFoundException {
        File file = new File("data.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
