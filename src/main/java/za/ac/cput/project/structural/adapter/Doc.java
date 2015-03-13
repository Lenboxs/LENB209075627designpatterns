package za.ac.cput.project.structural.adapter;

/**
 * Created by student on 2015/03/13.
 */
public class Doc implements DocReader {
    Adapter a;
    @Override
    public void readDoc(String filetype, String filename)
    {
        if(filetype.equalsIgnoreCase("doc")) {
            System.out.println("Reading Document :" + filename);
        }
        else if(filetype.equalsIgnoreCase("pdf")){
            a = new Adapter(filetype);
            a.readDoc(filetype,filename);
        }
    }
}
