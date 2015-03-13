package za.ac.cput.project.structural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public class BorderDecorator extends FormDecorator{

    public BorderDecorator(Form decoratedForm)
        {
            super(decoratedForm);
        }

    @Override
    public void design() {
        decoratedForm.design();
        setBorder(decoratedForm);
    }

    private void setBorder(Form decoratedForm){
        System.out.println("Border : doted line");
    }

}
