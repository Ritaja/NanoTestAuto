
package excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author nanophotometer, Ritaja sengupta
 *
 */
public class ReaderImpl implements Reader {
	
	private String filename;
	private String filepath;
	private XSSFSheet sheet;
	private FileInputStream file;
	//truth value
	protected int found;
	/**
	 * Default Constructor
	 * @param void
	 * @return void
	 * @throws IOException 
	 */
	public ReaderImpl() throws IOException
	{
		//dummy constructor create
		this.filename = "Reader_sample.xlsx";
		this.filepath = "C:/Users/nanophotometer/Downloads/TEST-DOCS/";
		this.filename = this.filepath + this.filename;
		this.found = 0;
		initialize();
	}
	/**
	 * Initializes the workbook to read from
	 * @param void
	 * @return void
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		// TODO Initialise the workbook to read from
		this.file = new FileInputStream(new File(this.filename));
		 
        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        this.sheet = workbook.getSheetAt(0);
		
	}
	public ReaderImpl(String filename)
	{
		//dummy constructor create
	}
	public ReaderImpl(String filename,String filepath)
	{
		//dummy constructor create
	}
	/**
	 * Read data from the file
	 * @Override
	 * @param void
	 * @return truth variable of type int 
	 */
	public int readData() {
		// TODO read data from excel
		
        //Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        this.found = 0;
        while (rowIterator.hasNext()) 
        {
            Row row = rowIterator.next();
            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();
             
            while (cellIterator.hasNext()) 
            {
            	Cell cell = cellIterator.next();
            	System.out.println(cell);
            	if(cell.toString().equalsIgnoreCase("login"))
            	{
            		System.out.println("Login found Executing AutoLogin");
            		this.found = 1;
            		break;
            	}
            	
            }
        }
		return this.found;   
		
	}

	/**
	 * Loads data that has been from the file
	 * @Override
	 * @param void
	 * @return void
	 */
	public void loadData() {
		// TODO clean and prepare data to be used
		
	}
	
	/**
	 * Closes the current open file
	 * @Override
	 * @param void
	 * @return void
	 * @throws IOException 
	 */
	public void closeFile() throws IOException
	{
		this.file.close();
	}
	
	/**
   	 * Reads from the excel to understand the test Suits to be performed
   	 * @param void
   	 * @return void
   	 */
	public String readTestSuite() {
		//Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        this.found = 0;
        while (rowIterator.hasNext()) 
        {
            Row row = rowIterator.next();
            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();
             
            while (cellIterator.hasNext()) 
            {
            	Cell cell = cellIterator.next();
            	String key = cell.getStringCellValue();
            	System.out.println(key);
	        }
       }
		return filename;
	}
	
	//use setters ad getters to set the filename to read from
}
	
