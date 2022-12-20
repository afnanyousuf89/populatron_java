import java.util.List;
import java.util.stream.Collectors;

public class CalculateSum {

	private int sumOfPop;

	public CalculateSum(List<String> data) {

		sumOfPop = data.stream().mapToInt(a -> (a.isEmpty() ? 0 : Integer.parseInt(a))).sum();

	}

	public int getTotalPop() {
		return sumOfPop;
	}

}
