import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataSet {

	public static void main( String[] args )
		    throws FileNotFoundException, IOException {

		        File file = new File( "D:\\testing.txt" );

		        BufferedReader br = new BufferedReader (
		            new InputStreamReader(
		                new FileInputStream( file ), "UTF-8"
		            )
		        );
		        String line = null;
		        while ((line = br.readLine()) != null) {
		            //variable line does NOT have new-line-character at the end
		            System.out.println( line );
		        }
		        br.close();
		    }
		}
