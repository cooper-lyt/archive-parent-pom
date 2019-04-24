package cc.coopersoft.archives.business.controllers;

import cc.coopersoft.archives.business.model.Business;
import cc.coopersoft.archives.business.services.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "v1")
public class BusinessController {

    private static final Logger logger = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    private BusinessService businessService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createBusiness(@RequestBody Business business){
        logger.debug("------------ PUT NEW BUSINESS -------------------");

        Business result = businessService.saveBusiness(business);

        if (result == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "entity error！"
            );
        }

        return "{\"id\":\"" + result.getId() + "\"}";
    }

    @RequestMapping(value = "/business/{id}", method = RequestMethod.GET)
    public Business getBusiness(@PathVariable("id") String id){
        Business business = businessService.getBusiness(id);
        if (business == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"business not found! ");
        }
        return business;
    }

    @RequestMapping(value = "/status",method = RequestMethod.GET)
    public String status(){
        logger.debug("---------log debug");
        logger.info("--- log info");
        logger.warn("---log warn");
        logger.error("---log error");

        return "server is running";
    }
}
