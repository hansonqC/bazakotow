import models.Kot;
import models.KotDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by lukasz on 2017-09-13.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    static  KotDao kotDao=new KotDao();
    public static void main(String[] args) {
            Kot kot=new Kot();
            KotDao kotDao= new KotDao();
        showMenu();

    }

    private static void showMenu(){
        System.out.println("---------------------------------------------------------------------");

        String choice="";
        do {
            System.out.println("Witaj w naszym programie");
            System.out.println("Dostepne opcje : ");
            System.out.println("1 - Dodaj kota\n2 - Wyswietl liste kotow\n3 - Wyjdz z programu");
            System.out.print("Twoj wybor : ");
            choice = getUserInput();
            switch(choice){
                case "1" :addCat();
                break;
                case "2": getCatsList();
                break;
                default:
                    System.out.println("Brak takiej opcji");
                    showMenu();
                    break;

            }
        }
        while(choice.equals("3"));
    }
    private static String getUserInput() {
        return scanner.nextLine().trim();
    }
    private static void addCat(){
        Kot kot = new Kot();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.print("Podaj imie kota : ");
        kot.setName(getUserInput());
        Pattern pattern;
        Matcher matcher;
        do {
            System.out.print("Podaj date urodzenia kota w formacie RRRR.MM.DD : ");

            pattern = Pattern.compile("20[0-1][0-7]\\.[0-1][0-9]\\.[0-3][0-9]");

            try {
                String response = getUserInput();
                matcher = pattern.matcher(response);
                if (matcher.matches()) {
                    kot.setDate(sdf.parse(response));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }


        } while (kot.getBirthDate() == null);
        do {
            System.out.print("Podaj wage kota : ");
            pattern = Pattern.compile("[0-9]\\.[0-9]{2}");
            String response2 = getUserInput();
            matcher = pattern.matcher(response2);
            if (matcher.matches()) {
                kot.setWeight(Float.parseFloat(response2));
            }
        } while (kot.getWeight() == null);
        System.out.print("Podaj imie opiekuna : ");
        kot.setOwnerName(getUserInput());
        System.out.println("Mam juz wszystkie dane kota :\n" + kot.toString());

        kotDao.dodajKota(kot);

            showMenu();
    }
    private static void getCatsList(){
        Kot kot;
        System.out.println("*************************************************************");
        System.out.println("********************** LISTA KOTOW **************************");
        System.out.println("*************************************************************");
        for(int i=0;i<kotDao.getKoty().size();i++){
           kot= kotDao.getKoty().get(i);
            System.out.println(i+1+" : "+kot.getName());
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        String nr;
        do{
            System.out.println("Ktorego kota chcesz poznac ?");
            System.out.print("Twoj wybor : ");
            nr=getUserInput();
        }
        while(!pattern.matcher(nr).matches());
            Integer id=Integer.parseInt(nr);
            Kot wybrany=kotDao.getKoty().get(id-1);
        System.out.println("Kotek : "+wybrany.getName()+", data urodzenia : "+wybrany.getBirthDate()+", waga : "+wybrany.getWeight()+", imie wlasciciela : "+wybrany.getOwnerName());
        showMenu();

        showMenu();
    }


}


