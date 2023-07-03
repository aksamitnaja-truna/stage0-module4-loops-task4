package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0){
            System.out.println("last number in row is negative");
            return;
        }
        else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        int totalSkip = 0, total = 0;
        for (int i = 0; i < lastInRow; i++){
            total += i + 1;
            if ((i + 1)  > numberToSkip)
                continue;
            totalSkip += i + 1;

        }
        System.out.print(String.format("skipped sum is %d\ncounted sum is %d\n", totalSkip, total - totalSkip));

    }
}
