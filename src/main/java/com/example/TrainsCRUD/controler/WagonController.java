package com.example.TrainsCRUD.controler;


import com.example.TrainsCRUD.entity.Wagon;
import com.example.TrainsCRUD.service.TrainService;
import com.example.TrainsCRUD.service.WagonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/train/{}wagon")
public class WagonController {

    WagonService wagonService;
    TrainService trainService;

    @Autowired
    public WagonController(TrainService trainService, WagonService wagonService){
        this.trainService = trainService;
        this.wagonService = wagonService;
    }

    @GetMapping("/wagons")
    public List<Wagon> getWagonsForTrainById(Integer trainId){
        return wagonService.getWagonsForTrainById(trainId);
    }
}
