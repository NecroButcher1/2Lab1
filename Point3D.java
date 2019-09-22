public class Point3D {
    private double x,y,z;
    public Point3D(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Point3D(){
        x=0;
        y=0;
        z=0;
    }
    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ(){
        return z;
    }
    public void printPoint(){
        System.out.println("("+x+","+y+","+z+")");
    }
}

