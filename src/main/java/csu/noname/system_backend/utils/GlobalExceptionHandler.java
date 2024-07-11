package csu.noname.system_backend.utils;

import csu.noname.system_backend.common.CommonResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public CommonResponse handleException(Exception e){
        e.printStackTrace();
        return CommonResponse.createForError(
                StringUtils.hasLength(e.getMessage()) ?
                        e.getMessage() : "exception happen"
        );
    }
}