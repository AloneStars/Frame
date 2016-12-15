package com.violentstone.enums;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:实体类相关的状态枚举类
 *********************************************************/
public enum  EntityStatusInfo {

    SERVER_INTERNAL_ERROR(-1, "服务器内部错误"),
    ;

    private int state;

    private String message;

    //设置私有的构造方法只是为了防止外部构造枚举实例
    private EntityStatusInfo(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public static EntityStatusInfo getEntityStatusInfo(int state) {
        for(EntityStatusInfo entityStatusInfo : values()) {
            if(state == entityStatusInfo.getState()) {
                return entityStatusInfo;
            }
        }
        return null;
    }

}
