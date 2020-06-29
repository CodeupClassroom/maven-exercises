import java.util.Scanner;

    public class primaryClass {

        Scanner sc = new Scanner(System.in);
        //wi this class will use this scanner, made private bc other things will not need user input here

        public Scanner getScanner(){
            return sc;
        };

//        public Input () {
//            this.scanner = new Scanner(System.in);
//            //in instructions, 'when a new instance is set use scanner...'
//            //this creates a new one every time its used, aka called
//        }

        public static void main(String[] args) {
            System.out.println("Enter an input: ");
            //userinput
            System.out.println("You entered: ");

        }



}
