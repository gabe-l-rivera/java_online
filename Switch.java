public class Switch {
    public static void main(String[] args){
        int swVal = 2;

        switch(swVal){
            case 1:
                System.out.println("Case 1.");
                break;

            case 2:
                System.out.println("Case 2.");
                break;

            case 3:case 4:case 5:
                System.out.println("Case 3, 4 or 5.");
                break;

            default:
                System.out.println("Default");
                break;

        }

        System.out.println("End of sw statements!");

    }
}
