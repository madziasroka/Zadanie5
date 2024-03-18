public class Prostokat extends Figura implements Obliczenie{
    int szerokosc;
    int wysokosc;

    public Prostokat(int x,int y, int szerokosc, int wysokosc){
        super(x,y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    String nazwaFigury() {
        return "Prostokat";
    }

    @Override
    void pozycja(int x, int y) {
        if(x<=this.x + szerokosc && x>= this.x && y>=this.y- wysokosc && y<= this.y){
            System.out.println("Punkt (" + x +","+ y + ") znajduje się wewnatrz prostokata \n");
        }else {
            System.out.println("Punkt (" + x +","+ y + ") znajduje się na zewnatrz prostokata \n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Lewy górny: (" + this.x + ","  + this.y +")\n" +
                "Szerogość: " + this.szerokosc +",Wysokość: " + this.wysokosc + "\n" ;
    }

    @Override
    public double pole() {
        double poleProstokata = szerokosc*wysokosc;
        return poleProstokata;
    }

    @Override
    public double obwod() {
        double obwodProstokata = 2*(szerokosc+wysokosc);
        return obwodProstokata;
    }
}
