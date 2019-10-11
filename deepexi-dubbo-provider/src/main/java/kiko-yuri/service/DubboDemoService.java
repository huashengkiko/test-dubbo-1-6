package kiko-yuri.service;

import kiko-yuri.api.model.PageDemo;
import kiko-yuri.api.model.dto.DubboDemoDTO;
import kiko-yuri.api.model.query.DubboDemoQuery;

public interface DubboDemoService {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
