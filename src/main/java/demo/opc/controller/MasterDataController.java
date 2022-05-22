package demo.opc.controller;

import demo.opc.model.DemoResponse;
import demo.opc.model.entity.MasterData;
import demo.opc.service.MasterDataService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
@Api(tags = "Контроллер для получения данных с сервиса")
@AllArgsConstructor
public class MasterDataController {
    private final MasterDataService masterDataService;

    @GetMapping
    public DemoResponse<MasterData> getNum()
    {
        return DemoResponse.ok(masterDataService.getNum());
    }
}
