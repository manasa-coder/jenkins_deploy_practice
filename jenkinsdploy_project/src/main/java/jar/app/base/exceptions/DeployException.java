package jar.app.base.exceptions;

import jar.app.base.constant.Code;

public class DeployException extends BaseException {
    public DeployException(Code code, String msg) {
        super(code, msg);
    }
}
