package org.launchcode.Skill.Tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillController {
    @GetMapping
    @ResponseBody
    public String SkillTracker() {
        return "<html>" +
                "<h1>Skills Tracker </" +
                "<h2>Programing Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python" +
                "</ol>" +
                "</html>";
    }
    @GetMapping("form")
    @ResponseBody
    public String formDetails() {
        return "<htm>" +
                "<body>" +
                "<form action = '/form' method= 'post'>" +
                "Name: <br><input type= 'text' name= 'name' /><br>" +
                "<select name = 'favlanguage'><br>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +
                "<select name = 'favlanguage2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +
                "<select name = 'favlanguage3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +
                "<input type= 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String displayDetails(@RequestParam String name, @RequestParam String favlanguage, @RequestParam String favlanguage2, @RequestParam String favlanguage3 ) {
        return  "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favlanguage + "</li>" +
                "<li>" + favlanguage2 + "</li>" +
                "<li>" + favlanguage3 + "</li>" +
                "<ol>" +
                "</html>";
    }


}
