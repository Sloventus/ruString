import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.IOException;

public class StartTry {
    public static void main (String[] args) throws IOException {
        Document doc = Jsoup.connect("https://ru-brightdata.com/blog/how-tos-ru/web-scraping-with-jsoup?ysclid=lu44fklvcr339177103#how")
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://www.google.com")
                .get();
        RussianString.beautyPrint(doc.text());

    }
}
