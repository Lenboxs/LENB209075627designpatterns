package za.ac.cput.project.structural.adapter;

/**
 * Created by student on 2015/03/13.
 */
public class Adapter implements DocReader{

    PdfReader pr;

    public Adapter(String filetype)
    {
        if(filetype.equalsIgnoreCase("pdf"))
            pr = new Pdf();
    }
    @Override
    public void readDoc(String filetype, String filename)
    {
        if(filetype.equalsIgnoreCase("pdf"))
            pr.readPdf(filename);
    }
}
