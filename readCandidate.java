
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class readCandidate {
    ArrayList<Candidate> ListofCandidate =new ArrayList<>();

    public ArrayList<Candidate> candidateinfo() throws IOException, IOException {
        File file = new File("data.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet= wb.getSheet("candidates");
        for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
        {
            Row row=sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++)
            {
                Candidate candidate =new Candidate();
                candidate.setCan_ID(Double.valueOf(row.getCell(0).toString()).intValue());
                candidate.setCan_name(row.getCell(1).getStringCellValue());
                candidate.setCan_DOB(row.getCell(2));
//                candidate.setCan_address(row.getCell(3).toString(),row.getCell(4).toString(),
//                        row.getCell(5).toString());
                candidate.setCan_nationality(row.getCell(6).toString());
                candidate.setCan_gender(row.getCell(9).toString());
                candidate.setCan_work_experience(row.getCell(13).toString()).intValue();
//                candidate.setCan_healthRecord();
                ListofCandidate.add(candidate);
            }

        }

        return ListofCandidate;
    }
}
