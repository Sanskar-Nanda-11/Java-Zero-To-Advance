package com.besant.packages.oops.inheritances;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// Single Inheritance Start 
			Tata_motors tata = new Tata_motors();
			tata.color = " blue";
			tata.power_of_vehicle = 75.00f;
			tata.number_of_wheels = 4;
			tata.brand = " Tata ";
			tata.manfacture_year = 2024;
			tata.Milage = 50;

			tata.Transporting();
			tata.glass_material();
			
		// Multi-Level Start 
			Maruti_suzuki Suzuki = new Maruti_suzuki();
			Suzuki.color = " Green ";
			Suzuki.power_of_vehicle = 80.00f;
			Suzuki.number_of_wheels = 4;
			Suzuki.brand = " Suzuki ";
			Suzuki.manfacture_year = 2020;
			Suzuki.material = " Steel ";
			
			Suzuki.Off_Roading();
			Suzuki.madein();
			
		//  Hierarchical Inheritance Inheritance
			Hmil Hyundai_Motor_India_Limited = new Hmil();
			Hyundai_Motor_India_Limited.color = " blue";
			Hyundai_Motor_India_Limited.power_of_vehicle = 75.00f;
			Hyundai_Motor_India_Limited.number_of_wheels = 4;
			Hyundai_Motor_India_Limited.brand = " Tata ";
			Hyundai_Motor_India_Limited.manfacture_year = 2024;
			Hyundai_Motor_India_Limited.chassis = "Re-enforced";
			
			Hyundai_Motor_India_Limited.variant();
			Hyundai_Motor_India_Limited.Stunt();
			
			}
	}


