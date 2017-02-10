package pl.javastart;

/**
 * Created by Rysiek on 2017-02-07.
 */
public class TimeFromStart {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();

        do {
            long currentTime = System.currentTimeMillis();
            long timeFromStart = currentTime - startTime;

            System.out.println(timeFormat(timeFromStart));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);

    }

    public static String timeFormat(long time) {
        long sekundy = time/1000;
        long minuty = time/60000;
        long godziny = time/3600000;
        long dni = time/86400000;
        long lata = dni/365;

        if (minuty>0){
            sekundy = sekundy%60;
        }
        if (godziny>0) {
            minuty = minuty%60;
        }
        if (dni>0) {
            godziny = godziny%24;
        }
        if (lata>0) {
            dni = dni%365;
        }
        if (minuty==0 && godziny==0 && dni==0 && lata==0) {
            return sekundy +" "+ secName(sekundy);
        }
        if (godziny==0 && dni==0 && lata==0) {
            return minuty+" "+minName(minuty)+" "+ sekundy +" "+ secName(sekundy);
        }
        if (dni==0 && lata==0) {
            return godziny+" "+hourName(godziny)+" "+ minuty+minName(minuty)+" "+ sekundy +" "+ secName(sekundy);
        }
        if (lata==0) {
            return dni+" "+dayName(dni)+" "+godziny+" "+hourName(godziny)+" "+ minuty+" "+minName(minuty)+" "+ sekundy +" "+ secName(sekundy);
        } else
            return lata+" "+yearName(lata)+" "+ dni+" "+dayName(dni)+" "+godziny+" "+hourName(godziny)+" "+ minuty+" "+minName(minuty)+" "+ sekundy +" "+ secName(sekundy);
    }

    public static String secName (long unit) {
        String s;
        if (unit == 1) {
            s = "sekunda";
        } else if (unit == 2 || unit == 3 || unit == 4) {
            s = "sekundy";
        } else {
            s = "sekund";
        } return s;
    }

    public static String minName (long unit) {
        String s;
        if (unit == 1) {
            s = "minuta";
        } else if (unit == 2 || unit == 3 || unit == 4) {
            s = "minuty";
        } else {
            s = "minut";
        } return s;
    }

    public static String hourName (long unit) {
        String s;
        if (unit == 1) {
            s = "godzina";
        } else if (unit == 2 || unit == 3 || unit == 4) {
            s = "godziny";
        } else {
            s = "godzin";
        } return s;
    }

    public static String dayName (long unit) {
        String s;
        if (unit == 1) {
            s = "dzień";
        } else {
            s = "dni";
        } return s;
    }


    public static String yearName (long unit) {
        String s;
        if (unit == 1) {
            s = "rok";
        } else if (unit == 2 || unit == 3 || unit == 4) {
            s = "lata";
        } else {
            s = "lat";
        } return s;
    }
}
