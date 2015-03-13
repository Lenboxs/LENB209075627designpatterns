package za.ac.cput.project.structural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public abstract class FormDecorator implements Form{
    protected Form decoratedForm;

    public FormDecorator(Form decoratedForm)
    {
        this.decoratedForm = decoratedForm;
    }

    public void design(){
        decoratedForm.design();
    }
}
