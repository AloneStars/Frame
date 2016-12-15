package com.violentstone.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:简单的拦截器类
 *********************************************************/
public class SimpleInterceptor implements HandlerInterceptor{

    @Override
	/*
	 * 拦截一个处理程序的执行。 在HandlerMapping确定一个合适的处理程序对象后被唤醒,
	 * 但在HandlerAdapter调用处理程序之前，也就是在调用我们的控制器方法之前。
	 *
	 * 返回false  请求将被终止
	 * 返回true   请求继续执行。
	 */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // TODO 自动生成的方法存根

        return false;
    }

    @Override
	/*
	 * 这个方法会在执行了拦截目标对象之后，在返回view之前执行，也就是说我们可以通过这个方法
	 * 来改变ModelAndView里面的一些东西
	 */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // TODO 自动生成的方法存根

    }

    @Override
	/*
	 * 这个方法是在视图显示之后所进行的操作，比如像一些资源的释放什么的。
	 */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO 自动生成的方法存根

    }

}
