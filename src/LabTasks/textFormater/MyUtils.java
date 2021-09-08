package LabTasks.textFormater;

public class MyUtils {

    public static void main(String[] args) {

        //Testing
        String example = "Java    was      originally developed\n" +
                "   by    James   Gosling at Sun Microsystems (which\n" +
                " has since been\n" +
                "acquired by Oracle) and released in 1995\n" +
                " as a core component of Sun Microsystems' Java platform.";

        System.out.println(reformatLines(example));


    }

     static public String reformatLines(String text) {


        // Code
        text = text.replace("\n", " ");
        while(text.contains("  ")){
            text = text.replace("  "," ");
        }

        if(text.startsWith(" ")){
            text = text.substring(1);
        }
        if (text.endsWith(" ")){
            text = text.substring(0,text.length()-1);
        }

        String endLine = "\n";
        for (int i = 59; i <text.length() ; i+=60) {
            while (!Character.isWhitespace(text.charAt(i))){
                --i;
            }
            text = text.substring(0,i)+endLine+text.substring(i+1);
        }



        return text;


    }

}
