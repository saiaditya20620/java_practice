package com.training.cg.dp;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Email notificaiton is sent");
	}

}
