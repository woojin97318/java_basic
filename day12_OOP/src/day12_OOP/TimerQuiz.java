package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerQuiz {
	private Date date;
	private SimpleDateFormat simpl;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SimpleDateFormat getSimpl() {
		return simpl;
	}
	public void setSimpl(SimpleDateFormat simpl) {
		this.simpl = simpl;
	}

	public static void main(String[] args) {
		TimerQuiz tq = new TimerQuiz();
		long time;
		
		int i = 0;
		while(i < 10) {
			time = System.currentTimeMillis();
			tq.setSimpl(new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초"));
			String str = tq.getSimpl().format(time);
			System.out.println(str);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {	}
			i++;
		}
		System.out.println();
		
		i = 0;
		while(i < 10) {
			tq.setDate(new Date());
			System.out.println(tq.getDate());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {	}
			i++;
		}
	}
}
