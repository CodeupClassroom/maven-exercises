import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

    public class primaryClass {

        public void StringUtils (){

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an input: ");
            String something = sc.nextLine();
            System.out.println("You entered: " + sc);
            System.out.println("\"" + something + "\" " + returnNumMessage(something) );
            System.out.println("Flipped Case: " + StringUtils.swapCase(something));
            System.out.println("reversed: " + StringUtils.reverse(something));

        }

        public static String returnNumMessage(String input) {
            return(StringUtils.isNumeric(input)) ? "is a nuamber" : "is not a num";
            //concatonated w sout strings
        }


}
