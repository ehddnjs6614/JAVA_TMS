package TMS;

import java.util.Random;

import javax.swing.JOptionPane;

public class Subway extends Public{
	int fee = 1200;
	
	@Override
	int pay(int money) {
		money -= fee;
		return money;
	}
	
	@Override
	String go(int btnindex,int money) {
		//출발지와 도착지가 같은지 확인해주고 
		//정방향인지 역방향인지를 생각해서 for문을 돌아야한다.
		//index : 출발지
		//btnindex : 도착지
		int cnt = 0;
		int index = 0;
		String result = "";
		Random r = new Random();
		while(true) {
		index = r.nextInt(arStation.length);
		if(btnindex != index)break;
		
		
		}
		//cnt 음수면 역방향
		//cnt 양수면 정방향
		cnt = btnindex - index;
		
		if(money - fee < 0 ) {
			result = "잔액부족,";
			//잔액부족
		}else {
		result = "" +pay(money)+",";
		result += arStation[index] +">";
		if(cnt>0) {
			
			for (int i = 0; i <cnt; i++) {
				result += i == cnt -1 ? arStation[index+i+1] : arStation[index +i+1] + ">";
				}
				showDestMsg(arStation[btnindex]);
		}else {
			cnt *= -1;
			for (int i = 0; i <cnt; i++) {
				//index : 출발지
				result += i == cnt -1 ? arStation[index-i-1] : arStation[index -i-1] + ">";
				}
				showDestMsg(arStation[btnindex]);
		}
	
		}
	return result;
	}
	
	

	@Override
	void showDestMsg(String destination) {
		JOptionPane.showMessageDialog(null, destination +"에 도착했습니다.");
	}
}
