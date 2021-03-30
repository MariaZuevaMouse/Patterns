package patternts.behavioral.visitor.example1;

public class ShoppingCardDemo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "123456"),
                new Book(100, "78910"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5,5 ,"Apple")
        };
        int total = calculatePrice(items);
        System.out.println("Total cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCardVisitor visitor = new ShoppingCardVisitorImpl();
        int sum =0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }

        return sum;
    }

}

