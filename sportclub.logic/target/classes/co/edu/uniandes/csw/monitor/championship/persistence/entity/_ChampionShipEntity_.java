package co.edu.uniandes.csw.monitor.championship.persistence.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(_ChampionShipEntity.class)
public abstract class _ChampionShipEntity_ { 

    public static volatile SingularAttribute<_ChampionShipEntity, Long> id;
    public static volatile SingularAttribute<_ChampionShipEntity, Date> startDate;
    public static volatile SingularAttribute<_ChampionShipEntity, String> name;
    public static volatile SingularAttribute<_ChampionShipEntity, Date> endDate;

}