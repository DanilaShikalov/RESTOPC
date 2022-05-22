package demo.opc.dao;

import demo.opc.model.entity.MasterData;
import demo.opc.model.entity.MasterDataID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterDataRepository extends JpaRepository<MasterData, MasterDataID> {
}
