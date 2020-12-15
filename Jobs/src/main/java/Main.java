import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    //<span class="results-header__offer-count-text-number">68</span>

    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.pracuj.pl/praca/java;kw/katowice;wp?rd=30").get();
            Elements element = document.getElementsByClass("results-header__offer-count-text-number");
            System.out.println("Liczba ofert pracy w Java Katowice  " + element.get(0).text());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
