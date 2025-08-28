//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Email");

        BaseLogger[] baseLoggers={new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
        for(BaseLogger baseLogger:baseLoggers){
            baseLogger.log("hello world!");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}