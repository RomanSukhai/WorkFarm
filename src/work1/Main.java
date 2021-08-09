package work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Alisa",34,5900,"оп корова за свої гроші");
        Cow cow1 = new Cow("Fartag",54,5500,"Топ корова за свої гроші");
        Cow cow2 = new Cow("Lerba",83,5903,"Також топ корова за свої гроші");

        Dog dog= new Dog("Alisa",34,5900,"оп корова за свої гроші");
        Dog dog1 = new Dog("Fartag",54,5500,"Топ корова за свої гроші");
        Dog dog2 = new Dog("Lerba",83,5903,"Також топ корова за свої гроші");

        Hourse hou = new Hourse("Alisa",34,5900,"оп корова за свої гроші");
        Hourse hou1 = new Hourse("Fartag",54,5500,"Топ корова за свої гроші");
        Hourse hou2 = new Hourse("Lerba",83,5903,"Також топ корова за свої гроші");

        Pet[] c = new Pet[3];
        c[0]= cow;
        c[1]= cow1;
        c[2]= cow2;

        Pet[] d = new Pet[3];
        d[0]= dog;
        d[1]=dog1;
        d[2]=dog2;

        Pet[] h = new Pet[3];
        h[0]=hou;
        h[1]=hou1;
        h[2]=hou2;


         boolean q = false;
        Scanner scanner = new Scanner(System.in);
        while (q=true){
            System.out.println(" ");
        System.out.println("Початок програми:");
        System.out.println("   start-запустити програму");
        String user= scanner.nextLine();
             if (user.equals("start")){
                 System.out.println("Яку дію ви хочете зробити: ");
                 System.out.println("    print all-вивсти все");
                 System.out.println("    delete-видилення ");
                 System.out.println("    add-обавлення");
                 String user2= scanner.nextLine();
                 if (user2.equals("delete")){
                     System.out.println("Яку тваринку");
                     System.out.println("  cow-корова");
                     System.out.println("  dog-собака");
                     System.out.println("  hourse-коня");
                     String user3 = scanner.nextLine();
                     if (user3.equals("cow")){
                         System.out.println("Яку корову видалити:");
                         System.out.println("  1;2;3");
                         String user4 = scanner.nextLine();
                         if (user4.equals("1")){
                             c[0]=null;
                         }
                         else if(user4.equals("2")){
                             c[1]=null;
                         }
                         else if(user4.equals("3")){
                             c[2]=null;
                         }
                         else {
                             System.out.println("error");
                         }
                     }
                     if (user3.equals("dog")){
                         System.out.println("Якого собаку видалити:");
                         System.out.println("  1;2;3");
                         String user4 = scanner.nextLine();
                         if (user4.equals("1")){
                             d[0]=null;
                         }
                         else if(user4.equals("2")){
                             d[1]=null;
                         }
                         else if(user4.equals("3")){
                             d[2]=null;
                         }
                         else {
                             System.out.println("error");
                         }
                     }
                     if (user3.equals("hourse")){
                         System.out.println("Якого коня видалити:");
                         System.out.println("  1;2;3");
                         String user4 = scanner.nextLine();
                         if (user4.equals("1")){
                             h[0]=null;
                         }
                         else if(user4.equals("2")){
                             h[1]=null;
                         }
                         else if(user4.equals("3")){
                             h[2]=null;
                         }
                         else {
                             System.out.println("error");
                         }
                     }
                     else {
                         System.out.println("error3");
                     }
                 }
                 if (user2.equals("add")){
                     System.out.println("Кого добавити");
                     System.out.println("  cow-корову");
                     System.out.println("  dog-собака");
                     System.out.println("  hourse-кінь");
                     String user5 = scanner.nextLine();
                     if (user5.equals("cow")){
                         System.out.print("Name: ");  String name = scanner.nextLine();
                         System.out.print("Age: "); int age =scanner.nextInt();
                         System.out.print("Height: "); int height =scanner.nextInt();
                         Cow cow3 = new Cow(name,age,height,"Топ за свої гроші");
                         c[3]=cow3;
                     }
                     else {
                         System.out.println("error");
                     }
                 }
                 if (user2.equals("print all")){
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(c[i]);
                     }
                     System.out.println(" ");
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(d[i]);
                     }
                     System.out.println(" ");
                     for (int i =0 ; i<c.length;i++){
                         System.out.println(h[i]);
                     }
                 }

             }
             else {
                 System.out.println("error1");
             }
         }
    }
}
