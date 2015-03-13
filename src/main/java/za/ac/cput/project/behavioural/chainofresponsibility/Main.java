package za.ac.cput.project.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/13.
 */
public class Main {

    private static ErrorLogger getChainOfLoggers()
    {
        ErrorLogger firstError = new FirstError(ErrorLogger.firstError);
        ErrorLogger secondError = new SecondError(ErrorLogger.secondError);
        ErrorLogger thirdError = new ThirdError(ErrorLogger.thirdError);

        firstError.setErrorLogger(secondError);
        secondError.setErrorLogger(thirdError);

        return firstError;
    }

    public static void main(String [] args)
    {
        ErrorLogger el = getChainOfLoggers();

        el.logErrMassage(ErrorLogger.firstError," 1ste error");
        el.logErrMassage(ErrorLogger.secondError," 2de error");
        el.logErrMassage(ErrorLogger.thirdError," 3de error");
    }
}
