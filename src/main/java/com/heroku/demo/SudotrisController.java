/**
 * Created by Kepa on 29/05/2016.
 */
package com.heroku.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
public class SudotrisController {


    private RecordRepository repository;

    @Autowired
    public SudotrisController(RecordRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(value = "/fooTest", method = RequestMethod.GET)
    public @ResponseBody String foo() {
        return "foo";
    }

    @RequestMapping(value = "/foooTest", method = RequestMethod.GET)
    public String fooo() {
        return "foo";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }
}
