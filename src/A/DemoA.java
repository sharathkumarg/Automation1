package A;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class DemoA {

	public static void main(String[] args) {
		Workbook w = WorkbookFactory.create(new File("./data/book1.xlsx"));
		String v = w.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
	

}
}
