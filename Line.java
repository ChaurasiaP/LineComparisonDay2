package RFP283.Assignments.Day2.LineCompare;

//UC4
public class Line {
    Point pt1, pt2;
    float length;

    float getLength() {
        return (float) Math.sqrt(Math.pow(pt1.x - pt2.x, 2) + Math.pow(pt1.y - pt2.y, 2));
    }
    void compareLength(Double l1, Double l2){
        length = l1.compareTo(l2);
        if(length<0){
            System.out.println("Line 1 is smaller");
        } else if (length>0) {
            System.out.println("Line 1 is greater");
        }else {
            System.out.println("Lines are equal");
        }
    }
}
