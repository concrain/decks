import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    private static File[] fileList;
    private static final String OUTPUT_ZIP_FILE = "//Users/russel/Desktop/BIOMETRICS-TESTING/complete/vitality/2016-05-10/summit/fileName.zip";
    private static final String SOURCE_FOLDER = "//Users/russel/Desktop/BIOMETRICS-TESTING/complete/vitality/2016-05-10/summit/";
	
    public static void main( String[] args )
    {
    	ZipFile appZip = new ZipFile();
    	//appZip.generateFileList(new File(SOURCE_FOLDER));
        fileList = appZip.getFilesFromDirectory(SOURCE_FOLDER);
    	appZip.zipIt(OUTPUT_ZIP_FILE);
    }
    
    public void zipIt(String zipFile){
        byte[] buffer = new byte[1024];
        try{
        	FileOutputStream fos = new FileOutputStream(zipFile);
        	ZipOutputStream zos = new ZipOutputStream(fos);
        	System.out.println("Output to Zip : " + zipFile);
        		
        	for(File file : this.fileList){
        		System.out.println("File Added : " + file);
        		ZipEntry ze = new ZipEntry(file);
            	zos.putNextEntry(ze);
            	FileInputStream in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
            	int len;
            	while ((len = in.read(buffer)) > 0) {
            		zos.write(buffer, 0, len);
            	}
            	in.close();
        	}
        	zos.closeEntry();
        	zos.close();
        }catch(IOException ex){
            ex.printStackTrace();   
        }
    }
    
    public File[] getFilesFromDirectory(String path) {
       System.out.println("getting files from path: "+  path);
       File directory = new File(path);
       File[] files = directory.listFiles(new FilenameFilter() {
       public boolean accept(File directory, String name) {
          return name.toLowerCase().endsWith(".csv") || name.toLowerCase().endsWith(".hl7");
       }
    });
       return files;
    }

    private String generateZipEntry(String file){
       return file.substring(SOURCE_FOLDER.length()+1, file.length());
    }
}

    /*
    public void generateFileList(File node){

    	if(node.isFile()){
    		fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
    	}
    		
    	if(node.isDirectory()){
    		String[] subNote = node.list();
    		for(String filename : subNote){
    			generateFileList(new File(node, filename));
    		}
    	}
 
    }
    */