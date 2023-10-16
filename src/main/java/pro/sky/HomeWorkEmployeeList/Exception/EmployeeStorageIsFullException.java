package pro.sky.HomeWorkEmployeeList.Exception;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException(String msg) {
        super(msg);
    }
}
