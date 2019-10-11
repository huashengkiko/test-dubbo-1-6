package kiko-yuri.exception.common;

import kiko-yuri.constant.BizCode;
import kiko-yuri.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }

}
