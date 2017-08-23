package numerix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TradingAlgorithmImpl implements TradingAlgorithm {
	static Map<String, List<Double>> prices = new ConcurrentHashMap<>();
	static Map<String, TradeHistory> tradesHappened = new ConcurrentHashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String line = br.readLine();
		String[] productNames = line.split(","); // Assume company names will be seperated by commas. accept an array of product names

		for (String productName : productNames) {
			prices.put(productName, new ArrayList<Double>(1)); // all product
																// names with
																// collection of
																// prices
			tradesHappened.put(productName, new TradeHistory());
		}

		TradingAlgorithm tradingAlgorithm = new TradingAlgorithmImpl();

		while (true) {
			line = br.readLine();
			String[] priceInput = line.split(",");
			Price price = new Price();
			price.setProductName(priceInput[0]);
			price.setNumericalPrice(Double.parseDouble(priceInput[1]));

			List<Double> priceList = prices.get(price.getProductName());
			priceList.add(price.getNumericalPrice());

			if (priceList.size() % 4 != 0) {
				continue;
			}
			Trade trade = tradingAlgorithm.buildTrades(price);
			if (trade != null) {
				System.out.println(trade);
			}
		}
	}

	@Override
	public Trade buildTrades(Price price) {
		double sum = 0;
		List<Double> priceList = prices.get(price.getProductName());
		Trade trade = new Trade();
		TradeHistory tradeHistory = tradesHappened.get(price.getProductName());
		int start = tradeHistory.getTradePositionCompare() * 4;
		int end = start + 4;
		sum = 0;
		for (int i = start; i < end; i++) {
			sum += priceList.get(i);
		}

		if (sum / 4 > tradeHistory.getOldAverage()) {
			tradeHistory.setOldAverage(sum / 4);
			tradeHistory.setTradePositionCompare(tradeHistory
					.getTradePositionCompare() + 1);
			trade.setNumericalPrice(price.getNumericalPrice());
			trade.setProductName(price.getProductName());
			return trade;
		}
		tradeHistory.setTradePositionCompare(tradeHistory
				.getTradePositionCompare() + 1);
		tradeHistory.setOldAverage(sum / 4);
		return null;
	}

}
