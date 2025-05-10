package AppleArray;

public class Main {
    public static void main(String[] args) {
        Apple[] apples = {
                new Apple(100, "Галла"),
                new Apple(70, "Гренни"),
                new Apple(52, "Голден")
        };

        AppleComparator comparator = new AppleComparator();
        ArrayUtils.sort(apples, comparator);

        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i].getPrice() + " " + apples[i].getKind());
        }

    }
    private static class AppleComparator implements CanCompare {
        @Override
        public int compare(Object var1, Object var2) {
            return ((Apple) var1).getPrice() - ((Apple) var2).getPrice();
        }
    }
}
