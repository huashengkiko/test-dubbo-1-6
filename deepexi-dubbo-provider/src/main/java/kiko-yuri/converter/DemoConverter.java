package kiko-yuri.converter;

import kiko-yuri.model.dto.DemoDTO;
import kiko-yuri.model.vo.DemoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DemoConverter {

    DemoVO dto2vo(DemoDTO dto);

}
