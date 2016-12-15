package com.violentstone.dto;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:封装json的dto类
 *********************************************************/
public class JsonData {

    //返回码：这里以True 和 False,一般小型项目这种足以,而且操作简单，不需要统一规范。
    private boolean success;

    //返回码: 这里的返回码为字符串，可以自定义如：200,300等。注意两种形式选择一种就行，视情况而定
    //private String errorCode;

    private Object data;

    private String message;

    public JsonData(boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public JsonData(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * 对于boolean的返回类型的getter方法编辑器 生成的方法名是is开头的。而且如果boolean类型的变量要避免用
     * is开头的变量名命名，如 isSuccess  这样的话编译器生成的getter方法就会和变量名完全相同 isSuccess();
     * 而且在jsp页面中我们只能使用 ${JsonData.success}来取值，如果使用${JsonData.isSuccess}来取值的话
     * 会报错。或者我们用int类型的值代替boolean类型的值。因为boolean 只有true和false 完全可以用0和1代替。
     */

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

   /*public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }*/

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "success=" + success +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

}
