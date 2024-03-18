public class Kolo2 extends Koło implements Transformacja{
    int getPoczatkoweX;
    int getPoczatkoweY;

    public Kolo2(int x, int y, int promien){
        super(x, y, promien);
        getPoczatkoweX = x;
        getPoczatkoweY = y;

    }

    @Override
    public void przesunDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void powrot() {
        this.x = getPoczatkoweX;
        this.y = getPoczatkoweY;
    }
}
