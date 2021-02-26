package lab8;

class Parallelepiped extends GeometricBody {

     double width;
     double height;
     double lenght;


    Parallelepiped( double width, double height, double lenght){
        width = x;
        height = y;
        length = z;

    }

    public double getSurfaceArea(){

        return width * height * 4 + length * width * 2;
    }

    public double getVolume(){

        return width * height * lenght;

    }
}
