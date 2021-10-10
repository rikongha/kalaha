package com.rikongha.kalaha.api.v1;

import com.rikongha.kalaha.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class Api {
    @Autowired
    private HttpSession session;

    @GetMapping("/")
    public String home() {
        return "Kalah Game";
    }

    @PostMapping("/player")
    public String setPlayerName(@RequestParam String username) {
        if (!username.trim().isEmpty()) {
            session.setAttribute("player", new Player(username));
        }

        return "player";
    }

    @GetMapping("/player")
    public String getPlayer() {
        return "player";
    }
}
