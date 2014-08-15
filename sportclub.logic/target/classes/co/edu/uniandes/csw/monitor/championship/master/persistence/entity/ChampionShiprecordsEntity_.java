package co.edu.uniandes.csw.monitor.championship.master.persistence.entity;

import co.edu.uniandes.csw.monitor.record.persistence.entity.RecordEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(ChampionShiprecordsEntity.class)
public class ChampionShiprecordsEntity_ { 

    public static volatile SingularAttribute<ChampionShiprecordsEntity, Long> championShipId;
    public static volatile SingularAttribute<ChampionShiprecordsEntity, Long> recordsId;
    public static volatile SingularAttribute<ChampionShiprecordsEntity, RecordEntity> recordsIdEntity;
    public static volatile SingularAttribute<ChampionShiprecordsEntity, RecordEntity> championShipIdEntity;

}