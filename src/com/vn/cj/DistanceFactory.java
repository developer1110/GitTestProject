package com.vn.cj;

/* 
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
*/

class DistanceBetweenPoints {
	
	protected double x1;
	protected double x2;
	protected double y1;
	protected double y2;

	public DistanceBetweenPoints() {
		this.x1 = 0;
		this.x2 = 0;
		this.y1 = 0;
		this.y2 = 0;
	}
	
	DistanceBetweenPoints(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	double calculateDistance (){
		double dis = 0;
		dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
		
		return dis;
		
	}

}

class DistanceBetweenPoints3D extends DistanceBetweenPoints {
	protected double z1;
	protected double z2;
	
	DistanceBetweenPoints3D(double x1, double x2, double y1, double y2, double z1, double z2) {
		super(x1,x2,y1,y2);
		this.z1 = z1;
		this.z2 = z2;
		
	}
	
	double calculateDistance (){
		double dis = 0;
		dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2) + Math.pow(z2 -z1, 2));
		
		return dis;
		
	}
	
}

public class DistanceFactory {
	public static void main(String[] args) {
		DistanceBetweenPoints dbp = new DistanceBetweenPoints(1.0, 3.0, 1.0, 3.0);
		double dis = dbp.calculateDistance();
		System.out.println("2D Distance Between Point is " + dis);
		
		DistanceBetweenPoints dbp1 = new DistanceBetweenPoints3D(1.0, 3.0, 1.0, 3.0, 1.0, 3.0);
		double dis3D = dbp1.calculateDistance();
		System.out.println("3D Distance Between Point is " + dis3D);
	}
}