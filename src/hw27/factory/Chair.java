package hw27.factory;

class Chair implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a chair");
    }
}
