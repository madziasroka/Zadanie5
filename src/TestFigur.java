public class TestFigur {
    public static void main(String[] args) {

        Figura fig[] = new Figura[2];
        fig[0] = new Koło(10, 10, 5);                    // położenie koła = srodek = (10,10), promień = 5
        fig[1] = new Prostokat(20, 20, 15, 10);    // położenie prostokąta = lewy górny wierzchołek = (20,20), szerokość = 15, wysokość = 10

        // polimorficzne wywołanie metody toString() z klas Kolo/Prostokat,
        // a nie z klasy Figura
        for (Figura f : fig)              // pętla for-each
            System.out.println(f);    // System.out.println(f.toString());

        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);

        Koło kolo = new Koło(3,6,8);

        System.out.println(fig[0].obwod());
        System.out.println(fig[1].pole());

        System.out.println("--------------------------------------------");

        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');       // prostokąt rozmiaru 10 x 5 będzie "rysowany" na konsoli za pomocą znaku '*'
        ((Prostokat2)p2).rysuj();

        Kolo2 k2 = new Kolo2(15, 20, 5);

        k2.przesunDo(50, 40);    // przesunięcie środka koła do punktu (50, 40)
        System.out.println(k2);

        k2.powrot();                    // powrót do poprzedniej pozycji (bezpośrednio przed przesunięciem) środka koła
        System.out.println(k2);




    }
}