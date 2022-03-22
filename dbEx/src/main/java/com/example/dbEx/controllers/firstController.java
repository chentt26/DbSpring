package com.example.dbEx.controllers;

import com.example.dbEx.Holiday;
import com.example.dbEx.dao.HolidayDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class firstController {
    HolidayDao dao=new HolidayDao();
    @PostMapping("/add")
    public void add(@RequestBody Holiday holiday){
        dao.addHoliday(holiday);
    }
    @GetMapping("/getOne{id}")
    public Holiday get(@PathVariable int id){
        return dao.get(id);
    }
    @GetMapping("/getAll")
    public List<Holiday> getAll(){
        return dao.getAll();
    }
    @PutMapping("/update")
    public void update(@RequestBody Holiday holiday){
        dao.updateHoliday(holiday);
    }
    @DeleteMapping("/remove{id}")
    public void remove(@PathVariable int id){
        dao.removeHoliday(id);
    }

    public firstController() {
    }
}
