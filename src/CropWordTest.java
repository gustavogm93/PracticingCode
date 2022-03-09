import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CropWordTest {

    @Test
    void returnString() {
        String test1 = "we love code in codely"; //9
        String test2 = "The quick brown fox jumped over the fence"; //11
        String test3 = "The quick brown fox jumper            "; //26
        String test5 = "The quick "; ///10

        Assertions.assertEquals("we love", CropWord_Toptal.cropWord(test1, 9));
        Assertions.assertEquals("The quick", CropWord_Toptal.cropWord(test2, 13));
        Assertions.assertEquals("The quick brown fox jumper", CropWord_Toptal.cropWord(test3, 26));
        Assertions.assertEquals("The quick", CropWord_Toptal.cropWord(test5, 10));
    }
}