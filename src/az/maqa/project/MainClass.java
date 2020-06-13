
package az.maqa.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		MathImplements mathImplements = (MathImplements) applicationContext.getBean("math");
		Dao dao = applicationContext.getBean("dao", Dao.class);
		FileReaderMethod fileReader = applicationContext.getBean("fileReader", FileReaderMethod.class);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String name = sc.next();
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
		System.out.println("1.NumList , 2.Sum , 3.Subtract,4.Multiple , 5.Divide , 6.Language , 7.Dictionary");
		switch (sc.nextInt()) {
		case 1:
			System.out.print("a=");
			int a = sc.nextInt();
			System.out.print("b=");
			int b = sc.nextInt();
			System.out.println("NumList:" + mathImplements.getNumList(a, b));
			break;
		case 2:
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			System.out.println("Sum:" + mathImplements.sumNum(a, b));
			break;
		case 3:
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			System.out.println("Subtract:" + mathImplements.subtractNum(a, b));
			break;
		case 4:
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			System.out.println("Multiple:" + mathImplements.multipleNum(a, b));
			break;
		case 5:
			System.out.print("a=");
			a = sc.nextInt();
			System.out.print("b=");
			b = sc.nextInt();
			// System.out.println("Divide:" + mathImplements.divideNum(a, b));
			String format = nf.format(mathImplements.divideNum(a, b));
			System.out.println("Divide:" + format);
			break;
		case 6:
			try {
				String azWord = null, engWord = null;
				System.out.print("Enter the az word:");
				azWord = sc.next();
				System.out.print("Enter the eng word:");
				engWord = sc.next();
				mathImplements.azEnLang(azWord, engWord);
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("Words are added...");
			// System.out.println(mathImplements.azEnLang(azWord, engWord));
			break;
		case 7:
			System.out.println("Choose Your Language: az , eng");
			File file = new File("language.txt");
			fileReader.setFile(file);
			try {
				String lang = sc.next();
				if (lang.equalsIgnoreCase("az")) {
					fileReader.fileReader(lang);

				} else if (lang.equalsIgnoreCase("eng")) {
					fileReader.fileReader(lang);
				} else {
					System.err.println("Choose theese language: az , eng");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 8:
			// Dao dao = applicationContext.getBean("dao", Dao.class);
			dao.openConnection();
			//	dao.closeConnection();
			break;
		default:
			System.err.println("Please enter the theese values:1,2,3,4,5");
			break;
		}

		applicationContext.close();
		// main(args);

	}

}