package kiko-yuri.exception.common;

import kiko-yuri.constant.BizCode;
import kiko-yuri.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.UNABLE_OPERATE_ERROR)
public class UnableOperateException extends RuntimeException {

    public UnableOperateException(String message) {
        super(message);
    }

}
