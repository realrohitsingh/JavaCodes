package hasarelationship;

class Department {
	void teach() {
		System.out.println("Studying");
	}
}

class Student {
	void learn() {
		System.out.println("Learning");
	}
}

class College {
	Department dept = new Department();
	Student st;

	College(Student st) {
		this.st = st;
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Student st = new Student();
		College col = new College(st);
		col.dept.teach();
		col.st.learn();
	}
}
