public class Point {
    public double x, y;
    Point(double x_value, double y_value){
        x = x_value;
        y = y_value;
    }
    public void clear(){
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point that){
        double xDiff = x - that.x;
        double yDiff = y - that.y;
        return Math.sqrt(xDiff * xDiff + yDiff +yDiff);
    }

    public static void main(String[] args) {
        Point callPoint =  new Point(5.1, 6.7);
        System.out.println(callPoint.distance(callPoint));
    }
}