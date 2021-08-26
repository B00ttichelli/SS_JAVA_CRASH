package CodewarsTasks.BasicProgram;

public class volume_of_a_cuboid {

    public static void main(String[] args) {

        System.out.println(Kata.getVolumeOfCuboid(3,3,3));  //  volume of cube  27.0 ))

    }


    public  static class Kata {

        public static double getVolumeOfCuboid(final double length, final double width, final double height) {
            // Your code here
            return length*width*height;
        }

    }
}
