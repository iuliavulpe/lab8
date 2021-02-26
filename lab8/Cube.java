package lab8;

    class Cube extends GeometricBody {
       private double height;
       private double width;
       private double length;


        Cube(double x, double width);

        public  double getSurfaceArea(){
            return  width * width * 6;
        }


        public  double getVolume(){
            return width * width * width;
        }



}
