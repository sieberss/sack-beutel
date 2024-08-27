public class Main {

    public static void main(String[] args) {

        Sack sack = new Sack();

        sack.add(4);
        sack.add(5);
        sack.add(2);
        sack.add(10);
        System.out.println(sack);
        System.out.println(sack.get(2));

        sack.addToIndex(1, 27);
        System.out.println(sack);

        sack.removeLastElement();
        sack.removeByIndex(0);
        System.out.println(sack);

    }

}
