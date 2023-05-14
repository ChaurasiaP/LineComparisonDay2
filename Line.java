package RFP283.Assignments.Day2.LineCompare;

public class Line {
    Point pt1, pt2;
    float length;

    float getLength(){
        return (float)Math.sqrt(Math.pow(pt1.x - pt2.x,2 ) + Math.pow(pt1.y- pt2.y,2 ));
    }

}
