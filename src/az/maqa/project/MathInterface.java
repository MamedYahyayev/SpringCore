package az.maqa.project;


import java.util.List;
import java.util.Map;

public interface MathInterface {

	List<Integer> getNumList(int a, int b);

	int sumNum(int a, int b);

	int subtractNum(int a, int b);

	long multipleNum(long a, long b);

	double divideNum(double a, double b);

	Map<String, String> azEnLang(String azWord, String engWord) throws Exception;


	
	
}
