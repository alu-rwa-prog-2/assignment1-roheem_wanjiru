
public class User_Info {
	public static void main(String[] args) {	

// PT1: Calculating a person's BMI
// a = the persons height in meters
// b = the persons weight in kilogrammes
String user_name = "W";
int a = 2;
int b = 80;

// BMI is given by weight/(height)^2
// (a*a) is used to symbolise height squared (^2 didn't seem to work)
int division = b/(a*a);
System.out.println(division);
System.out.println(user_name + " your BMI is " + division);


// PT2: Calculating Perimeter and Surface Area
// x = the length 
// y = the width
// z = height
// P = 2x + 2y 
// S.A. = 2xy + 2xz + 2zy

int x = 99;
int y = 77;
int z = 44;
int sum = (x*2) + (y*2);
int sum2 = (2*x*y) + (2*x*z) + (2*z*y);

System.out.print("The perimeter of this rectangle is " + sum + " and its"
		+ " surface area is " + sum2);
}}


