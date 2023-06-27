package com.tm.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    static Map<Integer, String> key = new HashMap();
    static Map<Integer, String> values = new HashMap();
    static Map<String, String> dataComb = new HashMap();
    static FileInputStream file;

    public static void readTestData(String testcaseID) {
        try {
            file = new FileInputStream(System.getProperty("user.dir") + "//TestData//ExcelData.xlsx");
            Workbook wb = WorkbookFactory.create(file);
            Sheet sheet = wb.getSheet("Sheet1");
            for (Row row : sheet) {
                Cell firstCell = row.getCell(row.getFirstCellNum());
                String firstCellValue = firstCell.getStringCellValue();
                if (firstCellValue.equals("TestcaseID")) {
                    for (Cell cell : row) {
                        key.put(cell.getColumnIndex(), cell.getStringCellValue());
                    }
                } else if (firstCellValue.equals(testcaseID)) {
                    for (Cell cell : row) {
                        values.put(cell.getColumnIndex(), cell.getStringCellValue());
                    }
                }
            }
            for (Integer index : values.keySet()) {
                if (values.get(index)!="") {
                    dataComb.put(key.get(index), values.get(index));
                }
            }
            System.out.println(dataComb);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getData(String key){
        return dataComb.get(key);
    }
}
