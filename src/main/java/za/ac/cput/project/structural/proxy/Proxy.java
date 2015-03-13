package za.ac.cput.project.structural.proxy;

/**
 * Created by student on 2015/03/13.
 */
public class Proxy implements Picture {

    private FirstPicture fp;
    private String picName;

    public Proxy(String picName) {
        this.picName = picName;
    }

    @Override
    public void print()
    {
        if(fp == null)
        {
            fp = new FirstPicture(picName);
        }
        fp.print();
    }

}
