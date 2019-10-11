package kiko-yuri.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import kiko-yuri.api.DubboDemoRemoteServiceApi;
import kiko-yuri.api.model.PageDemo;
import kiko-yuri.api.model.dto.DubboDemoDTO;
import kiko-yuri.api.model.query.DubboDemoQuery;
import kiko-yuri.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0")
public class DubboDemoRemoteServiceApiImpl implements DubboDemoRemoteServiceApi {

    @Autowired
    DubboDemoService service;

    @Override
    public PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query) {
        return service.listPage(query);
    }

    @Override
    public DubboDemoDTO get(String id) {
        return service.get(id);
    }

}
