package CodewarsTasks.BasicProgram;
import static org.junit.Assert.assertEquals;




/*Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius.
        Unfortunately his code has some bugs.

        Find the errors in the code to get the celsius converter working properly.

        To convert fahrenheit to celsius:

        celsius = (fahrenheit - 32) * (5/9)

        Remember that typically temperatures in the current weather conditions are given in whole numbers.
        It is possible for temperature sensors to report temperatures with a higher accuracy such as to the nearest tenth.
        Instrument error though makes this sort of accuracy unreliable for many types of temperature measuring sensors.
        Bugs*/

public class grasshopper_debug {
    public static void main(String[] args) {
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));

        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));


    }


    public static class GrassHopper {

        public static String weatherInfo(int temp) {
            double c  =  convertToCelsius(temp);
            if (c < 0)
                return (c + " is freezing temperature");
            else
                return (c + " is above freezing temperature");
        }

        public static double convertToCelsius(int temperature) {

            return (temperature - 32) * 5/9.0;
        }

    }

    // Пример
    //можно было в одну строчку ) но я ж код друга поправлял а не переписывал
   /* public static  class GrassHopper {
        public static String weatherInfo(int temp){
            return ((temp - 32) * 5/9.0)<0?((temp - 32) * 5/9.0)+" is freezing temperature":((temp - 32) * 5/9.0)+" is above freezing temperature";
        }
    }*/


}
