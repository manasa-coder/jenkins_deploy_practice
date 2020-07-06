package jar.app.base.exceptions;

import jar.app.base.constant.Code;

public class SignException extends BaseException {
    public SignException(Code code, String msg) {
        super(code, msg);
    }
}
