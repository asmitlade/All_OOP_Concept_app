import java.util.Scanner;
import java.io.*;

class Painter_My_Code {
	public static void main(String[] args) throws IOException{
		//Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String option = "";
		Draw d = new Draw();
		System.out.println("Choose one number ::");
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		option = br.readLine();
		switch(option){
			case "1":
			{
				System.out.print("Enter value for lenght ::");
				String s = br.readLine();
				double len = Double.parseDouble(s);
				System.out.print("Enter value for width ::");
				String s1 = br.readLine();
				double wid = Double.parseDouble(s1);
				Rectangle r = new Rectangle(len,wid);
				d.setDraw(r);
				break;
			}
			case "2":
			{
				System.out.print("Enter value for sides ::");
				String s = br.readLine();
				double len = Double.parseDouble(s);
				Square sq = new Square(len);
				d.setDraw(sq);
				break;
			}
			case "3":
			{
				System.out.print("Enter value for radius ::");
				String s = br.readLine();
				double rad = Double.parseDouble(s);
				Circle c = new Circle(rad);
				d.setDraw(c);
				break;
			}
			default :
			{
				System.out.println("Please enter correct number...!!!");
			}
		}
	}
}