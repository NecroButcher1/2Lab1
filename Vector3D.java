public class Vector3D {
    private Point3D point1,point2;
    public Vector3D(){
        point1=new Point3D();
        point2=new Point3D();
    }
    public Vector3D(Point3D point1, Point3D point2){
        this.point2=point2;
        this.point1=point1;
    }
    public Vector3D(double x1,double y1,double z1,double x2,double y2, double z2){
        point1= new Point3D(x1,y1,z1);
        point2 = new Point3D(x2,y2,z2);
    }
    public double length(){
        return Math.sqrt(Math.pow((point1.getX()-point2.getX()),2)+Math.pow((point1.getY()-point2.getX()),2)+Math.pow((point1.getZ()-point2.getZ()),2));
    }
    public boolean equale(Vector3D vector){
        return (this.length()==vector.length())&&((this.point1.getX()%vector.point1.getX()==0)||(this.point1.getY()%vector.point1.getY()==0)||this.point1.getZ()%vector.point1.getZ()==0);
    }
}
