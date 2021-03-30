package patternts.behavioral.visitor.example1;

public interface ShoppingCardVisitor {
    int visit (Book book);
    int visit(Fruit fruit);
}
