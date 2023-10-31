package com.example.TrainsCRUD.controler;


import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/trains")
public class TrainController {

    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getTrains(){
        return trainService.getTrains();
    }

    @PostMapping("/")
    public void createNewTrain(@RequestBody Train train){
        trainService.createNewTrain(train);
    }
}
