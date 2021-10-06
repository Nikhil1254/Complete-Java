package com.project.webproject.controller;

import com.project.webproject.Alien;
import com.project.webproject.dao.AlienRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    // actions------------------------------------------
    @RequestMapping("addAlien") // to add record to database
    public String addAlien(Alien alien) {
        repo.save(alien);
        return "index";
    }

    @RequestMapping("getRecords")
    public ModelAndView viewAlien(int aid) {
        ModelAndView mv = new ModelAndView();
        String obj = "";
        if (repo.existsById(aid)) {
            Alien alien = repo.findById(aid).orElse(null);
            obj = "Id:" + alien.getAid() + "\nName:" + alien.getAname() + "\nTech:" + alien.getTech();
        } else
            obj = "No records found!";

        mv.addObject("obj", obj);
        mv.setViewName("ShowViewPage");
        return mv;
    }

    @RequestMapping("deleteRecord")
    public String deleteRecord(int aid) {
        repo.deleteById(aid);
        return "index";
    }

    // pages---------------------------------------
    @RequestMapping("index") // get indexPage
    public ModelAndView indexPage() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping("InsertAlienPage")
    public ModelAndView insertPage() {
        ModelAndView mv = new ModelAndView("InsertAlienPage");
        return mv;
    }

    @RequestMapping("ViewAlienPage")
    public ModelAndView viewPage() {
        ModelAndView mv = new ModelAndView("ViewAlienPage");
        return mv;
    }

    @RequestMapping("DeleteAlienPage")
    public ModelAndView deletePage() {
        ModelAndView mv = new ModelAndView("DeleteAlienPage");
        return mv;
    }

    @RequestMapping("UpdateAlienPage")
    public ModelAndView updatePage() {
        ModelAndView mv = new ModelAndView("UpdateAlienPage");
        return mv;
    }

}
