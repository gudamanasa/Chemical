package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReUsableCode {

	public static int getRowCount(String path,String sheetname) throws Throwable {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int rc = wb.getSheet(sheetname).getLastRowNum();
		return rc;
		}
	
	public static String getCellData(String path,String sheetname,int rownum,int collnum) throws Throwable {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String cellvalue = wb.getSheet(sheetname).getRow(rownum).getCell(collnum).toString();
		return cellvalue;
	}
	
	public static Object[][] ChemicalMemberLoginData(String path,String sheetname) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int totalrows = sh.getLastRowNum();
		int totalcols = sh.getRow(1).getLastCellNum();
		System.out.println(totalrows+" "+totalcols);
		
		Object[][] data=new Object[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				data[i-1][j]=ReUsableCode.getCellData(path, sheetname, i, j);
			}
		}
		return data;
	}
	
	public static Object[][] chemicalMemberUpdate(String path,String sheetname) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int totalrows = sh.getLastRowNum();
		int totalcols = sh.getRow(1).getLastCellNum();
		System.out.println(totalrows+" "+totalcols);
		
		Object[][] data=new Object[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				data[i-1][j]=ReUsableCode.getCellData(path, sheetname, i, j);
			}
		}
		return data;
	}
	
	public static Object[][] chemicalDashboardSearch(String path,String sheetname) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int totalrows = sh.getLastRowNum();
		int totalcols = sh.getRow(1).getLastCellNum();
		System.out.println(totalrows+" "+totalcols);
		
		Object[][] data=new Object[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				data[i-1][j]=ReUsableCode.getCellData(path, sheetname, i, j);
			}
		}
		return data;
	}

	public static Object[][] chemicalHomeSearch(String path,String sheetname) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int totalrows = sh.getLastRowNum();
		int totalcols = sh.getRow(1).getLastCellNum();
		System.out.println(totalrows+" "+totalcols);
		
		Object[][] data=new Object[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++) {
			for(int j=0;j<totalcols;j++) {
				data[i-1][j]=ReUsableCode.getCellData(path, sheetname, i, j);
			}
		}
		return data;
	}

	
	
}
