public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public SimpleDotCom() {
    }

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int[] var4 = this.locationCells;
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int cell = var4[var6];
            if (guess == cell) {
                result = "hit";
                ++this.numOfHits;
                break;
            }
        }

        if (this.numOfHits == this.locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
