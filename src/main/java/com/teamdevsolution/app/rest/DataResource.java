package com.teamdevsolution.app.rest;

import com.teamdevsolution.app.domain.Data;
import com.teamdevsolution.app.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataResource {

    private final DataService dataService;

    public DataResource(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/datas")
    public List<Data> getDatas(){
        return dataService.getAllDatas();
    }

    @PostMapping("/datas")
    public Data saveData(Data data){
        return dataService.saveData(data);
    }
}
