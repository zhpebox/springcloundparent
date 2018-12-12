package com.springcloud.test.providetwo.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class OneIntercepter implements HandlerInterceptor {

    /**
     * 在请求之前处理
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("==================");
        String s = request.getParameter("bookName");
        System.out.println(s);
        if(s.equals("zhp")){
            return false;
        }

        System.out.println("被one拦截……");

        return true;
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatherServlet渲染了对应的视图之后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

//    public void returnErrorResponse(HttpServletResponse response, String result) throws IOException, UnsupportedEncodingException {
//        OutputStream out = null;
//        try {
//            response.setCharacterEncoding("utf-8");
//            response.setContentType("text/json");
//            out = response.getOutputStream();
//            out.write(result.getBytes("utf-8"));
//            out.flush();
//        } finally {
//            if (out != null) {
//                out.close();
//            }
//        }
//    }
}
