package merchants.security;

import merchants.constant.Constants;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        var token = request.getHeader(Constants.TOKEN_NAME);
        if (StringUtils.isEmpty(token)) {
            throw new Exception(String.format("Header doesn't have %s.", Constants.TOKEN_NAME));
        }
        if (!token.equals(Constants.TOKEN)) {
            throw new Exception(String.format("Header %s is incorrect", Constants.TOKEN_NAME));
        }
        AccessContext.setToken(token);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AccessContext.clear();
    }
}
