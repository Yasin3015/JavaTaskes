import java.util.Scanner;
public class areaTask{
    public static void main(String[] args) {
       System.out.println("Which shape you want to calc its area and circumference ? \n");
       checkSelect();
    }
    public static void checkSelect(){
        System.out.println(" For triangle press 1 \n For circle press 2 ");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the shape you need : ");
        int number = Integer.parseInt(num.nextLine());
        switch (number) {
            case 1 ->                 {
                    calcAreaAndCircumference obj = new calcAreaAndCircumference();
                    obj.triangle();
                }
            case 2 ->                 {
                    calcAreaAndCircumference obj = new calcAreaAndCircumference();
                    obj.circle();
                }
            default -> {
                System.out.println("\nInvalid number , try again . \n ");
                checkSelect();
            }
        }
    }
    
}
class calcAreaAndCircumference{
    public void triangle(){
        System.out.println("Enter the values of the sides of the triangle ");
        Scanner firstSide = new Scanner(System.in);
        System.out.print("Enter the first side : ");
        double side_1 = Double.parseDouble(firstSide.nextLine());
        Scanner secSide = new Scanner(System.in);
        System.out.print("Enter the second side : ");
        double side_2 = Double.parseDouble(secSide.nextLine());
        Scanner base = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        double theBase = Double.parseDouble(base.nextLine());
        Scanner hight = new Scanner(System.in);
        System.out.print("Enter the hight of the triangle : ");
        double theHight = Double.parseDouble(hight.nextLine());
        System.out.println("The area of the triangle is : " + (.5*theBase*theHight) + " m^2 ");
        System.out.println("The circumference of the triangle is : " + (theBase+side_1+side_2) + " m ");
    }
    public void circle(){
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double theRadius = Double.parseDouble(radius.nextLine());
        System.out.println("The area of the triangle is : " + (3.14*theRadius*theRadius) + " m^2 ");
        System.out.println("The circumference of the triangle is : " + (2*theRadius*3.14) + " m ");
    }
}