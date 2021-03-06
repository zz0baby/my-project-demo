package com.study.exception;

import com.study.result.ResultEnum;
import com.study.result.ResultView;
import lombok.Data;

/**
 * 自定义运行时异常
 */
@Data
public class MyRuntimeException extends RuntimeException {

    private ResultView resultView;

    public MyRuntimeException(ResultView resultView) {
        super(resultView.getMsg());
        this.resultView = resultView;
    }

    public MyRuntimeException(String msg) {
        super(msg);
        this.resultView = ResultView.error(msg);
    }

    public MyRuntimeException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.resultView = ResultView.error(resultEnum);
    }
}
