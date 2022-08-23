package codegym;

public class Triangle {
    private int aSide;
    private int bSide;
    private int cSide;

    public Triangle(int aEdge, int bEdge, int cEdge) {
        this.aSide = aEdge;
        this.bSide = bEdge;
        this.cSide = cEdge;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aEdge) {
        this.aSide = aEdge;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }
}
