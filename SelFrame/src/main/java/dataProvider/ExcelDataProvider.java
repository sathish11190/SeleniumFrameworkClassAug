package dataProvider;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider extends AbstractDataProvider {

	public static Object[][] getDataFromExcelSheet(String excelPath) throws IOException, InvalidFormatException{
		Object data[][] = null,cellValue = null;
		System.out.println("HHHHHHHHHHHHHHHHHHHHH");
		int rowCount,columnCount;
		File fs=new File(excelPath);
		@SuppressWarnings("resource")
		XSSFWorkbook wBook=new XSSFWorkbook(fs);
		XSSFSheet sheet=wBook.getSheetAt(0);
		rowCount=sheet.getLastRowNum();

		columnCount=sheet.getRow(0).getLastCellNum();
		data=new Object[rowCount][columnCount];
		System.out.println("RowCount"+rowCount);
		System.out.println("ColumnCount"+columnCount);
		for (int i=1;i<rowCount+1;i++){
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<columnCount;j++){
				@SuppressWarnings("deprecation")
				int cellType=row.getCell(j).getCellType();
				if(cellType==0){
					cellValue=""+row.getCell(j).getNumericCellValue();
				}
				else if(cellType==1){
					cellValue=row.getCell(j).getStringCellValue();
				}



				data[i-1][j]=cellValue;
				//	System.out.print(data[i][j]);
			}
			//	System.out.println();

		}
		return data;
	}
}
