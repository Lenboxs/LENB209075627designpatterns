package za.ac.cput.project.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/13.
 */
public abstract class ErrorLogger {
    public static int firstError =1;
    public static int secondError = 2;
    public static int thirdError = 3;

    protected int level;

    protected ErrorLogger errorLogger;


    public void setErrorLogger(ErrorLogger errorLogger) {
        this.errorLogger = errorLogger;
    }

    public void logErrMassage(int level, String message)
    {
        if(this.level <= level)
        {
            write(message);
        }
        if(errorLogger != null)
        {
            errorLogger.logErrMassage(level,message);
        }
    }
    abstract protected void write(String message);
}
