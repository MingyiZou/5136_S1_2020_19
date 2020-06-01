import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class readShuttle {
    ArrayList<Shuttle> ListofShuttle =new ArrayList<>();

    public ArrayList<Shuttle> shuttleinfo() throws IOException, IOException {
        File file = new File("data.xlsx");
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb =new XSSFWorkbook(fis);
        XSSFSheet sheet= wb.getSheet("shuttles");
        for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
        {
            Row row=sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++)
            {
                Shuttle shuttle =new Shuttle();
                shuttle.setS_id(Double.valueOf(row.getCell(0).toString()).intValue());

            }

        }

        return ListofShuttle;
    }
}
