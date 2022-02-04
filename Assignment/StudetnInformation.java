

import java.util.Scanner;

class Student {
	int id;
	String Name;
	int hindi;
	int english;
	int maths;
	int science;
	int social;
	int total;
	double percentage;

	public int getTotal() {
		return hindi + english + science + maths + social;
	}

	int to = hindi + english + science + maths + social;
	int per = to / 500;
	int fin = per * 100;

	public double getPercentage() {
		return fin;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public void display() {
		System.out.println("Student Result {id=" + id + ", Name= " + Name + ",marks=Subject Marks" + "{ hindi=" + hindi
				+ ", english=" + english + ", maths=" + maths + ", science=" + science + ", social=" + social
				+ "},result='pass' total=" + getTotal() + ", percentage=" + getPercentage() + "}");
	}

}

public class StudetnInformation{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Student std = new Student();
			System.out.println("Welcome to College Management");
			System.out.println("A: Add Student Result");
			System.out.println("X: Exit");
			String inp = sc.next();
			char ch1 = 0;
			char ch2 = 0;
			char ch3 = 0;

			if (inp.equals("A") || inp.equals("a")) {
				System.out.println("Enter student id");
				int id = sc.nextInt();
				std.setId(id);

				System.out.println("Enter student Name");
				String stdname = sc.next();
				std.setName(stdname);
				System.out.println("Enter marks in Hindi");
				int hindi = sc.nextInt();
				std.setHindi(hindi);
				System.out.println("Marks in english");
				int english = sc.nextInt();
				std.setEnglish(english);
				System.out.println("Marks in maths");
				int maths = sc.nextInt();
				std.setMaths(maths);
				System.out.println("Marks in Science");
				int science = sc.nextInt();
				std.setScience(science);
				System.out.println("Marks in Social");
				int social = sc.nextInt();
				std.setSocial(social);

				System.out.println("Student added successfully..");
				System.out.println("Do you want to continue(Y/N):");
				do {
					System.out.println("c: Chehk student Result");
					System.out.println("A: Add student Result");
					System.out.println("X: Exit");
					ch1 = sc.next().charAt(0);

					if (ch1 == 'c' || ch1 == 'C') {
						System.out.println("Enter student id to check");
						{
							int id1 = sc.nextInt();
							if (id1 == std.getId()) {
								std.display();
								System.out.println("Do you want to continue(Y/N):");
								ch3 = sc.next().charAt(0);
								if (ch3 == 'n' || ch3 == 'N') {
									System.out.println("Bye");
									return;
								}
								if (ch3 == 'y' || ch3 == 'Y')
									;
								{
									while (ch3 == 'Y' || ch3 == 'y')
										;
								}

							} else {
								System.out.println("student id not found");
								System.out.println("Do you want to continue(Y/N):");
								ch2 = sc.next().charAt(0);

								if (ch2 == 'x' || ch2 == 'X') {
									System.out.println("Bye");
									break;
								}
							}

						}
					}
				} while (ch2 == 'Y' || ch2 == 'y');

			}

			if (ch1 == 'x' || ch1 == 'X' || inp.endsWith("x") || inp.equals("X")) {
				System.out.println("Bye");
			}

		}

	}
}
