import java.util.Scanner;
public class tesk2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Numbers of Subjects");
        int numofSybjects = scanner.nextInt();

        int totalmarks=0;
        for(int i=0;i<numofSybjects;i++)
        {
            System.out.println("Enter Makrs of :"+i+" Subject");
            int marks=scanner.nextInt();
             totalmarks += marks;
        }
        

        
        double pertageofmarks = (double) totalmarks/numofSybjects;
        System.out.println("---- Result ----");
        System.out.println("Total Marks:-"+totalmarks);
        System.out.println("Percentage:-"+pertageofmarks);

        if(pertageofmarks>90)
        {
            System.out.println("Garde is :- +A");
        }
        else if(pertageofmarks>80)
        {
            System.out.println("A");
        }
        else if(pertageofmarks>=70)
        {
            System.out.println("B");
        }
        else if(pertageofmarks>60)
        {
            System.out.println("C");
        }
        else if(pertageofmarks>50)
        {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

    }
}
