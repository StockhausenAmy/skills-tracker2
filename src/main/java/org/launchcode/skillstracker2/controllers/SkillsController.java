package org.launchcode.skillstracker2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String skillTracker() {
        return "<html>" + "<body>" + "<h1>Skills Tracker</h1>" + "<h2>Coding languages to learn:</h2>" + "<ol>" + "<li>" +
                "Option 1" + "<li>" +
                "Option 2" + "<li>" +
                "Option 3" + "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping ("/form")
    @ResponseBody
    public String skillTrackerForm() {
        return "<html>" +
                "<body>" +
                "<form action='/results' method='POST'>" + "<label>" + "Name: " + "<br>" +
                "<input type='text' name='name'>" + "</label>" + "<br>" +
                "<label>" + "Favorite language: " + "<br>" + "<select name='firstLanguage'>" + "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" + "</label>" +
                "</label>" + "<br>" +
                "<label>" + "Second favorite language: " + "<br>" + "<select name='secondLanguage'>" + "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" + "</label>" +
                "</label>" + "<br>" +
                "<label>" + "Third favorite language: " + "<br>" + "<select name='thirdLanguage'>" + "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" + "</label>" + "<br>" + "<button>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/results")
    @ResponseBody
    public String skillsOutput(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage) {
        return "<html>" + "<body>" + "<h1>Skills Tracker</h1>" + "<h2>Coding languages to learn for" + name + ":</h2>" + "<ol>" + "<li>" +
                firstLanguage + "<li>" +
                secondLanguage + "<li>" +
                thirdLanguage + "</ol>" +
                "</body>" +
                "</html>";
    }
}
