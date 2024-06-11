package edu.training.jc.les14;

public class Group {
	private Student [] students = new Student[10];
	public Group (){
		students[0] = new Student("Петрович В. Г.", 6, new int[] {5,5,6,4,7,6,5,4,7,8});
		students[1] = new Student("Васильевич А. Г.", 10, new int[] {6,7,6,5,8,9,7,10,6,10});
		students[2] = new Student("Жигалко В. Н.", 10, new int[] {9,9,9,10,9,10,10,9,10,10});
		students[3] = new Student("Степенко Н. М.", 5, new int[] {5,5,6,4,7,6,5,4,7,8});
		students[4] = new Student("Максименко И. В.", 7, new int[] {6,7,6,5,8,9,7,10,6,10});
		students[5] = new Student("Степенко Н. М.", 5, new int[] {10,10,10,10,10,9,10,9,10,10});
		students[6] = new Student("Василенко Г. П.", 5, new int[] {6,7,6,5,8,9,7,10,6,10});
		students[7] = new Student("Игнатьенко Я. П.", 5, new int[] {6,7,6,5,8,9,7,10,6,10});
		students[8] = new Student("Мурзик И. Е.", 5, new int[] {6,7,6,5,8,9,7,10,6,10});
		students[9] = new Student("Вспоминакин П. С.", 5, new int[] {6,7,6,5,8,9,7,10,6,10});
	}
		public void bestStudent() {
			for (Student student : students) {
				boolean good = true;
				for (int i = 0; i < student.getPerformance().length; i++) {
					if (student.getPerformance()[i] < 9) {
						good = false;
					}
				}
				if (good) {
					System.out.println("Отличник " + student.getName() + " группа " + student.getGroup());
				}
				
			}
			
			
		}
		
	}

	
