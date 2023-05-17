package Vehicle_Parking_Lot_System;

import java.util.Scanner;

public class vehicleParkingSystem {
	
	String scooterLane[][],carLane[][];
	int noOfVehicles,noOfCars,noOfScooters;
	static Scanner inp;
	
	vehicleParkingSystem(){
		scooterLane=new String[2][10];
		carLane=new String[2][10];
		noOfVehicles=noOfCars=noOfScooters=0;
		inp=new Scanner(System.in);
	}
	
	public void add() {
		System.out.println("Enter Type of Vehicle(Car/Scooter)");
		String type=inp.next();
		if(type.equals("Car") || type.equals("car")) {
			System.out.println("Enter Registration Number:");
			for(int i=0;i<2;i++) {
				for(int j=0;j<10;j++) {
					if(carLane[i][j]==null) {
						carLane[i][j]=inp.next();
						System.out.println("Vehicle added");
						noOfVehicles++;
						noOfCars++;
						return;
					}
				}
			}
		}
		else if(type.equals("Scooter") || type.equals("scooter")) {
			System.out.println("Enter Registration Number:");
			for(int i=0;i<2;i++) {
				for(int j=0;j<10;j++) {
					if(scooterLane[i][j]==null) {
						scooterLane[i][j]=inp.next();
						System.out.println("Vehicle added");
						noOfVehicles++;
						noOfScooters++;
						return;
					}
				}
			}
		}
		else {
			System.out.println("Invalid Vehicle");
		}
		
	}
	
	
	public void remove() {
		System.out.println("Enter Type of Vehicle(Car/Scooter)");
		String type=inp.next();
		if(type.equals("Car") || type.equals("car")) {
			System.out.println("Enter Registration Number:");
			String regNo=inp.next();
			for(int i=0;i<2;i++) {
				for(int j=0;j<10;j++) {
					if(carLane[i][j].equals(regNo)) {
						int k=j;
						while(k<9) {
							carLane[i][k]=carLane[i][k+1];
							k++;
						}
						carLane[i][k]=null;
						System.out.println("Vehicle removed");
						noOfVehicles--;
						noOfCars--;
						return;
					}
				}
			}
			System.out.println("Vehicle not found!");
		}
		else if(type.equals("Scooter") || type.equals("scooter")) {
			System.out.println("Enter Registration Number:");
			String regNo=inp.next();
			for(int i=0;i<2;i++) {
				for(int j=0;j<10;j++) {
					if(scooterLane[i][j].equals(regNo)) {
						scooterLane[i][j]=null;
						System.out.println("Vehicle removed");
						noOfVehicles--;
						noOfScooters--;
						return;
					}
				}
			}
			System.out.println("Vehicle not found!");
		}
		else {
			System.out.println("Invalid Vehicle");
		}
		
	}
	
	public static void main(String[] args) {
		vehicleParkingSystem v = new vehicleParkingSystem();
		
		boolean loop=true;
		while(loop) {
			System.out.println("\n----------------------");
			System.out.println("Vehicle Parking System");
			System.out.println("----------------------\n");
			System.out.println("1. Add a Vehicle");
			System.out.println("2. Remove a Vehicle");
			System.out.println("3. Number of Vehicles parked");
			System.out.println("4. Number of Cars parked");
			System.out.println("5. Number of Scooters parked");
			System.out.println("6. Exit");
			System.out.println("\nEnter Your Choice");
			int choice=inp.nextInt();
			System.out.println("----------------------\n");
			
			if(choice==1) {
				v.add();
			}
			else if(choice==2) {
				v.remove();
			}
			else if(choice==3) {
				System.out.println("No of Vehicles Parked:"+v.noOfVehicles);
			}
			else if(choice==4) {
				System.out.println("No of Cars Parked:"+v.noOfCars);
			}
			else if(choice==5) {
				System.out.println("No of Scooters Parked:"+v.noOfScooters);
			}
			else if(choice==6) {
				System.out.println("System Logged Off");
				break;
			}
			else {
				System.out.println("Invalid Choice");
			}
		}
		
	}

}
