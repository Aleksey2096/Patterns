package com.example.patterns.creational.factory_method;

public class Runner {
	public static void main(String[] args) {
		DisplayService service = new FeedbackXMLDisplayService();
		service.display();

		service = new ErrorXMLDisplayService();
		service.display();
	}
}
