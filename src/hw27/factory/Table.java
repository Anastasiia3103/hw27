package hw27.factory;

class Table implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a table");
    }
}
