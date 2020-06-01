
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
                shuttle.setS_name(row.getCell(1).getStringCellValue());
                shuttle.setS_manufact_year(Double.valueOf(row.getCell(2).toString()).intValue());
                shuttle.setS_fuel_capacity(Double.valueOf(row.getCell(3).toString()).intValue());
                shuttle.setS_passenger_capacity(Double.valueOf(row.getCell(4).toString()).intValue());
                shuttle.setS_cargo_capacity(Double.valueOf(row.getCell(5).toString()).intValue());
                shuttle.setS_travel_speed(Double.valueOf(row.getCell(6).toString()).intValue());
                shuttle.setS_origin(row.getCell(7).getStringCellValue());
                ListofShuttle.add(shuttle);
            }

        }

        return ListofShuttle;
    }
}
