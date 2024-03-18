public class Prostokat2 extends Prostokat implements Rysuj{
    public char znak;
    public Prostokat2(int x,int y, int szerokosc, int wysokosc, char znak){
        super(x, y, szerokosc, wysokosc);
        this.znak = znak;
    }


    @Override
    public void rysuj() {
        for(int i = 0; i < wysokosc; i++){
            for(int j = 0; j < szerokosc; j++){
                System.out.print(znak);
            }
            System.out.println();
        }

    }
}
