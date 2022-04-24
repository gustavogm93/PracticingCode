package Celebarity;

public class ProductLineTestReport {
    long correctCnt;
    long checkedExcCnt;
    long uncheckedExcCnt;
    long otherExcCnt;

    public ProductLineTestReport(long correctCnt, long checkedExcCnt, long uncheckedExcCnt, long otherExcCnt) {
        this.correctCnt = correctCnt;
        this.checkedExcCnt = checkedExcCnt;
        this.uncheckedExcCnt = uncheckedExcCnt;
        this.otherExcCnt = otherExcCnt;
    }
}
