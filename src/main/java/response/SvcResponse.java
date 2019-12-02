package response;

public class SvcResponse {

    private final SvcResponseStatus status;
    private final Object data;
    private final SvcError error;

    public SvcResponse(SvcResponseStatus status, Object data) {
        this(status, data, null);
    }

    public SvcResponse(SvcResponseStatus status, Object data, SvcError error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public SvcResponseStatus getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public SvcError getError() {
        return error;
    }
}
