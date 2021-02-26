package lab8;

 abstract class GeometricBody {
    public  double height;
    public  double width;
    public  double length;
    public  double radius;
    public static double pi = 3.14;

     double x;
     double y;
     double z;
     double r;

    public GeometricBody(double height, double widht, double lenght, double radius) {
        height = x;
        width = y;
        lenght = z;
        radius = r;
    }


    public  double getSurfaceArea();

    public  double getVolume();

}
