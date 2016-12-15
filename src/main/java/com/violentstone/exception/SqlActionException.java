package com.violentstone.exception;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:sql执行操作异常类
 *********************************************************/
public class SqlActionException extends RuntimeException {

    public SqlActionException(String message) {
        super(message);
    }

    public SqlActionException(String message, Throwable cause) {
        super(message, cause);
    }

}
