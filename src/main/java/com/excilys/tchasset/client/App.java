package com.excilys.tchasset.client;

import com.excilys.tchasset.spring.SpringConfig;

public class App {

	public static void main(String[] args) {
		SpringConfig.getContext().getBean(Client.class).affiche();
	}
}