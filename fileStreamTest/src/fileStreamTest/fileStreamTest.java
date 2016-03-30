package fileStreamTest;
import java.io.*;

public class fileStreamTest {
	public static void main( String[] args ) throws IOException {
		File f = new File( "afile.txt" );
		FileOutputStream 	fopsF = new FileOutputStream( f );
		OutputStreamWriter writer = new OutputStreamWriter( fopsF, "UTF-8" );
		writer.append( "中文输入" );
		writer.append( "\r\n" );
		writer.append( "English" );
		writer.close();
		fopsF.close();
		FileInputStream fisF = new FileInputStream( f );
		InputStreamReader reader = 
				new InputStreamReader( fisF, "UTF-8" );
		StringBuffer sBuffer = new StringBuffer();
		while( reader.ready() ) {
			sBuffer.append( (char) reader.read( ) );
		}
		System.out.println( sBuffer.toString() );
		reader.close();
		fisF.close();
		
		String dirname = "/tmp/user/java/bin/something/other";
		File dFile = new File( dirname );
		dFile.mkdirs(); 
	}
}
