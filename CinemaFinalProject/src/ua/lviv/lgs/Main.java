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
                    System.out.println("Введіть назву фільму :");
                    String titleCin = addC.nextLine();
                    System.out.println("Введіть тривалість фільму у годинах :");
                    int durationCinH = addC.nextInt();
                    System.out.println("Введіть тривалість фільму у хвилинах :");
                    int durationCinM = addC.nextInt();
                  
                    	Scanner check = new Scanner (System.in);
                        System.out.println("Введіть кількість сеансів(максимум 3)");
                        int keyCheck = check.nextInt();
                        switch (keyCheck)
                        {
                            case 1:
                                Scanner addMultSeances = new Scanner (System.in);
                                System.out.println("Введіть годину початку фільму :");
                                int startH1 = addMultSeances.nextInt();
                                System.out.println("Введіть хвилини початку фільму :");
                                int startM1 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1));
                                break;
                            case 2:
                                addMultSeances = new Scanner (System.in);
                                System.out.println("Введіть годину початку фільму :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("Введіть хвилини початку фільму :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("Введіть годину початку фільму :");
                                int startH2 = addMultSeances.nextInt();
                                System.out.println("Введіть хвилини початку фільму :");
                                int startM2 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2));
                                break;
                            case 3:
                            	addMultSeances = new Scanner (System.in);
                            	 System.out.println("Введіть годину початку фільму :");
                                startH1 = addMultSeances.nextInt();
                                System.out.println("Введіть хвилини початку фільму :");
                                startM1 = addMultSeances.nextInt();
                                System.out.println("Введіть годину початку фільму :");
                                 startH2 = addMultSeances.nextInt();
                                 System.out.println("Введіть хвилини початку фільму :");
                                 startM2 = addMultSeances.nextInt();
                                 System.out.println("Введіть годину початку фільму :");
                                 int startH3 = addMultSeances.nextInt();
                                 System.out.println("Введіть хвилини початку фільму :");
                                int startM3 = addMultSeances.nextInt();
                                palace.addMovie(new Movie (titleCin, new Time(durationCinH,durationCinM)), new Time(startH1, startM1), new Time(startH2,startM2), new Time(startH3,startM3));
                                break;
                         
                            default:
                                System.out.println("Введіть 1, 2 або 3!");
                               break;
                        }
                    break;
                 
                case 2:
                    Scanner addSeance = new Scanner (System.in);
                    System.out.println("Введіть день, в який додаємо сеанс : ");
                    String day = addSeance.nextLine();
                    System.out.println("Введіть назву фільму  :");
                    titleCin = addSeance.nextLine();
                    System.out.println("Введіть тривалість годин фільму :");
                    durationCinH = addSeance.nextInt();
                    System.out.println("Введіть кількість хвилин фільму :");
                    durationCinM = addSeance.nextInt();
                    System.out.println("Введіть  годину початку  фільму:");
                    int seanceH = addSeance.nextInt();
                    System.out.println("Введіть хвилини початку фільму :");
                    int seanceM = addSeance.nextInt();
                    palace.addSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
   
                case 3:
                    Scanner remove = new Scanner (System.in);
                    System.out.println("Введіть назву фільму  для його видалення з розкладу:");
                    titleCin = remove.nextLine();
                    palace.removeMovie(titleCin);
                    break;
                    
                case 4:
                    System.out.println("Введіть день сеансу для його видаленя з розкладу:");
                    Scanner removeS = new Scanner(System.in);
                    day = removeS.nextLine();
                    System.out.println("Введіть  назву фільма сеансу для його видаленя з розкладу:");
                    titleCin = removeS.nextLine();
                    System.out.println("Введіть тривалість фільму у годинах для  видаленя сеансу з розкладу:");
                    durationCinH = removeS.nextInt();
                    System.out.println("Введіть тривалість фільму у хвилинах для  видаленя сеансу з розкладу:");
                    durationCinM = removeS.nextInt();
                    System.out.println("Введіть початок фільму у годинах для  видаленя сеансу з розкладу:");
                    seanceH = removeS.nextInt(); 
                    System.out.println("Введіть початок фільму у хвилинах для  видаленя сеансу з розкладу:");
                    seanceM = removeS.nextInt();
                    palace.removeSeance(day, new Seance(new Movie(titleCin, new Time(durationCinH, durationCinM)), new Time(seanceH, seanceM)));
                    break;
             
                    
                case 5:
                    palace.addMovie(new Movie("Lord of the Rings", new Time (2,34)), new Time(10, 20), new Time (20,10));
                    palace.addMovie(new Movie("Chappie", new Time (2,12)), new Time(9, 10));
                    palace.addMovie(new Movie("Lion King", new Time (1,36)), new Time(14, 50), new Time (16,0), new Time (8,30));
                    palace.addMovie(new Movie("Hobbit 2", new Time (2,48)), new Time(12, 45), new Time (22,15));
                    System.out.println("Улюблені фільми додано!");
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
        System.out.println("1.Додати фільм разом зі сеансами до розкладу");
        System.out.println("2.Додати сеанс до розкладу");
        System.out.println("3.Видалити фільм зі списку");
        System.out.println("4.Видалити сеанс");
        System.out.println("5.Заповнити розклад улюбленими фільмами");
        System.out.println("6.Вивести розклад на екран");
        System.out.println("0.Exit");
    
        
    }

}
