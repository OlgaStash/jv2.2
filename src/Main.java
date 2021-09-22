public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int replenishBalance = 1001;

        if (replenishBalance > 1_000) {
            int bonus = replenishBalance / 100;
            System.out.println(startBalance + bonus);
        } else
            System.out.println(startBalance + 0);
    }
}
