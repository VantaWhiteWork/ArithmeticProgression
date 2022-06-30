public class ArithmeticProgression {
    final private int d; //difference of an arithmetic progression

    public ArithmeticProgression(int d) {
        this.d = d;
    }

    public int[] get_progression(int n) {
        /*
        create arithmetic progression
        */
        int[] progression = new int[n];
        progression[0] = 0;

        //an+1 = an + d
        for(int i=1; i != n; i++) {
            int next_number = progression[i-1] + this.d;
            progression[i] = next_number;
        }

        return progression;
    }

    public int get_progression_by_id(int id) {
        // an = d * (n-1)
        return this.d * (id - 1);
    }
}
