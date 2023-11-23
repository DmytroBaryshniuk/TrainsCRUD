package com.example.TrainsCRUD.controler;


import com.example.TrainsCRUD.dto.TrainDTO;
import com.example.TrainsCRUD.entity.Train;
import com.example.TrainsCRUD.repository.TrainRepository;
import com.example.TrainsCRUD.service.TrainService;
import com.example.TrainsCRUD.service.WagonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/trains")
    public List<Train> getTrains(){
        return trainService.getTrains();
    }

    @PostMapping
    public void createNewTrain(@RequestBody Train train){
        trainService.createNewTrain(train);
    }
}
