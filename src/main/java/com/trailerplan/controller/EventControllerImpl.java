package com.trailerplan.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trailerplan.model.StatusDTO;

@RestController
@RequestMapping(value = "/api/event")
@Data
@Slf4j
public class EventControllerImpl {

    @GetMapping(path = {"/status"}, produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseBody
    public ResponseEntity<StatusDTO> status() {

        log.debug("Get status from EventControllerImpl");
        log.info("Get status from EventControllerImpl");
        log.warn("Get status from EventControllerImpl");
        log.error("Get status from EventControllerImpl");

        return ResponseEntity.ok().body(new StatusDTO("App event-api running"));
    }

}
