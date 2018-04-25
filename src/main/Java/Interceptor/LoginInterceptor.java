package Interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/25 23:00.
 * @Comment
 * 拦截器
 */


public class LoginInterceptor implements HandlerInterceptor {
    private List<String> excludedUrls;

    public void setExcludeUrls(List<String> excludeUrls) {
        this.excludedUrls = excludeUrls;//设置不拦截的网页
    }

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestUri = httpServletRequest.getRequestURI();
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if(user!=null)
            return true;
        for (String url : excludedUrls) {
            if (requestUri.endsWith(url)) {
                return true;
            }
        }
        if (httpServletRequest.getHeader("x-requested-with") != null && httpServletRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
            //如果是ajax请求响应头会有，x-requested-with
            System.out.print("发生ajax请求...");
            return true;
            //response.setHeader("sessionstatus", "timeout");//在响应头设置session状态
        }

        if (user != null) {
            System.out.println("yes!!!!");
            return true;
        }
       httpServletResponse.sendRedirect("/login");
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
