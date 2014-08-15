package co.edu.uniandes.csw.monitor.championship.master.persistence.entity;

import co.edu.uniandes.csw.monitor.referee.persistence.entity.RefereeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(ChampionShiprefereesEntity.class)
public class ChampionShiprefereesEntity_ { 

    public static volatile SingularAttribute<ChampionShiprefereesEntity, Long> refereesId;
    public static volatile SingularAttribute<ChampionShiprefereesEntity, Long> championShipId;
    public static volatile SingularAttribute<ChampionShiprefereesEntity, RefereeEntity> championShipIdEntity;
    public static volatile SingularAttribute<ChampionShiprefereesEntity, RefereeEntity> refereesIdEntity;

}