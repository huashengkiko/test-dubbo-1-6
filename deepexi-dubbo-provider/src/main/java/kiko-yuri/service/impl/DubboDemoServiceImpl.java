package kiko-yuri.service.impl;

import kiko-yuri.api.model.PageDemo;
import kiko-yuri.api.model.dto.DubboDemoDTO;
import kiko-yuri.api.model.query.DubboDemoQuery;
import kiko-yuri.service.DubboDemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query) {
        Optional<String> name = Optional.ofNullable(query.getName());
        List<DubboDemoDTO> list = new ArrayList<>();
        for (int i = query.getIndex(); i < query.getIndex() + query.getLimit(); i++) {
            list.add(new DubboDemoDTO(i + "", name.orElse("dubbo") + "demo" + i));
        }
        return new PageDemo(list.size(), list);
    }

    @Override
    public DubboDemoDTO get(String id) {
        throw new RuntimeException("test hystrix");
    }

}
