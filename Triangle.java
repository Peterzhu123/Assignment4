// Created by Peter
// Created on Dec
// This is a program about Triangle

import java.util.Scanner;

public class Triangle {
	
	private static String type;
	private static double side1;
	private static double side2;
	private static double side3;
	private static double angle1;
	private static double angle2;
	private static double angle3;
	private static double height;
	private static double area;
	private static double perimeter;

	public Triangle(String _type, double _info1,double _info2,double  _info3) {
		this.type = _type;
		if(type.equalsIgnoreCase("SSS")){
			this.side1 = _info1;
			this.side2 = _info2;
			this.side3 = _info3;
		}
		else if(type.equalsIgnoreCase("SAS")){
			this.side3 = _info1;
			this.angle2 = _info2;
			this.side1 = _info3;
			this.side2 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2) - 2*side1*side3*Math.cos(Math.toRadians(angle2)));
		}
		else if(type.equalsIgnoreCase("SSA")){
			this.side3 = _info1;
			this.side1 = _info2;
			this.angle3 = _info3;
			this.side3 = (Math.sin(Math.toRadians(angle2))* side3) / Math.sin(Math.toRadians(angle3));
		}
		else if(type.equalsIgnoreCase("ASA")){
			this.angle2 = _info1;
			this.side1 = _info2;
			this.angle3 = _info3;
			this.side2 = ((side1/Math.sin(Math.toRadians(angle1))))* Math.sin(Math.toRadians(angle2));
			this.side3 = ((side1/Math.sin(Math.toRadians(angle1)))) * Math.sin(Math.toRadians(angle3));

		}
		else if(type.equalsIgnoreCase("AAS")){
			this.angle1 = _info1;
			this.angle2 = _info2;
			this.side1 = _info3;
			this.side2 = ((side1/Math.sin(Math.toRadians(angle1)))) * (Math.sin(Math.toRadians(angle2)));
			this.side3 = ((side1/Math.sin(Math.toRadians(angle1)))) * (Math.sin(Math.toRadians(angle3)));
		}
		this.area = area();
		this.perimeter = perimeter();
		this.height = height();
		
	}
	
	public double perimeter(){
		double perimeter = 0;
		if(type.equalsIgnoreCase("SSS")) {
			perimeter = side1 + side2 + side3; 
		}
		else if (type.equalsIgnoreCase("SAS")) {
			side2 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2) - 2*side1*side3*Math.cos(Math.toRadians(angle2)));
			perimeter = side1 + side2 + side3;
		}
		
		else if (type.equalsIgnoreCase("SSA")) {
			angle1 = (Math.asin((side1 * Math.sin(Math.toRadians(angle3))) / side3));
			angle2 = 180 - angle1 - angle3;
			side2 = (Math.sin(Math.toRadians(angle2))* side3) / Math.sin(Math.toRadians(angle3));
			perimeter = side1 + side2 + side3;
		}
		else if (type.equalsIgnoreCase("ASA")) {
			angle1 = 180 - angle2 - angle3;
			side2 = ((side1/Math.sin(Math.toRadians(angle1))))* Math.sin(Math.toRadians(angle2));
			side3 = ((side1/Math.sin(Math.toRadians(angle1)))) * Math.sin(Math.toRadians(angle3));
			perimeter = side1 + side2 + side3;
		}
		else if (type.equalsIgnoreCase("AAS")) {
			angle3 = 180 - angle1 - angle2;
			side2 = ((side1/Math.sin(Math.toRadians(angle1)))) * (Math.sin(Math.toRadians(angle2)));
			side3 = ((side1/Math.sin(Math.toRadians(angle1)))) * (Math.sin(Math.toRadians(angle3)));
			perimeter = side1 + side2 + side3;
		}
		return perimeter;
	}
	
	public double area(){
		double area = 0;
		double semi = 0;
		if(type.equalsIgnoreCase("SSS")) {
			semi = (side1 + side2 + side3)/2;
			area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		}
		else if(type.equalsIgnoreCase("SAS")) {
			semi = (side1 + side2 + side3)/2;
			area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		}
		else if(type.equalsIgnoreCase("SSA")) {
			semi = (side1 + side2 + side3)/2;
			area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		}
		else if(type.equalsIgnoreCase("ASA")) {
			semi = (side1 + side2 + side3)/2;
			area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		}
		else if(type.equalsIgnoreCase("AAS")) {
			semi = (side1 + side2 + side3)/2;
			area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		}
		return area;
	}	
	
	public double height() {
		double height = (2 * area) / side1 ;
		return height;
	}
	
	public double inscribedCircleRadius () {
		double radius = area / (perimeter/2);
		return radius;
	}
	
	public double areaOfTheCircumcircle () {
		double semi = perimeter/2;
		double radius = (side1 * side2 * side3)/4 * Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
		double circumcircle = Math.PI * Math.pow(radius, 2);
		return circumcircle;
		
	}
}
