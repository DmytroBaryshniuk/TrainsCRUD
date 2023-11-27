package com.example.TrainsCRUD.controler;


import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.service.TrainService;
import com.example.TrainsCRUD.service.WagonService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/train")
public class TrainController {

    @Autowired
    TrainService trainService;

    @Autowired
    WagonService wagonService;

    @Autowired
    public TrainController(TrainService trainService, WagonService wagonService) {
        this.trainService = trainService;
        this.wagonService = wagonService;
    }

    @GetMapping("/trains")
    public List<Train> getTrains(){
        return trainService.getAllTrains();
    }

    @PostMapping()
    public void createNewTrain(@RequestBody Train train){
        trainService.createNewTrain(train);
    }

    @DeleteMapping("/delete/{trainId}")
    public void deleteTrain(@PathVariable(name = "trainId") Integer trainId){
        trainService.deleteTrain(trainId);
    }
}
