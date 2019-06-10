package arima.anotherpack.utils;

public class Logger {

	public static void log(String log) {
		System.out.println(log);
	}
	
	public static void logApi(String log) {
		System.out.println("MYSQL_CONNECTOR_API:" + " " + log);
	}

}
