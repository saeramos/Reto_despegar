package com.fileUtils.excelUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class excelWriter {

    private String FilePath;
    private String SheetName;

    public excelWriter(String FilePath, String SheetName) {
        this.FilePath=FilePath;
        this.SheetName=SheetName;
    }

    //private static final String FILE_NAME = "C:\\Users\\juan.restrepo\\Desktop\\serenity-maven-example4\\MyFirstExcel.xlsx";

    public void create(List<String> precios) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(SheetName);

        int rowNum = 0;

        for(int j=0; j<precios.size();j++)   {
            Row row = sheet.createRow(rowNum++);
            Cell cell = row.createCell(0);
            cell.setCellValue(precios.get(rowNum-1));
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FilePath);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
