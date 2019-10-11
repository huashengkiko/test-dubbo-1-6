package kiko-yuri.api.model.query;

import kiko-yuri.api.model.PageRequestDemo;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;

@Data
public class DubboDemoQuery extends PageRequestDemo implements Serializable {

    @ApiParam(value = "应用名称")
    private String name;

}
