package test;

import java.util.*;

class Person {
	protected String name;
	protected int age;
	protected String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class Student extends Person {
	private String ID;
	private int[] Marks;
	
	public Student(String name, int age, String address, String ID) {
		super(name, age, address);
		this.ID = ID;
		randomMarks();
	}
	private void randomMarks() {
		Random random = new Random();
			Marks[5] = random.nextInt(101);
	}
	public double Average() {
		int n = 0;
		for (int mark : Marks) {
			n += mark;
		}
		return (double) (n / Marks.length);
	}
	public String Details() {
        StringBuilder details = new StringBuilder();
        details.append("Name: ").append(name)
               .append("\nAge: ").append(age)
               .append("\nAddress: ").append(address)
               .append("\nStudent ID: ").append(ID)
               .append("\nMarks: ");
        for (int mark : Marks) {
            details.append(mark).append(" ");
        }
        details.append("\nAverage: ").append(Average());
        return details.toString();
    }
public class SMS {
	    private ArrayList<Student> students;
	    private Scanner sc;

	    public SMS() {
	        students = new ArrayList<>();
	        sc = new Scanner(System.in);
	    }

	    public void addStudent() {
	        System.out.println("Enter student name: ");
	        String name = sc.nextLine();
	        System.out.println("Enter student age: ");
	        int age = Integer.parseInt(sc.nextLine());
	        System.out.println("Enter student address: ");
	        String address = sc.nextLine();
	        System.out.println("Enter student ID: ");
	        String ID = sc.nextLine();
	        Student student = new Student(name, age, address, ID);
	        students.add(student);
	        System.out.println("Student " + name + " added successfully!");
	    }

	    public void displaystudent() {
	        if (students.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
	            for (Student student : students) {
	                System.out.println(student.Details());
	                System.out.println("--------------------");
	            }
	        }
	    }
	public static void main(String[] args) {
		SMS sms = new SMS();
		Scanner sc = new Scanner(System.in);
		int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(sms.sc.nextLine());

            switch (choice) {
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.displaystudent();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
}