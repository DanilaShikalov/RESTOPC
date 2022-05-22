package demo.opc.service;

import demo.opc.dao.MasterDataRepository;
import demo.opc.dao.MasterItemsRepository;
import demo.opc.model.entity.MasterData;
import demo.opc.model.entity.MasterItems;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MasterDataService {
    private final MasterItemsRepository masterItemsRepository;

    public MasterData getNum()
    {
        List<MasterItems> masterItems = masterItemsRepository.findAll();
        MasterItems item = masterItems.stream().filter(x -> x.getName().equals("Компьютер 1.OPC Server for CoDeSys V2_0.PLC1:PLC_PRG:num")).collect(Collectors.toList()).get(0);
        //return item.getDataList().stream().max(Comparator.comparing(MasterData::getValue)).orElseThrow(NoSuchElementException::new);
        return item.getDataList().stream().max(((o1, o2) -> {
            return (int) (o1.getValue() - o2.getValue());
        })).orElseThrow(NoSuchElementException::new);
    }
}
