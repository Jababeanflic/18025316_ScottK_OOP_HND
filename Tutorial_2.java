import java.util.Scanner;

public class Tutorial_2 {
    static Scanner kboard = new Scanner(System.in);

    public static void displaySeats(int noseats, String pname[])
    {
        for (int i=0;i<noseats;i++)
        System.out.println("Seat number "+i+" passenger "+pname[i]);
    }

    public static void bookseat(String pname[], int bookedseat, String name)
    {
        pname[bookedseat] = name;
        System.out.println("seat booked");
    }

    public static void cancel(String pname[], int cancelledseat)
    {
        pname[cancelledseat] = null;
        System.out.println("seat cancelled");
    }

    public static int getSeatNumber()
    {
        Scanner kboard = new Scanner(System.in);
        int seat=0;
        System.out.println("please enter seat number");
        seat=kboard.nextInt();
        return(seat);
    }

    public static String getName()
    {
        Scanner kboard = new Scanner(System.in);
        String name;
        System.out.println("please enter passenger name");
        name=kboard.nextLine();
        return(name);
    }

    public static void main(String[] args)
    {
        final int nosseats=5;
        String pname[] = new String[nosseats];
        int ptype[] = new int[nosseats];
        int choice = 0;

        System.out.println("Booking Menu");
        System.out.println("1. Book a seat, 2. Display all, 3. Cancel a seat, 4. exit");
        System.out.println("Please enter choice");
        choice = kboard.nextInt();
        do
            {
                switch(choice)
            {
                case 1:
                    displaySeats(nosseats,pname);
                    bookseat(pname,getSeatNumber(),getName());
                    break;
                case 2:
                    displaySeats(nosseats,pname);
                    break;
                case 3:
                    displaySeats(nosseats,pname);
                    cancel(pname,getSeatNumber());
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
            System.out.println("1. Book a seat, 2. Display all, 3. Cancel a seat, 4. exit");
            System.out.println("Please enter choice");
            choice = kboard.nextInt();
            }
        while (choice !=4);
    }
}

