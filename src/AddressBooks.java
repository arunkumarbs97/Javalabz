import java.util.Scanner;

public class AddressBooks
{
    public static void main( String... args)
    {
        Scanner input = new Scanner(System.in);
        String[][] AddressBooks = new String[100][8];

        AddressBooks[0][0]="Mobile Number";
        AddressBooks[0][1]="First Name";
        AddressBooks[0][2]="Last Name";
        AddressBooks[0][3]="Address";
        AddressBooks[0][4]="City";
        AddressBooks[0][5]="County";
        AddressBooks[0][7]="Telephone Number";
        AddressBooks[1][0]="1";
        AddressBooks[1][1]="David";
        AddressBooks[1][2]="Needham";
        AddressBooks[1][3]="Sraheens, Achill";
        AddressBooks[1][4]="Galway";
        AddressBooks[1][5]="Mayo";
        AddressBooks[1][6]="086-1581077";
        AddressBooks[1][7]="098-45368";

        AddressBooks[2][0]="2";
        AddressBooks[2][1]="Mc";
        AddressBooks[2][2]="lovin";
        AddressBooks[2][3]="Hawaii";
        AddressBooks[2][4]="Hawaii";
        AddressBooks[2][5]="Hawaii";
        AddressBooks[2][6]="12345";
        AddressBooks[2][7]="412-555-1234";

        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.print("\n1 - Insert a New Contact \n2 - Search Contact by Last Name \n3 - Delete Contact \n4 - Show All Contacts \n5 - Exit " );
        System.out.print("\n");
        System.out.print("\nChoose your option: ");

        int option = input.nextInt();

        if (option ==1)
        {
            System.out.print("\nPlease enter your First Name : ");
        }
        if (option ==2)
        {
        }

        if (option ==3)
        {
        }
        if (option ==4)
        {
            System.out.println(AddressBooks[1][0]+
                    "\t"+AddressBooks[1][2]+ ", "+AddressBooks[1][1]+
                    "\n\t"+AddressBooks[1][3]+
                    "\n\t"+AddressBooks[1][4]+ ", "+AddressBooks[1][5]+ " "+AddressBooks[1][6]+
                    "\n\t"+AddressBooks[1][7]);
        }

        if (option ==5)
        {
        }

    }
}
