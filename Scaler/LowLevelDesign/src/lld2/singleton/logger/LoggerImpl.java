package src.lld2.singleton.logger;

import org.springframework.boot.logging.LogLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {

    private static LoggerImpl lg =null;
    private PrintWriter pw;
    private FileWriter fileWriter;
    private String fw;
    private boolean isClosed = false;

    private LoggerImpl() {}
    @Override
    public void log(LogLevel level, String message) {
        if (isClosed) {
            throw new IllegalStateException("Logger is closed");
        }
        if(pw == null) {
            throw new IllegalStateException("Logger is not initialized in setLogFile()");
        }
        String logMessage = "DateTime: " + LocalDateTime.now() + "LogLevel: " + level + "message: " + message;
        pw.println(logMessage);
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            // Set the file path
            this.fw = filePath;
            // Create a PrintWriter to write to the specified file, appending if file exists
            pw = new PrintWriter(new FileWriter(this.fw, true));
        } catch(IOException e) {
            // Handle IOException
            e.printStackTrace();
        }
    }

    @Override
    public String getLogFile() {
        return fw;
    }

    @Override
    public void flush() {
        if(pw!=null)
        {
            pw.flush();
        }

    }

    @Override
    public void close() {
        if(pw!=null)
        {
            pw.close();
            isClosed=true;
        }

    }
    public static LoggerImpl getInstance(){

        if(lg==null)
        {
            synchronized(LoggerImpl.class) {
                lg= new LoggerImpl();
                return lg;
            }
        }
        return lg;
    }

    public static void resetInstance(){
        lg=null;
    }
}