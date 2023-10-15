package api;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {


    public ReadExcel() {
    }

    public static int rowCount(String path, String sheet) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(path);
        XSSFSheet sheet1 = workbook.getSheet(sheet);
        int row=sheet1.getPhysicalNumberOfRows();
       
return row;
    }
    public static int  colCount(String path,String sheet,int row) throws IOException {
       XSSFWorkbook workbook= new XSSFWorkbook(path);
        XSSFSheet sheet1 = workbook.getSheet(sheet);
        int col = sheet1.getRow(row - 1).getPhysicalNumberOfCells();
        return col;
    }
    public static double  cell(String path,String sheet,int row,int col) throws IOException {
        XSSFWorkbook workbook= new XSSFWorkbook(path);
        XSSFSheet sheet1 = workbook.getSheet(sheet);
        double val = sheet1.getRow(row).getCell(col).getNumericCellValue();
        return val;
    }
}
