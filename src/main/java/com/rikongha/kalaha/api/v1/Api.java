package com.rikongha.kalaha.api.v1;

import com.rikongha.kalaha.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String setPlayerName(@RequestParam(required = false) String username) {
        if (!username.trim().isEmpty()) {
            Player player = (Player) session.getAttribute("player");

            if (player == null) {
                session.setAttribute("player", new Player(username));
            } else {
                player.setName(username);
            }
            return "redirect:/game";
        }

        return "player";
    }

    @GetMapping("/player")
    public String getPlayer() {
        return "player";
    }

    @GetMapping("/game")
    public String getGame() {
        return "game";
    }
}
