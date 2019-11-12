package observer.annotation;

import java.util.Date;

public class Component {
	@Subscription
	public void onString(String s) {
		System.out.println("String - " + s);
	}

	@Subscription
	public void onDate(Date d) {
		System.out.println("Date - " + d);
	}

	@Subscription
	public void onDouble(Double d) {
		System.out.println("Double - " + d);
	}
}
