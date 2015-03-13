package za.ac.cput.project.structural.proxy;

/**
 * Created by student on 2015/03/13.
 */
public class FirstPicture implements Picture{

    private String picName;

    public FirstPicture(String picName) {
        this.picName = picName;
        copy(picName);
    }

    @Override
    public void print()
    {
        System.out.println("printing "+ picName);
    }

    private void copy(String picName)
    {
        System.out.println("copying "+ picName);
    }
}
