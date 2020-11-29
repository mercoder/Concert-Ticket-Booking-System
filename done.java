import java.util.*;
import java.lang.*;
class LogIn
{
    String name;
    String password;
    LogIn()
    {
        name =null;
        password =null;
    }
   LogIn(String a,String b)
    {
       this.name=a;
       this.password=b;
    }
    int login(LogIn c,ArrayList d)
    { boolean a1 = d.contains(c); 
        if(a1)
        {
            System.out.println("Welcome back");
            return 1;
        }
        else 
        {
            System.out.println("Username doesnt exist");
            return 0;
            
        }
    }
}
class Register extends LogIn
{
    Register (String a,String b)
    {
        super(a, b);
    }
    void register(Object c,ArrayList l)
    {
        l.add(new Register(name,password));
    }
        
}

interface concert
{
public void concertInfo();
}

class BTS implements concert
{
Scanner sc=new Scanner(System.in);
int flag=0, p=5, g=8, s=12, nf_seat=0;
float seat_cost;
String concert_name="BTS: Love Yourself World Tour: Dubai";
String concert_date="20-01-2020";
String concert_venue="Festival Arena, Dubai Festival City";
String concert_timing="6:30 pm";
int seats[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

public void concertInfo()
{
System.out.println("Name of concert : "+concert_name+"\nConcert Date : "+concert_date+"\nConcert Venue : "+concert_venue+"\nConcert Timigs : "+concert_timing);
System.out.println("Seating Plan : ");
for(int i=0; i<5; i++)
{
for(int j=0; j<5; j++)
{
if(i<2)
System.out.print(seats[i][j]+"  ");
else
System.out.print(seats[i][j]+" ");
}
System.out.println();
}
System.out.println("Press 0 for platinum, 1 for gold and 2 for silver : ");
int seat_type=sc.nextInt();
System.out.println("Select your seat (Maximum 2 seats can be booked per person and 0 means the seat is booked):");
int seat_no=sc.nextInt();
for(int i=0; i<5; i++)
{
for(int j=0; j<5; j++)
{
if(seat_no==seats[i][j])
{
seats[i][j]=0;
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println("Please choose a valid seat!");
}
else
{
switch(seat_type)
{
case 0:
{
p--;
if(p==0)
{
System.out.println("No more platinum seats available!");
break;
}
nf_seat++;
seat_cost=1200;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
case 1:
{
g--;
if(g==0)
{
System.out.println("No more gold seats available!");
break;
}
nf_seat++;
seat_cost=900;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
case 2:
{
s--;
if(s==0)
{
System.out.println("No more silver seats available!");
break;
}
nf_seat++;
seat_cost=199;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
default:
System.out.println("Invalid choice!");
}
}
System.out.println("Ticket Information : ");
System.out.println("\nConcert: "+concert_name+"\nDate: "
    +concert_date+"\nVenue: "+concert_venue+"\nTiming: "+concert_timing+"\nSeat Type: "+seat_type+"\nSeat Number "+seat_no);
}
}

class TS implements concert
{
Scanner sc=new Scanner(System.in);
int flag=0, p=5, g=10, s=15, nf_seat=0;
float seat_cost;
String concert_name="Taylor Swift: Lover World Tour";
String concert_date="30-12-2019";
String concert_venue="Madison Square Graden, NY";
String concert_timing="7:30 pm";
int seats[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};

public void concertInfo()
{
System.out.println("Name of concert : "+concert_name+"\nConcert Date : "+concert_date+"\nConcert Venue : "+concert_venue+"\nConcert Timigs : "+concert_timing);
System.out.println("Seating Plan : ");
for(int i=0; i<6; i++)
{
for(int j=0; j<5; j++)
{
if(i<2)
System.out.print(seats[i][j]+"  ");
else
System.out.print(seats[i][j]+" ");
}
System.out.println();
}

System.out.println("Press 0 for platinum, 1 for gold and 2 for silver : ");
int seat_type=sc.nextInt();
System.out.println("Select your seat (Maximum 2 seats can be booked per person and 0 means the seat is booked):");
int seat_no=sc.nextInt();
for(int i=0; i<6; i++)
{
for(int j=0; j<5; j++)
{
if(seat_no==seats[i][j])
{
seats[i][j]=0;
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println("Please choose a valid seat!");
}
else
{
switch(seat_type)
{
case 0:
{
p--;
if(p==0)
{
System.out.println("No more platinum seats available!");
break;
}
nf_seat++;
seat_cost=2450;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
case 1:
{
g--;
if(g==0)
{
System.out.println("No more gold seats available!");
break;
}
nf_seat++;
seat_cost=1200;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
case 2:
{
s--;
if(s==0)
{
System.out.println("No more silver seats available!");
break;
}
nf_seat++;
seat_cost=450;
System.out.println("Booking done! Price : "+seat_cost);
}
break;
default:
{
System.out.println("Invalid type!");
}
}
}
System.out.println("Ticket Information : ");
System.out.println("\nConcert: "+concert_name+"\nDate: "
    +concert_date+"\nVenue: "+concert_venue+"\nTiming: "+concert_timing+"\nSeat Type: "+seat_type+"\nSeat Number: "+seat_no);
}
}

class GD implements concert
{
public void concertInfo()
{
System.out.println("The date for this concert has already passed");
}
}

public class done
{
    //Function to Display Main Menu
public void menuDisplay()
{
    System.out.println("WELCOME TO AVLONLEE CONCERT TICKET BOOKER");
    System.out.println("1. List of upcoming concerts");
    System.out.println("2: Exit");
    System.out.println("Enter choice:");
    Scanner sc= new Scanner(System.in);
    int menu_choice=sc.nextInt();
    this.menuChoice(menu_choice);
}
    //Function to go back to Main Menu
public void goToMainMenu()
{
    System.out.println("Press '0' to go to Main Menu");
    Scanner sc= new Scanner(System.in);
    int menu_choice=sc.nextInt();
    if(menu_choice==0)
    {
        this.menuDisplay();
    }
}
    public void menuChoice(int menu_choice)
{
        switch(menu_choice)
    {
        case 2:
        System.exit(0);
        break;
        case 1:
        //displays list of concerts
        System.out.println("1. BTS: Love Yourself World Tour: Dubai");
        System.out.println("2. Taylor Swift: Lover World Tour");
        System.out.println("3. Green Day: American Idiot Middle Eastern Leg");
        Scanner sc= new Scanner(System.in);
        int concert_choice=sc.nextInt();

        switch(concert_choice)
        {
            case 1:
            BTS bts=new BTS();
            bts.concertInfo();//display BTS concert details
            this.goToMainMenu();
            break;
            case 2:
            TS ts=new TS();
            ts.concertInfo();//display TS concert details
            this.goToMainMenu();
            break;
            case 3:
            GD gd=new GD();
            gd.concertInfo();//display Green Day concert details
            this.goToMainMenu();
            break;
            default:
            System.out.println("Invalid Choice. Try again with a number between 1 and 3");
            concert_choice=sc.nextInt();
        }


        default:
        System.out.println("Invalid choice!");

    }
}


    public static void main(String args[])
 {
    done dd=new done();
    Scanner kb= new Scanner (System.in);
    System.out.println("Press 1 for Login and 2 for SignUp");
    int choice=kb.nextInt();
    ArrayList <LogIn> i =new ArrayList<LogIn>();
    LogIn u1=new LogIn("aa", "bb");
        i.add(u1);
    
    switch(choice)
    {
        case 1 :
        String a,b;
        System.out.println("LOGIN\nEnter your username");
        a=kb.nextLine();
        kb.nextLine();
        System.out.println("Enter password");
        b=kb.nextLine();
        LogIn l= new LogIn();
        LogIn l1= new LogIn(a,b);
        int x=l.login(l1,i);
        if(x==1)
         dd.menuDisplay();
        else
         System.exit(0);
        dd.goToMainMenu();
        break;
        case 2:
        String j,k;
        System.out.println("SIGN UP\nEnter your username");
        j=kb.nextLine();
        kb.nextLine();
        System.out.println("Enter password");
        k=kb.nextLine();
        Register r=new Register(j,k); 
        r.register(r,i);
        dd.goToMainMenu();
        break;
    }
    
 }
}
     
     
