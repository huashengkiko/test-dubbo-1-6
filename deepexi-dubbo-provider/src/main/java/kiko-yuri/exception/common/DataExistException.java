package kiko-yuri.exception.common;

import kiko-yuri.constant.BizCode;
import kiko-yuri.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_EXIST_ERROR)
public class DataExistException extends RuntimeException {

    public DataExistException(String message) {
        super(message);
    }

}
