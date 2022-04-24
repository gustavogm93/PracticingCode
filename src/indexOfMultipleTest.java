import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class indexOfMultipleTest {

    @Test
    void longestCommonPrefix() {
        indexOfMultiple test = new indexOfMultiple();
        long start = System.currentTimeMillis();
        String[] inp1 = {"flower", "flow", "flight"};
        String[] inp2 = {"reflower", "flow", "flight"};
        String[] inp3 = {"flowertur", "turkiflow", "turkoise", "koiseturo", "dasfsdfsdgsdfhgdfsmn,gnasm,kfbnsdatur", "elturkoCOOLORACULO143", "tur"};
        String[] inp4 = {"flower", "flow", "flight", "flower", "flow", "flight"};
        String[] inp5 = {"fdsfsdfsdfadfsfksdnjgkljhnsturlgjdfshbjghszdfikujghss",
                "4gfe65sd4tg6df4yt6854fd6y84df4gfe65sd4tg6df4yt6854fd6y84df4turgfe65sd4tg6df4yt6854fd6y84df4gfe65sd4tg6df4yt6854fd6y84df",
                "fsdljfbsdljfnsm,cnvm,zxcbvmbczxmvcxzmnvbxcznmvbcmnxzbvmncxtur",
                "mvcvmbncsdmxbvnsmdfbg#$#42343242tur342323325263463",
                "4gfe65sd4tg6df4yt6854fd6y84df4gfe65sturd4tg6df4yt6854fd6y84df4fdsfsdgsdgbvcbvcbcvbvcbvcbretert343gfe65sd4tg6df4yt6854fd6y84df4gfe65sd4tg6df4yt6854fd6y84df",
                "4gfe65sd4tg6df4yt6854fd6y84df4gfe65sgfrdhgrfhjgfhhhhhhhhhhhhhhhhhhhhhhhfsdgsdgbvcbvcbcvbvcbvcbrturetert343gfe65sd4tg6df4yt6854fd6y84df4gfe65sd4tg6df4yt6854fd6y84df",
                "tur",
        };

        String res1 = "fl";
        String res2 = "fl";
        String res3 = "tur";
        String res4 = "fl";
        String res5 = "tur";
        assertEquals(res1, indexOfMultiple.longestCommonPrefix(inp1));
        assertEquals(res2, indexOfMultiple.longestCommonPrefix(inp2));
        assertEquals(res3, indexOfMultiple.longestCommonPrefix(inp3));
        assertEquals(res4, indexOfMultiple.longestCommonPrefix(inp4));
        assertEquals(res5, indexOfMultiple.longestCommonPrefix(inp5));
        long end = System.currentTimeMillis();
        System.out.println("Time for indexOfMultiple.longestCommonPrefix(inp1): " + (end - start) + " ms");
        //test miliseconds


    }

}
