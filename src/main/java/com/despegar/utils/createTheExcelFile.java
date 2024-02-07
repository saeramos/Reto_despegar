package com.despegar.utils;

import com.fileUtils.excelUtils.excelWriter;

import java.util.List;

public class createTheExcelFile {

    List<String> priceList;
    excelWriter excel;

    public createTheExcelFile(List<String> ListaDePrecios) {
        this.priceList = ListaDePrecios;
        this.priceList.add(0,"Precios");
        excel = new excelWriter("C:\\Users\\juan.restrepo\\Desktop\\PageObjectToScreenplayJournay\\ScreenPlayDespegar\\MyFirstExcel.xlsx","ListaDePrecios");
        excel.create(this.priceList);
    }

    public static createTheExcelFile of(List<String> ListaDePrecios) {
        return new createTheExcelFile(ListaDePrecios);
    }


}
