package kiko-yuri.exception.common;

import kiko-yuri.constant.BizCode;
import kiko-yuri.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_REPETITION_ERROR)
public class DataRepetitionException extends RuntimeException {

    public DataRepetitionException(String message) {
        super(message);
    }

}
