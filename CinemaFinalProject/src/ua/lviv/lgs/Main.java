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
                    System.out.println("¬вед≥ть назву ф≥льму :");
                    String titleCin = addC.nextLine();
                    System.out.println("¬вед≥ть тривал≥сть у годинах ф≥льму :");
                    int durationCinH = addC.nextInt();
                    System.out.println("¬вед≥ть тривал≥сть у хвилинах ф≥льму :");
                    int durationCinM = addC.nextInt();
                  
                    	Scanner check = new Scanner (System.in);
                        System.out.println("¬вед≥ть к≥льк≥сть сеанс≥в (максимум 3)");
                        int keyCheck = check.nextInt();
                        switch (keyCheck)
                        {
                            case 1:
                                Scanner addMultSeances = new Scanner (System.in);
                                System.out.println("¬вед≥ть годину початку ф≥льму :");
                                int startH1 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                int startM1 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1));
                                break;
                            case 2:
                                addMultSeances = new Scanner (System.in);
                                System.out.println("¬вед≥ть годину початку ф≥льму :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть годину початку ф≥льму :");
                                int startH2 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                int startM2 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2));
                                break;
                            case 3:
                            	addMultSeances = new Scanner (System.in);
                            	 System.out.println("¬вед≥ть годину початку ф≥льму :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("¬вед≥ть годину початку ф≥льму :");
                                 startH2 = addMultSeances.nextInt();
                                 System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                 startM2 = addMultSeances.nextInt();
                                 System.out.println("¬вед≥ть годину початку ф≥льму :");
                                 int startH3 = addMultSeances.nextInt();
                                 System.out.println("¬вед≥ть  хвилини початку ф≥льму :");
                                int startM3 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2), new Time(startH3,startM3));
                                break;
                         
                            default:
                                System.out.println("¬вед≥ть 1, 2 або 3!");
                               break;
                        }
                    break;
                 
                case 2:
                    Scanner addSeance = new Scanner (System.in);
                    System.out.println("¬вед≥ть день, в €кий додаЇмо сеанс : ");
                    String day = addSeance.nextLine();
                    System.out.println("¬вед≥ть назву ф≥льму :");
                    titleCin = addSeance.nextLine();
                    System.out.println("¬вед≥ть тривал≥сть годин ф≥льму :");
                    durationCinH = addSeance.nextInt();
                    System.out.println("¬вед≥ть тривал≥сть хвилин ф≥льму :");
                    durationCinM = addSeance.nextInt();
                    System.out.println("¬вед≥ть  годину початку  ф≥льму :");
                    int seanceH = addSeance.nextInt();
                    System.out.println("¬вед≥ть хвилини початку ф≥льму :");
                    int seanceM = addSeance.nextInt();
                    palace.addSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
   
                case 3:
                    Scanner remove = new Scanner (System.in);
                    System.out.println("¬вед≥ть назву ф≥льму  дл€ його видаленн€ з розкладу:");
                    titleCin = remove.nextLine();
                    palace.removeMovie(titleCin);
                    break;
                    
                case 4:
                    System.out.println("¬вед≥ть день сеансу дл€ його видален€ з розкладу:");
                    Scanner removeS = new Scanner(System.in);
                    day = removeS.nextLine();
                    System.out.println("¬вед≥ть  назву ф≥льма сеансу дл€ його видален€ з розкладу:");
                    titleCin = removeS.nextLine();
                    System.out.println("¬вед≥ть тривал≥сть ф≥льму у годинах дл€  видален€ сеансу з розкладу:");
                    durationCinH = removeS.nextInt();
                    System.out.println("¬вед≥ть тривал≥сть ф≥льму у хвилинах дл€  видален€ сеансу з розкладу:");
                    durationCinM = removeS.nextInt();
                    System.out.println("¬вед≥ть початок ф≥льму у годинах дл€  видален€ сеансу з розкладу:");
                    seanceH = removeS.nextInt(); 
                    System.out.println("¬вед≥ть початок ф≥льму у хвилинах дл€  видален€ сеансу з розкладу:");
                    seanceM = removeS.nextInt();
                    palace.removeSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
             
                    
                case 5:
                    palace.addMovie(new Movie("Lord of the Rings", new Time (2,34)), new Time(10, 20), new Time (20,10));
                    palace.addMovie(new Movie("Chappie", new Time (2,12)), new Time(9, 10));
                    palace.addMovie(new Movie("Lion King", new Time (1,36)), new Time(14, 50), new Time (16,0), new Time (8,30));
                    palace.addMovie(new Movie("Hobbit 2", new Time (2,48)), new Time(12, 45), new Time (22,15));
                    System.out.println("”люблен≥ ф≥льми додано!");
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
        System.out.println("1.ƒодати ф≥льм разом з≥ сеансами до розкладу");
        System.out.println("2.ƒодати сеанс до розкладу");
        System.out.println("3.¬идалити ф≥льм з≥ списку");
        System.out.println("4.¬идалити сеанс");
        System.out.println("5.«аповнити розклад улюбленими ф≥льмами ≥ ловити кайф!");
        System.out.println("6.¬ивести розклад на екран");
        System.out.println("0.Exit");
    
        
    }

}
