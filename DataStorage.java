import java.util.ArrayList;
public class DataStorage extends ApplicationWindow {
	/**
	 * Calculates the income given its frequency
	 * @requires input = int or double > 0
	 * @requires factor is String "monthly", "weekly", "biannually", or "daily"
	 * @param input: the income value to input
	 * @param factor: the frequency of the income
	 */
	public static void addIncome(double input, String factor){
		if(factor.toLowerCase().equals("monthly"))
		transactions.add(input*12);
		else if(factor.toLowerCase().equals("weekly")){
		transactions.add(input*72);	
		}else if (factor.toLowerCase().equals("biannually")){
			transactions.add(input*2);
		}else if (factor.toLowerCase().equals("daily")){
			transactions.add(input*365);
		}else{
			transactions.add(input);
		}
	}
	/**
	 * @requires input = int or double > 0
	 * @requires factor is String "monthly", "weekly", "biannually", or "daily"
	 * @param input: the expense value to input
	 * @param factor: the frequency of the expense
	 */
	public static void addExpense(double input, String factor){
		input = input *-1;
		if(factor.toLowerCase().equals("monthly"))
		transactions.add(input*12);
		else if(factor.toLowerCase().equals("weekly")){
		transactions.add(input*72);	
		}else if (factor.toLowerCase().equals("biannually")){
			transactions.add(input*2);
		}else if (factor.toLowerCase().equals("daily")){
			transactions.add(input*365);
		}else{
			transactions.add(input);
		}
	}
	private static double sum(ArrayList<Double> collection){
		double sum = 0.0;
		for(double x : collection){
			sum+=x;
		}
		return sum;
	}
	public static String giveResult(int timefactor){
		double total = timefactor*(sum(transactions));
		return "After "+timefactor+" years you will have "+ total+" dollars";
	}
}
