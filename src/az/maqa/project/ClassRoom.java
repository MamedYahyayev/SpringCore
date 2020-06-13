package az.maqa.project;

import java.util.List;

public class ClassRoom {

	private List<String> students;

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public List<String> getStudents() {
		return students;
	}

	public void StudentsList() {
		System.out.println(students);
	}

	@Override
	public String toString() {
		return "" + students;
	}

}
