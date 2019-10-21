package com.yaya.toytiger.service;

public class Station extends Thread {
	private static int tickets = 10;
	private Object LOCK = "locked";

	public Station(String name) {
		super(name);
	}

	@Override
	public void run() {
		super.run();
		while (tickets > 0) {
			synchronized (LOCK){
				if (tickets>0){
					System.out.println(getName() + "卖出第"+ (10-tickets+1) +"张票");
					--tickets;
				}else {
					System.out.println("票卖完了");
				}
				try {
					sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
			}

		}
	}
}
