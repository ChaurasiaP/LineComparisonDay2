package RFP283.Assignments.Day2.LineCompare;

import java.util.Scanner;
//UC4
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Line line = new Line();

        Line line1 = new Line();
        System.out.println("Enter Co-ordinates for line 1");
        line1.pt1 = new Point();
        line1.pt1.x = sc.nextInt();
        line1.pt1.y = sc.nextInt();

        line1.pt2 = new Point();
        line1.pt2.x = sc.nextInt();
        line1.pt2.y = sc.nextInt();

        System.out.println("length of line 1: " + line1.getLength());


        Line line2 = new Line();
        System.out.println("Enter Co-ordinates for line 2");
        line2.pt1 = new Point();
        line2.pt1.x = sc.nextInt();
        line2.pt1.y = sc.nextInt();

        line2.pt2 = new Point();
        line2.pt2.x = sc.nextInt();
        line2.pt2.y = sc.nextInt();

        System.out.println("length of line 2: " + line2.getLength());
        line.compareLength((double) line1.getLength(), (double)line2.getLength());
    }
}