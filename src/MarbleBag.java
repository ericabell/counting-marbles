public class MarbleBag {
    Integer numRed;
    Integer numGreen;
    Integer numBlue;

    public MarbleBag(Integer numRed, Integer numGreen, Integer numBlue) {
        this.numRed = numRed;
        this.numGreen = numGreen;
        this.numBlue = numBlue;
    }

    public String printInfo() {
        return "MarbleBag{" +
                "numRead=" + numRed +
                ", numGreen=" + numGreen +
                ", numBlue=" + numBlue +
                '}';
    }

    public Integer getTotalNumberOfMarbles() {
        return numRed + numGreen + numBlue;
    }

    public void removeAllGreenMarbles() {
        numGreen = 0;
    }
}
