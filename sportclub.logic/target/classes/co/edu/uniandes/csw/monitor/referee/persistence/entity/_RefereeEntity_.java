package co.edu.uniandes.csw.monitor.referee.persistence.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(_RefereeEntity.class)
public abstract class _RefereeEntity_ { 

    public static volatile SingularAttribute<_RefereeEntity, Long> id;
    public static volatile SingularAttribute<_RefereeEntity, String> lastName;
    public static volatile SingularAttribute<_RefereeEntity, Integer> ageOfExpirience;
    public static volatile SingularAttribute<_RefereeEntity, String> name;
    public static volatile SingularAttribute<_RefereeEntity, Boolean> enable;
    public static volatile SingularAttribute<_RefereeEntity, Date> birthDate;
    public static volatile SingularAttribute<_RefereeEntity, String> firstName;
    public static volatile SingularAttribute<_RefereeEntity, String> docNumber;

}