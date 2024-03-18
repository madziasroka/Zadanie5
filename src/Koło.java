public class Koło extends Figura implements Obliczenie{

    int promien;
    public Koło(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    @Override
    void pozycja(int x, int y) {
      double czyWSrodku = Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
       if(czyWSrodku <= promien){
           System.out.println("Punkt (" + x +","+ y + ") znajduje się wewnatrz koła \n");
       }else {
           System.out.println("Punkt (" + x +","+ y + ") znajduje się na zewnatrz koła" );
       }
    }

    @Override
    String nazwaFigury() {
        return "Kolo";
    }

    public int getPromien() {
        return promien;
    }

    @Override
    public String toString() {
        return super.toString() + "Środek (" + x + "," + y+ ")\n" + "Promień - " + getPromien() + "\n";
    }

    @Override
    public double pole() {
       double poleKola = 3.14*Math.pow(promien,2);
        return poleKola;
    }

    @Override
    public double obwod() {
       double obwodKola = 2*3.14*promien;
        return obwodKola;
    }
}
