package corejava.rating;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {
	static LinkedHashMap<Parta, Integer> test = new LinkedHashMap<>();
	static LinkedHashMap<Parta, Integer> quiz = new LinkedHashMap<>();
	static LinkedHashMap<Parta, Integer> lab = new LinkedHashMap<>();
	static LinkedHashMap<Parta, Integer> project = new LinkedHashMap<>();
	static LinkedHashMap<Partb, Valuea> testScore = new LinkedHashMap<>();
	static LinkedHashMap<Partb, Valuea> quizScore = new LinkedHashMap<>();
	static LinkedHashMap<Partb, Valuea> labScore = new LinkedHashMap<>();
	static LinkedHashMap<Partb, Valuea> projectScore = new LinkedHashMap<>();
	static LinkedHashMap<Partb, Valueb> overallRating = new LinkedHashMap<>();
	static LinkedHashSet<Data> set = new LinkedHashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Data data1 = new Data("Ananth", "Electro Fields", "test", 100, "21-Jul-16");
		validateAssignmentCategory(data1);
		Data data2 = new Data("Bhagath", "Electro Fields", "test", 78, "21-Jul-16");
		validateAssignmentCategory(data2);
		Data data3 = new Data("Chaya", "Electro Fields", "test", 68, "21-Jul-16");
		validateAssignmentCategory(data3);
		Data data4 = new Data("Esharath", "Electro Fields", "test", 87, "21-Jul-16");
		validateAssignmentCategory(data4);
		Data data5 = new Data("Bhagath", "Electro Fields", "quiz", 20, "22-Jul-16");
		validateAssignmentCategory(data5);
		Data data6 = new Data("Chaya", "Electro Fields", "lab", 10, "23-Jul-16");
		validateAssignmentCategory(data6);
		Data data7 = new Data("Ananth", "Electro Fields", "project", 100, "24-Jul-16");
		validateAssignmentCategory(data7);
		Data data8 = new Data("Esharath", "Electro Fields", "project", 100, "24-Jul-16");
		validateAssignmentCategory(data8);
		Data data9 = new Data("Bhagath", "Electro Fields", "quiz", 50, "25-Jul-16");
		validateAssignmentCategory(data9);
		Data data10 = new Data("Ananth", "Electro Fields", "quiz", 100, "26-Jul-16");
		validateAssignmentCategory(data10);
		Data data11 = new Data("Bhagath", "Electro Fields", "lab", 10, "27-Jul-16");
		validateAssignmentCategory(data11);
		Data data12 = new Data("Chaya", "Electro Fields", "project", 100, "28-Jul-16");
		validateAssignmentCategory(data12);
		Data data13 = new Data("Bhagath", "Electro Fields", "project", 100, "28-Jul-16");
		validateAssignmentCategory(data13);
		Data data14 = new Data("Ananth", "Computing Techniques", "test", 86, "29-Jul-16");
		validateAssignmentCategory(data14);
		Data data15 = new Data("Ananth", "Electro Fields", "quiz", 100, "29-Jul-16");
		validateAssignmentCategory(data15);
		Data data16 = new Data("Bhagath", "Computing Techniques", "project", 100, "30-Jul-16");
		validateAssignmentCategory(data16);
		Data data17 = new Data("Ananth", "Electro Fields", "lab", 100, "30-Jul-16");
		validateAssignmentCategory(data17);
		Data data18 = new Data("Chaya", "Computing Techniques", "quiz", 20, "31-Jul-16");
		validateAssignmentCategory(data18);
		Data data19 = new Data("Ananth", "Electro Fields", "test", 100, "1-Aug-16");
		validateAssignmentCategory(data19);
		Data data20 = new Data("Chaya", "Electro Fields", "test", 92, "1-Aug-16");
		validateAssignmentCategory(data20);
		calculateScore(set);

		int choice = 0;
		while (choice != 6) {

			System.out.println("====MENU====");
			System.out.println("1. Student Information");
			System.out.println("2. Student Wise Data");
			System.out.println("3. Subject Wise Data");
			System.out.println("4. Update assignments category");
			System.out.println("5. Display assignment categories");
			System.out.println("6. Exit");
			System.out.println();
			System.out.println("Enter a choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int choice2 = 0;
				while (choice2 != 4) {

					System.out.println("1. Add new student data");
					System.out.println("2. Remove student data");
					System.out.println("3. View student data");
					System.out.println("4. Exit");
					System.out.println("Enter a choice: ");
					choice2 = sc.nextInt();
					switch (choice2) {
					case 1:
						System.out.println("Enter name of the student: ");
						String n = sc.next();
						System.out.println("Enter name of the subject: ");
						sc.nextLine();
						String sub = sc.nextLine();
						System.out.println("Enter assignment category: ");
						String category = sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date = sc.next();
						System.out.println("Enter assignment category marks: ");
						int marks = sc.nextInt();
						addStudentData(n, sub, category, date, marks);
						break;
					case 2:
						System.out.println("Enter name of the student to delete data: ");
						String name = sc.next();
						deleteData(name);
						break;
					case 3:
						System.out.println("Enter name of the student: ");
						String name2 = sc.next();
						viewData(name2);
						break;
					case 4:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Please enter a valid choice.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter name of the student: ");
				String studentName = sc.next();
				displayStudentWise(studentName);
				break;
			case 3:
				System.out.println("Enter name of the subject: ");
				sc.nextLine();
				String subjectName = sc.nextLine();

				displaySubjectWise(subjectName);
				break;
			case 4:
				int choice3 = 0;
				while (choice3 != 3) {
					System.out.println("1. Add Category");
					System.out.println("2. Remove Category");
					System.out.println("3. Exit");
					System.out.println("Enter a choice: ");
					choice3 = sc.nextInt();
					switch (choice3) {
					case 1:
						System.out.println("Enter name of the student : ");
						String name = sc.next();
						System.out.println("Enter subject: ");
						sc.nextLine();
						String subject = sc.nextLine();
						System.out.println("Enter assignment category : ");
						String assigncategory = sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date = sc.next();
						System.out.println("Enter assignment category marks: ");
						int marks = sc.nextInt();
						addAssignmentCategory(name, subject, assigncategory, date, marks);
						break;

					case 2:
						System.out.println("Enter name of the student : ");
						String name1 = sc.next();
						System.out.println("Enter subject : ");
						sc.nextLine();
						String subject1 = sc.nextLine();
						System.out.println("Enter assignment category ");
						String assigncategory1 = sc.next();

						removeAssignmentCategory(name1, subject1, assigncategory1);
						break;
					case 3:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Please enter a valid choice.");
						break;
					}
				}
				break;
			case 5:
				displayAssignmentCategory();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Please enter a valid choice.");
				break;
			}
		}
		sc.close();

		System.out.println("Hello World!");
	}

	private static void addStudentData(String n, String sub, String category, String date, int marks) {
		try {
			Data a = new Data(n, sub, category, marks, date);
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Data inserted successfully.");
		} catch (Exception e) {
			System.out.println("Data cannot be inserted");

			// TODO Auto-generated method stub

		}
	}

	private static void deleteData(String name) {
		// TODO Auto-generated method stub
		try {
			for (Data a : set) {
				if (a.studentName.equals(name)) {
					set.remove(a);
				}
			}
			System.out.println("Data removed successfully.");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ërror. Data cannot be deleted.");

		}
	}

	private static void viewData(String name2) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Student Name: " + name2);
			System.out.printf("%-20s %-20s %-20s %-10s", "Subject", "Assignment Category", "Date of Submission",
					"Marks");
			System.out.println();
			for (Data a : set) {
				if (a.studentName.equals(name2)) {
					System.out.printf("%-20s %-20s %-20s %-10s", a.subject, a.assignmentCategory, a.date, a.points);
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Error. Data cannot be viewed.");

		}
	}

	private static void displayStudentWise(String studentName) {
		// TODO Auto-generated method stub
		System.out.println("Student: " + studentName);
		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s", "Subject", "Test Score", "Quiz Score", "Lab Score",
				"Project Score", "Overall Rating(%)");
		System.out.println();
		boolean flag = false;
		for (Partb key : overallRating.keySet()) {
			if (key.studentName.equals(studentName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s", key.subject,
						overallRating.get(key).testscore != 0 ? overallRating.get(key).testscore : "NA",
						overallRating.get(key).quizscore != 0 ? overallRating.get(key).quizscore : "NA",
						overallRating.get(key).labscore != 0 ? overallRating.get(key).labscore : "NA",
						overallRating.get(key).projectscore != 0 ? overallRating.get(key).projectscore : "NA",
						overallRating.get(key).overallScore != 0 ? overallRating.get(key).overallScore : "NA");
				System.out.println();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Student does not exist.");
		}

	}

	private static void validateAssignmentCategory(Data data) {
		// TODO Auto-generated method stub
		Parta key = new Parta(data.getStudentName(), data.getSubject(), data.getAssignmentCategory());

		if (data.assignmentCategory.equalsIgnoreCase("test")) {
			if (test.containsKey(key)) {
				test.put(key, test.get(key) + 1);
				data.setAssignmentCategory("test_" + test.get(key));
			} else {
				test.put(key, 1);
				data.setAssignmentCategory("test_" + test.get(key));
			}
		} else if (data.assignmentCategory.equalsIgnoreCase("quiz")) {
			if (quiz.containsKey(key)) {
				quiz.put(key, quiz.get(key) + 1);
				data.setAssignmentCategory("quiz_" + quiz.get(key));
			} else {
				quiz.put(key, 1);
				data.setAssignmentCategory("quiz_" + quiz.get(key));
			}
		} else if (data.assignmentCategory.equalsIgnoreCase("lab")) {
			if (lab.containsKey(key)) {
				lab.put(key, lab.get(key) + 1);
				data.setAssignmentCategory("lab_" + lab.get(key));
			} else {
				lab.put(key, 1);
				data.setAssignmentCategory("lab_" + lab.get(key));
			}
		} else if (data.assignmentCategory.equalsIgnoreCase("project")) {
			if (project.containsKey(key)) {
				project.put(key, project.get(key) + 1);
				data.setAssignmentCategory("project_" + project.get(key));
			} else {
				project.put(key, 1);
				data.setAssignmentCategory("project_" + project.get(key));
			}
		} else {
			System.out.println("Please enter valid assignment category.");
		}

		set.add(new Data(data.getStudentName(), data.getSubject(), data.getAssignmentCategory(), data.getPoints(),
				data.getDate()));

	}

	private static void displayAssignmentCategory() {
		// TODO Auto-generated method stub
		System.out.printf("%-15s %-20s %-20s %-20s %-10s", "Student Name", "Subject", "Assignment Category",
				"Date of Submission", "Marks");
		System.out.println();
		for (Data data : set) {
			System.out.printf("%-15s %-20s %-20s %-20s %-10s", data.studentName, data.subject, data.assignmentCategory,
					data.date, data.points);
			System.out.println();
		}

	}

	private static void removeAssignmentCategory(String name1, String subject1, String assigncategory1) {
		// TODO Auto-generated method stub
		try {
			boolean flag = false;
			for (Data a : set) {
				if (a.studentName.equals(name1) && a.subject.equals(subject1)
						&& a.assignmentCategory.equals(assigncategory1)) {
					Partb key = new Partb(a.studentName, a.subject);
					if (assigncategory1.substring(0, 4).equalsIgnoreCase("test")) {
						testScore.put(key,
								new Valuea(testScore.get(key).marks - a.points, testScore.get(key).size - 1));
					} else if (assigncategory1.substring(0, 4).equalsIgnoreCase("quiz")) {
						quizScore.put(key,
								new Valuea(quizScore.get(key).marks - a.points, quizScore.get(key).size - 1));
					} else if (assigncategory1.substring(0, 3).equalsIgnoreCase("lab")) {
						labScore.put(key, new Valuea(labScore.get(key).marks - a.points, labScore.get(key).size - 1));
					} else if (assigncategory1.substring(0, 4).equalsIgnoreCase("proj")) {
						projectScore.put(key,
								new Valuea(projectScore.get(key).marks - a.points, projectScore.get(key).size - 1));
					} else {
						System.out.println("Please enter valid assignment category.");
					}
					set.remove(a);
					calculateScore(set);
					System.out.println("Assignment Category removed succesfully.");
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("Student data does not exist");
			}
		} catch (Exception e) {
			System.out.println("Error. Assignment Category cannot be removed.");
		}

	}

	private static void displaySubjectWise(String subjectName) {
		// TODO Auto-generated method stub
		LinkedHashMap<Partb, Valueb> temp = new LinkedHashMap<>(overallRating);
		boolean flag = false;
		System.out.println("Subject: " + subjectName);

		// To sort data according to overall rating (high to low)
		// temp = temp.entrySet().stream().sorted((i1, i2) ->
		// Float.valueOf(i2.getValue().overallScore).compareTo(Float.valueOf(i1.getValue().overallScore))
		// ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)
		// -> e1, LinkedHashMap::new));

		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s", "Student Name", "Test Score", "Quiz Score", "Lab Score",
				"Project Score", "Overall Rating(%)");
		System.out.println();
		for (Partb key : temp.keySet()) {
			if (key.subject.equals(subjectName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s", key.studentName,
						temp.get(key).testscore != 0 ? temp.get(key).testscore : "NA",
						temp.get(key).quizscore != 0 ? temp.get(key).quizscore : "NA",
						temp.get(key).labscore != 0 ? temp.get(key).labscore : "NA",
						temp.get(key).projectscore != 0 ? temp.get(key).projectscore : "NA",
						temp.get(key).overallScore != 0 ? temp.get(key).overallScore : "NA");
				System.out.println();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Subject does not exist.");
		}

	}

	private static void addAssignmentCategory(String name, String subject, String assigncategory, String date,
			int marks) {
		// TODO Auto-generated method stub
		try {
			Data a = new Data(name, subject, assigncategory, marks, date);
			if (assigncategory.equalsIgnoreCase("test")) {
				testScore.put(new Partb(a.studentName, a.subject), new Valuea(0, 1));
			} else if (assigncategory.equalsIgnoreCase("quiz")) {
				quizScore.put(new Partb(a.studentName, a.subject), new Valuea(0, 1));
			} else if (assigncategory.equalsIgnoreCase("lab")) {
				labScore.put(new Partb(a.studentName, a.subject), new Valuea(0, 1));
			} else if (assigncategory.equalsIgnoreCase("project")) {
				projectScore.put(new Partb(a.studentName, a.subject), new Valuea(0, 1));
			} else {
				System.out.println("Please enter valid assignment category.");
			}
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Assignment Category added succesfully.");
		} catch (Exception e) {
			System.out.println("Error. Assignment Category cannot be added.");
		}

	}

	private static void calculateScore(LinkedHashSet<Data> set2) {
		// TODO Auto-generated method stub
		for (Data key : set) {
			int score = key.points;
			if (key.assignmentCategory.substring(0, 4).equalsIgnoreCase("test")) {
				Partb key1 = new Partb(key.studentName, key.subject);
				if (testScore.containsKey(key1)) {
					testScore.put(key1, new Valuea(testScore.get(key1).marks + score, testScore.get(key1).size + 1));
				} else {
					testScore.put(key1, new Valuea(score, 1));
				}

			} else if (key.assignmentCategory.substring(0, 4).equalsIgnoreCase("quiz")) {
				Partb key1 = new Partb(key.studentName, key.subject);
				if (quizScore.containsKey(key1)) {
					quizScore.put(key1, new Valuea(quizScore.get(key1).marks + score, quizScore.get(key1).size + 1));
				} else {
					quizScore.put(key1, new Valuea(score, 1));
				}

			} else if (key.assignmentCategory.substring(0, 3).equalsIgnoreCase("lab")) {
				Partb key1 = new Partb(key.studentName, key.subject);
				if (labScore.containsKey(key1)) {
					labScore.put(key1, new Valuea(labScore.get(key1).marks + score, labScore.get(key1).size + 1));
				} else {
					labScore.put(key1, new Valuea(score, 1));
				}
			} else if (key.assignmentCategory.substring(0, 4).equalsIgnoreCase("proj")) {
				Partb key1 = new Partb(key.studentName, key.subject);
				if (projectScore.containsKey(key1)) {
					projectScore.put(key1,
							new Valuea(projectScore.get(key1).marks + score, projectScore.get(key1).size + 1));
				} else {
					projectScore.put(key1, new Valuea(score, 1));
				}
			}
		}

		for (Data key : set) {
			Partb key1 = new Partb(key.studentName, key.subject);
			float testscore = 0;
			float labscore = 0;
			float quizscore = 0;
			float projectscore = 0;
			if (testScore.containsKey(key1)) {
				testscore = (float) ((40 * testScore.get(key1).marks) / testScore.get(key1).size) / 100;
			} else {
				testscore = 0;
			}
			if (labScore.containsKey(key1)) {
				labscore = (float) ((10 * labScore.get(key1).marks) / labScore.get(key1).size) / 100;
			} else {
				labscore = 0;
			}
			if (quizScore.containsKey(key1)) {
				quizscore = (float) ((20 * quizScore.get(key1).marks) / quizScore.get(key1).size) / 100;
			} else {
				quizscore = 0;
			}
			if (projectScore.containsKey(key1)) {
				projectscore = (float) ((30 * projectScore.get(key1).marks) / projectScore.get(key1).size) / 100;
			} else {
				projectscore = 0;
			}
			float overallScore = quizscore + labscore + projectscore + testscore;
			Valueb value2 = new Valueb(testscore, labscore, quizscore, projectscore, overallScore);
			overallRating.put(key1, value2);
		}

	}

}
