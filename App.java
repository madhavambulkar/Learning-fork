import yahoofinance.YahooFinance;
import yahoofinance.Stock;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    ```
    // Queue to store stock price and timestamp
    private static Queue<String> stockQueue = new LinkedList<>();

public static void main(String[] args) {

    System.out.println("Starting stock monitoring...");

    while (true) {
        try {
            // Dow Jones Industrial Average symbol
            Stock stock = YahooFinance.get("^DJI");

            if (stock != null && stock.getQuote() != null) {
                BigDecimal price = stock.getQuote().getPrice();

                // Current timestamp
                LocalDateTime time = LocalDateTime.now();

                // Create record
                String record = "Time: " + time + " | Price: " + price;

                // Add to queue
                stockQueue.add(record);

                // Print output
                System.out.println(record);
            } else {
                System.out.println("Failed to fetch stock data");
            }

            // Wait for 5 seconds
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}```

}
