package kiko-yuri.api;

import kiko-yuri.api.model.PageDemo;
import kiko-yuri.api.model.dto.DubboDemoDTO;
import kiko-yuri.api.model.query.DubboDemoQuery;

public interface DubboDemoRemoteServiceApi {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
