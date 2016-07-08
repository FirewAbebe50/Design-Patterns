package visitorPattern;

public class Client {

    public static void main(String[] args) {

        Root root = TreeBuilder.getRoot();

        DisplayNodeVisitor visitor = new DisplayNodeVisitor();

        root.accept(visitor);

        visitor.printVisitResults();

    }
}
