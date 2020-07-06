package jar.app.base.exceptions;

import jar.app.base.constant.Code;

public class InvokeException extends BaseException {
    public InvokeException(Code code, String msg) {
        super(code, msg);
    }
}
