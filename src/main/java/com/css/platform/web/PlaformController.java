package com.css.platform.web;

import com.css.platform.entity.AyxxVO;
import com.css.platform.service.AyxxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/plaform", produces = "application/json;charset=utf-8")

@Api(value = "Plaform", tags = {"Plaform API"})
public class PlaformController {

    @Autowired
    private AyxxService service;

    @ApiOperation(value = "Plaform Index Method", notes = "")
    @GetMapping(value = {"/index"})
    public Map<String, Object> index() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<AyxxVO> ayxxList = service.getAll();

        Map<String, List<AyxxVO>> groupBy = ayxxList
                .stream()
                .collect(Collectors.groupingBy(AyxxVO::getNsrsbh));

        Map<String, AyxxVO> ayxxMap = ayxxList
                .stream()
                .collect(Collectors.toMap(AyxxVO::getAyuuid, ayxxVO -> ayxxVO));
        ayxxMap.forEach((key, value) -> System.out.println("key:value = " + key + ":" + value));
        List<AyxxVO> filter = ayxxList
                .stream()
                .filter(ayxxVO -> ayxxVO.getNsrsbh().equals("1234"))
                .collect(Collectors.toList());

        map.put("data", ayxxList);
        return map;
    }
}
