package LabTasks.Parentesies;

public class Parenthesis {

    public static void main(String[] args) {

        //тестировал войну со слэшами
        MyUtils myUtils = new MyUtils();
        String  text =   "(\\\\()";
        System.out.println(text);
        System.out.println(text.replaceAll("\\\\}","")
                .replaceAll("\\\\\\{","")
                .replaceAll("\\\\\\)","")
                .replaceAll("\\\\\\(","")
                .replaceAll("\\\\]","")
                .replaceAll("\\\\\\[","")
                .replaceAll("\\\\","")

               );

        System.out.println(myUtils.verifyBrackets("(\\\\()"));
    }


    /*Sequences "\\(", "\\)", "\\[", "\\]", "\\{" and "\\}" are not brackets.*/
     static class MyUtils {
        public boolean verifyBrackets(String text) {

            text = text.replaceAll("\\\\}","")
                    .replaceAll("\\\\\\{","")
                    .replaceAll("\\\\\\)","")
                    .replaceAll("\\\\\\(","")
                    .replaceAll("\\\\]","")
                    .replaceAll("\\\\\\[","")
                    .replaceAll("\\\\","");

            if(text.equals("") || text == null){
                return true;
            }

            while(text.contains("()") || text.contains("[]")|| text.contains("{}")){
                text = text.replaceAll("\\(\\)","").replaceAll("\\[]","")
                        .replaceAll("\\{}","");
            }

            return (text.length()==0);
        }
    }
}
