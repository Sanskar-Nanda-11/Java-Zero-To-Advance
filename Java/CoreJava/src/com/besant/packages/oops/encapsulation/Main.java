package com.besant.packages.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setNoOfWheels(4);
		car.setEngineCapacity(600);
		car.setBrand("Audi");
		
		System.out.println("No of wheels : " + car.getNoOfWheels());
		System.out.println("Engine capacity : " + car.getEngineCapacity());
		System.out.println("Brand  " + car.getBrand());
		
		Train rajdhani = new Train();
		rajdhani.setBerth("Upper");
		rajdhani.setNoOfTickets(1);
		rajdhani.setSeatNumber(82);
		rajdhani.setTicketPrice(370);
		
		System.out.println("Train details : ");
		System.out.println("Berth : " + rajdhani.getBerth());
		System.out.println("Number of tickets : " + rajdhani.getNoOfTickets());
		System.out.println("Seat number : " + rajdhani.getSeatNumber());
		System.out.println("Ticket price : " + rajdhani.getTicketPrice());
	}

}
