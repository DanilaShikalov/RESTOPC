package demo.opc.service;

import demo.opc.dao.MasterItemsRepository;
import demo.opc.exception.MasterItemNotFound;
import demo.opc.model.entity.MasterItems;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MasterItemsService {
    private final MasterItemsRepository masterItemsRepository;

    public MasterItems getItem(Long id)
    {
        MasterItems masterItems = masterItemsRepository.findById(id).orElseThrow(() -> new MasterItemNotFound(id));
        return masterItems;
    }

    public List<MasterItems> getAllItems()
    {
        return masterItemsRepository.findAll();
    }
}
