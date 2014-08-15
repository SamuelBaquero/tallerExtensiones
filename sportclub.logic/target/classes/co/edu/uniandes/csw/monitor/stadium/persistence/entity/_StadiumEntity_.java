package co.edu.uniandes.csw.monitor.stadium.persistence.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(_StadiumEntity.class)
public abstract class _StadiumEntity_ { 

    public static volatile SingularAttribute<_StadiumEntity, Long> id;
    public static volatile SingularAttribute<_StadiumEntity, Long> cityId;
    public static volatile SingularAttribute<_StadiumEntity, String> name;
    public static volatile SingularAttribute<_StadiumEntity, Integer> capacity;

}