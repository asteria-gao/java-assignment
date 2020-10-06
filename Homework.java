public class Homework {

	public static void main(String[] args) {
		int grade1, grade2, grade3, grade4, grade5;
		grade1 = (int) 91.14;
		if(grade1 <= 100 && grade1 >= 90) {
			System.out.print("A:Fantastic job");
			}
		
		grade2 = (int) 85.01;
		if(grade2 <= 90 && grade2 >= 80) {
			System.out.print("B:Good!");
			}
		
		grade3 = (int) 72;
		if(grade3 <= 80 && grade3 >= 70) {
			System.out.print("C:Please try more next time");
			}
		grade4 = (int) 63;
		if(grade4 <= 70) {
			System.out.print("F:Unfortunately you failed");
			}
		grade5 = (int) 81.14;
		if(grade5 <= 90 && grade5 >= 80) {
			System.out.print("B:Good!");
			}
		System.out.println("Your grade is" + grade1);
		System.out.println("Your grade is" + grade2);
		System.out.println("Your grade is" + grade3);
		System.out.println("Your grade is" + grade4);
		System.out.println("Your grade is" + grade5);
		
		
		char grade = 'A';
		switch(grade) {
		case 'A':
			System.out.println("A:Fantastic job!");
		case'B':
			System.out.println("B:Good!");
		case'C':
			System.out.println("C:Please try more next time!");
		case'F':
			System.out.println("F:Unfortunately you failed!");
			break;
			default:
				System.out.println("Invalid grade");
		}
		System.out.println("Your grade is" + grade);
		}
}
