import java.util.Scanner;

public class TicketSeller
{
    int tickets = 100;
    int buyers = 0;

    public void TicketSeller()
    {
        Scanner sc = new Scanner(System.in);
        while (this.tickets > 0)
        {
            System.out.print("Tickets you want to purchase: ");
            int x = sc.nextInt();
            buyTicket(x);
            if (this.tickets == 0)
            {
                System.out.println("Total amount of buyers: "+this.buyers);
            }
            //System.out.println("tickets = "+ this.tickets);
            //System.out.println("buyers = " +this.buyers);
        }
    }

    public void buyTicket(int amount)
    {
        if ((amount > 4) || (amount < 0))
        {
            System.out.println("You can only buy 4 tickets maximum.");
        }
        else
        {

            if ((this.tickets - amount) < 0)
            {
                System.out.println("There are less tickets left than you want to purchase.");
            }
            else
            {
                this.tickets = this.tickets - amount;
                this.buyers = this.buyers + 1;
            }
        }

    }

}
