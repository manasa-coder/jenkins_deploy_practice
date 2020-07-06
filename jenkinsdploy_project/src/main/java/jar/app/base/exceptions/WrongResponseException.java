package jar.app.base.exceptions;

import jar.app.base.constant.Code;

public class WrongResponseException extends BaseException {
    public WrongResponseException(Code code, String msg) {
        super(code, msg);
    }
}
