package kr.hs.dgsw.java.dept23.d0407;
import java.util.Scanner;

public class Task {
	private Scanner scanner;
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	public void closeScanner() {
		this.scanner.close();
	}
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public String findStudent(int num) {
		String[] name = {"정은서","강성훈","고용빈","기준","김민성","류지훈","박병관","박성한","박지건","박현우","손원","안찬","우상범","윤병훈","윤서준", "이승민", "이지호","최민재","한상빈"};
		if (num > 0 && num < 20) {			
			return name[num - 1];
		} else {
			return "없는 번호입니다";
		}
		
	}
	
	// static은 클래스에 계속 있게 한다
	public static void main(String[] args) {		
		Task task = new Task();
		task.prepareScanner();
		Scanner scanner = task.getScanner();
		int number = scanner.nextInt();
		
		System.out.printf("번호를 입력하세요 : ");
		System.out.println(task.findStudent(number));
		task.closeScanner();
	}
}
