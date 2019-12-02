package response;

public final class SvcError {

    private final int errorCode;
    private final String description;

    public SvcError(int errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }
}