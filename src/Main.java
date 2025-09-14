public class Main {
    public static void main(String[] args) {
        Phone.Director director = new Phone.Director();
        Phone phone = director.constructBudgetPhone(new Phone.Builder());
        Phone phone2 = director.constructGamingPhone(new Phone.Builder());
        Phone phone3 = director.constructFoldablePhone(new Phone.Builder());
        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}