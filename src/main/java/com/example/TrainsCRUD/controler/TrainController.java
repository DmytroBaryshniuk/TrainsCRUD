package com.example.TrainsCRUD.controler;


import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.service.TrainService;
import com.example.TrainsCRUD.service.WagonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/train")
public class TrainController {

    TrainService trainService;
    WagonService wagonService;

    @Autowired
    public TrainController(TrainService trainService, WagonService wagonService) {
        this.trainService = trainService;
        this.wagonService = wagonService;
    }

    @GetMapping("/{trainId}")
    public ResponseEntity<Train> getTrains(@PathVariable long trainId){
        List<Train> trains = trainService.getTrains();
        if (!trains.isEmpty()){
            return ResponseEntity.ok();
        }

    }

    @PostMapping
    public void createNewTrain(@RequestBody Train train){
        trainService.createNewTrain(train);
    }
}
