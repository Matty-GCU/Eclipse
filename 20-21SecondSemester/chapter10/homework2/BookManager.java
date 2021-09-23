package homework2;

import java.io.*;

public class BookManager implements IBookManager {
	File storageFile;
	Reader in;
	Writer out;
	BufferedReader reader;
	BufferedWriter writer;
	public BookManager() {
		storageFile = new File("C:\\Users\\Matty's PC\\Desktop\\storage.txt");
		try {
			in = new FileReader(storageFile);
			out = new FileWriter(storageFile);
			reader = new BufferedReader(in);
			writer = new BufferedWriter(out);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Book search(String title) {
		String s;
		try {
			while((s=reader.readLine())!= null) {
				if(s.contains(title)) {
					String[] str = s.split(",");
					return new Book(str[0], str[1], str[2], str[3]);
				}
			}		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void add(Book book) {
		try {
			String str = book.getTitle()+","+book.getWriter()+","+book.getPrice()+","+book.getPublisher();
			writer.write(str);
			writer.newLine();
			writer.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

