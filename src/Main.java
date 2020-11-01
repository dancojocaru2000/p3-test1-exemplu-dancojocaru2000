import java.util.Arrays;

public class Main {
	
	static void subpunctulB(Student[] tablou) {
		for (Student s : tablou) {
			System.out.println(s);
		}
	}
	
	static int subpunctulC(Student[] tablou, int x) {
		return (int) Arrays.stream(tablou)
				.sequential()
				.filter((s) -> s.getVarsta() < x)
				.count();
	}

	public static void main(String[] args) {
		
		//tablou studenti
        Student[] tablou = new Student[2];
        tablou[0] = new Student("Ana Grigore", 18);
        tablou[1] = new Student("Gheorghe Gheorghiliu", 21);

		//apel metode
		subpunctulB(tablou);
		System.out.println(subpunctulC(tablou, 21));
		

	}

}
