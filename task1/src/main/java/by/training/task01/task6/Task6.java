package by.training.task01.task6;

//	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
public class Task6 {

	public static void main(String[] args) {
		int secondsOfDay = 77453;
		System.out.println("Количество полных часов: " + setHours(secondsOfDay));
		System.out.println("Количество полных минут: " + setMinutes(secondsOfDay, setHours(secondsOfDay)));
		System.out.println("Количество секунд: " + setSeconds(secondsOfDay,setHours(secondsOfDay),setMinutes(secondsOfDay, setHours(secondsOfDay))));
	}

	static int setHours(int s) {
		int hour = s / 3600;
		return hour;
	}

	static int setMinutes(int s, int h) {
		int minute = (s - h * 3600) / 60;
		return minute;
	}

	static int setSeconds(int s, int h, int m) {
		int second = s - h * 3600 - m * 60;
		return second;
	}

}
