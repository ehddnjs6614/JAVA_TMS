package TMS;


//pay() : 요금을 정산할 수 있는 메서드
//showdestMsg(String destination) : 도착시 "도착지에 도착했습니다" 메시지 출력
//자식 클래스 : 버스,지하철

//view
//이용하실 대중교통을 선택하세요
//도착지는 버튼으로 구현 (optionDialog())
//출발지와 도착지가 같지 않도록 구현 
//버스는 정방향만 가능
//전철은 역방향 가능
//교대 > 강남 > 역삼 > 선릉

public abstract class Public {
	String[] arStation= {"교대","강남","역삼","선릉"};
	
	abstract int pay(int money);
	abstract void showDestMsg(String destination);
	abstract String go(int btnindex,int money);
	 
	
	
	
	

}
