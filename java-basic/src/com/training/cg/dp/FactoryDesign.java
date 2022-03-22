package com.training.cg.dp;

import com.test.cg.NotificationFactory;

public class FactoryDesign {
	public static void main(String args[]) {
		NotificationFactory factory=new NotificationFactory();
		Notification notification=factory.createNotification("push");
		notification.notifyUser();
	}

}
