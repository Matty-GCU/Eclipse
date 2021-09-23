package weacsoft001;

import static myUtil.Printer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��Java������ҵ֮һ����ArrayListʵ��ѧ���������ϵͳ
public class ManagementSystem {
	List<Student> studentList;
	//��ʼ��ѧ����Ϣ
	public void init() {
		studentList = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String idInput = scanner.next();
			if(idInput.equals("-1")) {
				return;
			}
			String nameInput = scanner.next();
			studentList.add(new Student(idInput, nameInput));
		}
	}
	//�������ѧ����Ϣ
	public void printOne(Student stu) {
		if(stu == null) {
			p("null");
			return;
		}
		stu.showMessage();
	}
	//�������ѧ����Ϣ
	public void printAll() {
		p("-----------------");
		for(Student student: studentList) {
			student.showMessage();
		}
		p("-----------------");
	}
	//��ѧ�Ų�ѯѧ��
	public Student searchById(String id) {
		for(Student student: studentList) {
			if(student.id.equals(id)) {
				return student;
			}
		}
		return null;
	}
	//��������ѯѧ��
	public Student searchByName(String name) {
		for(Student student: studentList) {
			if(student.name.equals(name)) {
				return student;
			}
		}
		return null;
	}
	//��ѧ��ɾ��ѧ��
	public void deleteStudentById(String id) {
		studentList.remove(searchById(id));		//����
	}
	//�޸�ѧ��ѧ��
	public void modifyIdByName(String name, String newId) {
		searchByName(name).id = newId;
		
	}
	//�޸�ѧ������
	public void modifyNameById(String id, String newName) {
		searchById(id).name = newName;
		
	}
	//���ѧ����Ϣ
	public void addOtherInfo(String id, String newOtherInfo) {
		searchById(id).otherInfo = newOtherInfo;
	}
}
