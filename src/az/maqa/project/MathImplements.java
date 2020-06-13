package az.maqa.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MathImplements implements MathInterface {

	@Override
	public List<Integer> getNumList(int a, int b) {
		List<Integer> numList = new ArrayList<>();
		for (int i = a; i < b; i++) {
			numList.add(i);
		}
		return numList;
	}

	@Override
	public int sumNum(int a, int b) {
		int sum = 0;
		sum = a + b;

		return sum;
	}

	@Override
	public int subtractNum(int a, int b) {
		int subtract = 0;
		if (a > b) {
			subtract = a - b;
		} else {
			subtract = b - a;
		}
		return subtract;
	}

	@Override
	public long multipleNum(long a, long b) {
		return a * b;
	}

	@Override
	public double divideNum(double a, double b) {
		return a / b;
	}

	@Override
	public Map<String, String> azEnLang(String azWord, String engWord) throws IOException {
		Map<String, String> azEnLang = new HashMap<String, String>();
		azEnLang.put(azWord, engWord);
	
			FileWriter fileWriter = new FileWriter("language.txt" , true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.append(azWord + "--" + engWord);
			bw.newLine();
			bw.close();
		
		return azEnLang;
	}

}
