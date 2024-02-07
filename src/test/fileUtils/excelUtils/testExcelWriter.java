package excelUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import com.fileUtils.excelUtils.*;

@RunWith(JUnit4.class)
public class testExcelWriter {

    List<String> priceList;
    excelWriter excel;

    @Before
    public void setUp() throws Exception {
        priceList = new ArrayList<>();
        priceList.add("14.15");
        priceList.add("11.11");
        priceList.add("15.16");
        priceList.add("16.17");
        excel = new excelWriter("C:\\Users\\juan.restrepo\\Desktop\\PageObjectToScreenplayJournay\\ScreenPlayDespegar\\MyFirstExcel.xlsx","ListaDePrecios");
    }

    @Test
    public void writeOnExcelFile() {
        excel.create(priceList);
    }
}
