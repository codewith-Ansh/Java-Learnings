class Point {
  int x, y;
  Point(int x, int y){ this.x = x; this.y = y; }
  public boolean equals(Object o){
    if(!(o instanceof Point)) return false;
    Point p = (Point) o; 
    return x == p.x && y == p.y;
  }
}
public class T1 {
  public static void main(String[] a){
    Point p1 = new Point(1,2);
    Point p2 = new Point(1,2);
    System.out.println((p1==p2) + " " + p1.equals(p2));
  }
}

// output: false true

// p1 == p2 → false → they are two different objects stored at different memory locations.
// p1.equals(p2) → true → you overrode equals() to compare the values (x and y), and both have (1, 2).