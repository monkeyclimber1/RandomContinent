import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // This program is going to ask you to input a number between 1 and 7 which ever number you select. That's the country and city you go to.
        System.out.println("Select a number between 1 and 7 and a continent and their city will be given!");
        Scanner continents = new Scanner(System.in);





                switch (continents.nextInt()){
                    case 1:
                        System.out.print("North America: Mexico City, Mexico");
                        break;
                    case 2:
                        System.out.print("South America: Sam Paulo, Brazil");
                        break;
                    case 3:
                        System.out.print("Europe: Moscow, Russia");
                        break;
                    case 4:
                        System.out.print("Africa: Lagos, Nigeria");
                        break;
                    case 5:
                        System.out.print("Asia: Shanghai, China");
                        break;
                    case 6:
                        System.out.print("Australia: Sydney, Australia");
                        break;
                    case 7:
                        System.out.print("Antarctica: McMurdo Station, US");
                        break;
                    default:
                        System.out.println("Undefined continent!");
                }



            }
        }