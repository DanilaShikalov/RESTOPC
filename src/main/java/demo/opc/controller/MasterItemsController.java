package demo.opc.controller;

import demo.opc.model.DemoResponse;
import demo.opc.model.entity.MasterItems;
import demo.opc.service.MasterItemsService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@Api(tags = "Контроллер для получения объектов системы")
@AllArgsConstructor
public class MasterItemsController {
    private final MasterItemsService masterItemsService;

    @GetMapping("{id}")
    public DemoResponse<MasterItems> getItem(@PathVariable Long id)
    {
        return DemoResponse.ok(masterItemsService.getItem(id));
    }

    @GetMapping
    public DemoResponse<List<MasterItems>> getAllItems()
    {
        return DemoResponse.ok(masterItemsService.getAllItems());
    }
}
