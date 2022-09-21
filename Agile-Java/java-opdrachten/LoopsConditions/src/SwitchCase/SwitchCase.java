package SwitchCase;

public class SwitchCase {                                                                               //OPDR1.6
    public static String getDotW(String day) {

       String DotW = " ";

       if (day.equals(" ")) {
           return DotW;
       }

        switch (day.toLowerCase()) {
            case "monday":
                DotW = "I don't like mondays";
//                System.out.println("I don't like mondays");
                break;
            case "tuesday":
                DotW = "Tuesday Bluesday";
                break;
            case "wednesday":
                DotW = "It is wednesday, my dudes.";
                break;
            case "thursday":
                DotW = "Thursday shmursday";
                break;
            case "friday":
                DotW = "Can't wait for the weekend to begin, huh?";
                break;                                                                                                   //OPDR1.7 zonder break gaat de switch over op zaterdag, ondanks dat de input friday is
            case "saturday":
                DotW = "I don't know what to do with my life";
                break;
            case "sunday":
                DotW = "I still don't know what to do with my life";
                break;
            default:
                DotW = "invalid";
                break;
        }
        return DotW;
    }

    public static void main(String[] args) {

        String day = "wednEsDay";

        String returnedDay = SwitchCase.getDotW(day);

            System.out.println(returnedDay);
        }
    }

