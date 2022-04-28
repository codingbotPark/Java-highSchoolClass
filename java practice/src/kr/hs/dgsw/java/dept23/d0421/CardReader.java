package kr.hs.dgsw.java.dept23.d0421;

public class CardReader {
	
	protected int income;
	
	public CardReader() {
		this.income = 0;
	}
	
	public void contact(Card card) {
		String type = card.getType();
		int fee = 0;
		if ("����".equals(type)) {
			fee = 1500;
		} else if ("�л�".equals(type)) {
			fee = 800;
		} else if ("���".equals(type)){
			fee = 0;
		} else {
			throw new RuntimeException("�߸��� ī���Դϴ�");
		} 
		
		boolean enough = card.canPaiable(fee);
	
		if (enough) {
			card.payment(fee);
			income += fee;
			System.out.println(card.getType() + "�Դϴ�");
		} else {
			System.out.println("�ܾ��� �����մϴ�. ���� ��������");
		}
	}
	
	public int getIncome() {
		return this.income;
	}
	
	public static void main(String[] args) {
		CardReader reader = new CardReader();
		
		KidCard kidcard1 = new KidCard(100);
		reader.contact(kidcard1);
		
		KidCard kidcard2 = new KidCard(1000);
		reader.contact(kidcard2);
		
		AdultCard adultCard1 = new AdultCard(10000);
		reader.contact(adultCard1);
		
		SeniorCard seniorCard = new SeniorCard(20);
		reader.contact(seniorCard);
		
		
		System.out.println("������ ������" + reader.getIncome() + "�Դϴ�");
	}
}