package co.edu.uniandes.csw.monitor.city.persistence.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(_CityEntity.class)
public abstract class _CityEntity_ { 

    public static volatile SingularAttribute<_CityEntity, Long> id;
    public static volatile SingularAttribute<_CityEntity, Long> countryId;
    public static volatile SingularAttribute<_CityEntity, String> name;
    public static volatile SingularAttribute<_CityEntity, Integer> population;

}