package com.rikongha.kalaha.config.interceptor;

import com.rikongha.kalaha.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class PlayerInterceptor implements HandlerInterceptor {

    @Autowired
    private HttpSession session;

    private Long playerNumberGenerator = 0L;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (session.getAttribute("player") == null) {
            session.setAttribute("player", new Player("Player" + playerNumberGenerator++));
        }

        return true;
    }
}
