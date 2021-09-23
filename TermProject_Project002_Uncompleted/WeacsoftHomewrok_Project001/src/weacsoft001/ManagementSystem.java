package weacsoft001;

import static myUtil.Printer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//软创Java寒假作业之一：用ArrayList实现学生宿舍管理系统
public class ManagementSystem {
	List<Student> studentList;
	//初始化学生信息
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
	//输出单个学生信息
	public void printOne(Student stu) {
		if(stu == null) {
			p("null");
			return;
		}
		stu.showMessage();
	}
	//输出所有学生信息
	public void printAll() {
		p("-----------------");
		for(Student student: studentList) {
			student.showMessage();
		}
		p("-----------------");
	}
	//按学号查询学生
	public Student searchById(String id) {
		for(Student student: studentList) {
			if(student.id.equals(id)) {
				return student;
			}
		}
		return null;
	}
	//按姓名查询学生
	public Student searchByName(String name) {
		for(Student student: studentList) {
			if(student.name.equals(name)) {
				return student;
			}
		}
		return null;
	}
	//按学号删除学生
	public void deleteStudentById(String id) {
		studentList.remove(searchById(id));		//测试
	}
	//修改学生学号
	public void modifyIdByName(String name, String newId) {
		searchByName(name).id = newId;
		
	}
	//修改学生姓名
	public void modifyNameById(String id, String newName) {
		searchById(id).name = newName;
		
	}
	//添加学生信息
	public void addOtherInfo(String id, String newOtherInfo) {
		searchById(id).otherInfo = newOtherInfo;
	}
}
