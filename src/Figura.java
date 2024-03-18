public abstract class Figura implements Obliczenie {
    public int x;
    public int y;

    public Figura(int x, int y){
        this.x = x;
        this.y = y;
    }

    abstract String nazwaFigury();
    abstract void pozycja(int x, int y);

    @Override
    public String toString() {
        return nazwaFigury() +"\n";
    }
}
