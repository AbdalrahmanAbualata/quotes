package quotes;

import com.google.gson.Gson;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;;
import static org.junit.Assert.*;

public class AppTest {
    public static final String FILE = "C:\\Users\\STUDENT\\401pro\\quotes\\app\\src\\main\\resources\\kkkk.json";
    @Test
    public void testQuotes() {
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader("../app/src/main/resources/data.json");
            Quotes[] recentQuotes = gson.fromJson(reader, Quotes[].class);
            String expected = "Today's Quote:{ Quote:  “Ask no questions, and you will be told no lies? author: Charles Dickens";
            System.out.println(recentQuotes[1].toString());
            Quotes output = recentQuotes[1];
            assertEquals(expected, output);
        } catch (IOException ex) {
            System.out.println("file not found ... " + ex.getMessage());
            assertTrue(false);
        }
    }

    @Test
    public void testGetQuoteFromAPI() {
        String quotesURL = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";

            App.sendGetRequest(quotesURL);
            String quote =  App.sendGetRequest(quotesURL);
            assertNotEquals(quote, null);

    }
    @Test
    public void testGetQuoteFromFileIfThereIsErrorInApi() {
        String quotesURL = "//api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en"; //there is error in the link
        // here thr req well fail so the quote will come from the local File

        App.sendGetRequest(quotesURL);
        String quote =  App.sendGetRequest(quotesURL);
        StringBuilder result = new StringBuilder();
            result.append(quote);
        System.out.println(result.toString());
        Gson gson = new Gson();
        try {
            Reader reader =new BufferedReader(new FileReader(FILE));
            Quotes[] recentQuotes = gson.fromJson(reader, Quotes[].class);
            boolean testRrsult=false;
            for (int i=0;i <recentQuotes.length;i++){
                if (recentQuotes[i].toString() == result.toString()){
                    System.out.println(recentQuotes[i]);
                    testRrsult=true;
                    assertTrue(testRrsult);
                }
            }
        } catch (IOException ex) {
            System.out.println("file not found ... " + ex.getMessage());
        }

    }
}
