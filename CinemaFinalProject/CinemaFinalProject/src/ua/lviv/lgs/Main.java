package ua.lviv.lgs;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Cinema palace = new Cinema (new Time (8,30), new Time (23,30));
        Scanner sc = new Scanner (System.in);
        while (true)
        {
            ShowMenu();
            int key = sc.nextInt();
            switch (key)
            {
                case 1:
                    
                    Scanner addC = new Scanner(System.in);
                    System.out.println("������ ����� ������ :");
                    String titleCin = addC.nextLine();
                    System.out.println("������ ��������� � ������� ������ :");
                    int durationCinH = addC.nextInt();
                    System.out.println("������ ��������� � �������� ������ :");
                    int durationCinM = addC.nextInt();
                  
                    	Scanner check = new Scanner (System.in);
                        System.out.println("������ ������� ������ (�������� 3)");
                        int keyCheck = check.nextInt();
                        switch (keyCheck)
                        {
                            case 1:
                                Scanner addMultSeances = new Scanner (System.in);
                                System.out.println("������ ������ ������� ������ :");
                                int startH1 = addMultSeances.nextInt();
                                System.out.println("������  ������� ������� ������ :");
                                int startM1 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1));
                                break;
                            case 2:
                                addMultSeances = new Scanner (System.in);
                                System.out.println("������ ������ ������� ������ :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("������  ������� ������� ������ :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("������ ������ ������� ������ :");
                                int startH2 = addMultSeances.nextInt();
                                System.out.println("������  ������� ������� ������ :");
                                int startM2 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2));
                                break;
                            case 3:
                            	addMultSeances = new Scanner (System.in);
                            	 System.out.println("������ ������ ������� ������ :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("������  ������� ������� ������ :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("������ ������ ������� ������ :");
                                 startH2 = addMultSeances.nextInt();
                                 System.out.println("������  ������� ������� ������ :");
                                 startM2 = addMultSeances.nextInt();
                                 System.out.println("������ ������ ������� ������ :");
                                 int startH3 = addMultSeances.nextInt();
                                 System.out.println("������  ������� ������� ������ :");
                                int startM3 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2), new Time(startH3,startM3));
                                break;
                         
                            default:
                                System.out.println("������ 1, 2 ��� 3!");
                               break;
                        }
                    break;
                 
                case 2:
                    Scanner addSeance = new Scanner (System.in);
                    System.out.println("������ ����, � ���� ������ ����� : ");
                    String day = addSeance.nextLine();
                    System.out.println("������ ����� ������ :");
                    titleCin = addSeance.nextLine();
                    System.out.println("������ ��������� ����� ������ :");
                    durationCinH = addSeance.nextInt();
                    System.out.println("������ ��������� ������ ������ :");
                    durationCinM = addSeance.nextInt();
                    System.out.println("������  ������ �������  ������ :");
                    int seanceH = addSeance.nextInt();
                    System.out.println("������ ������� ������� ������ :");
                    int seanceM = addSeance.nextInt();
                    palace.addSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
   
                case 3:
                    Scanner remove = new Scanner (System.in);
                    System.out.println("������ ����� ������  ��� ���� ��������� � ��������:");
                    titleCin = remove.nextLine();
                    palace.removeMovie(titleCin);
                    break;
                    
                case 4:
                    System.out.println("������ ���� ������ ��� ���� �������� � ��������:");
                    Scanner removeS = new Scanner(System.in);
                    day = removeS.nextLine();
                    System.out.println("������  ����� ������ ������ ��� ���� �������� � ��������:");
                    titleCin = removeS.nextLine();
                    System.out.println("������ ��������� ������ � ������� ���  �������� ������ � ��������:");
                    durationCinH = removeS.nextInt();
                    System.out.println("������ ��������� ������ � �������� ���  �������� ������ � ��������:");
                    durationCinM = removeS.nextInt();
                    System.out.println("������ ������� ������ � ������� ���  �������� ������ � ��������:");
                    seanceH = removeS.nextInt(); 
                    System.out.println("������ ������� ������ � �������� ���  �������� ������ � ��������:");
                    seanceM = removeS.nextInt();
                    palace.removeSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
             
                    
                case 5:
                    palace.addMovie(new Movie("Transformers 2", new Time (2,34)), new Time(10, 20), new Time (20,10));
                    palace.addMovie(new Movie("Heaven's kingdom", new Time (2,12)), new Time(9, 10));
                    palace.addMovie(new Movie("Lion King", new Time (1,36)), new Time(14, 50), new Time (16,0), new Time (8,30));
                    palace.addMovie(new Movie("Hobbit 2", new Time (2,48)), new Time(12, 45), new Time (22,15));
                    System.out.println("������� ������ ������!");
                    break;
                    
                case 6:
                    System.out.println(palace);
                    break;

                case 0:
                   System.exit(0);;
                           
                        }
                    }
       
    }
        
    public static void ShowMenu ()
    {
        System.out.println();
        System.out.println("1.������ ����� ����� � �������� �� ��������");
        System.out.println("2.������ ����� �� ��������");
        System.out.println("3.�������� ����� � ������");
        System.out.println("4.�������� �����");
        System.out.println("5.��������� ������� ���������� �������� � ������ ����!");
        System.out.println("6.������� ������� �� �����");
        System.out.println("0.Exit");
    
        
    }

}
