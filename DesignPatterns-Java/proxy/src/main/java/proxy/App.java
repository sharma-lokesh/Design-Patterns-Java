package proxy;

public class App {

	public static void main(String[] args) {
		Internet intConn = new InternetProxy();
		try {
			intConn.connectTo("github.com");
			intConn.connectTo("brazzers.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
