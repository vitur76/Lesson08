package Task3;

public class Date {
    // Atributele clasei
    private int day;
    private int month;
    private int year;

    // Constructor pentru inițializarea atributelor cu validare
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // Getter pentru zi
    public int getDay() {
        return day;
    }

    // Setter pentru zi (cu validare: ziua trebuie să fie între 1 și 31)
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Ziua trebuie să fie între 1 și 31.");
            this.day = 1;  // setare implicită
        }
    }

    // Getter pentru lună
    public int getMonth() {
        return month;
    }

    // Setter pentru lună (cu validare: luna trebuie să fie între 1 și 12)
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Luna trebuie să fie între 1 și 12.");
            this.month = 1;  // setare implicită
        }
    }

    // Getter pentru an
    public int getYear() {
        return year;
    }

    // Setter pentru an (anul trebuie să fie un număr pozitiv)
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Anul trebuie să fie un număr pozitiv.");
            this.year = 2024;  // setare implicită
        }
    }

    // Metoda pentru afișarea datei în format zi/lună/an
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
