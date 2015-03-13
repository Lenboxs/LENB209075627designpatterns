package za.ac.cput.project.structural.adapter;

/**
 * Created by student on 2015/03/13.
 */
public class Pdf implements PdfReader{

    @Override
    public void readPdf(String filename)
    {
        System.out.println("Reading PDF :"+ filename);
    }
}
