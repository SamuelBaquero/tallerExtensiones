package co.edu.uniandes.csw.monitor.member.master.persistence.entity;

import co.edu.uniandes.csw.monitor.sport.persistence.entity.SportEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-13T10:27:11")
@StaticMetamodel(MembersportsEntity.class)
public class MembersportsEntity_ { 

    public static volatile SingularAttribute<MembersportsEntity, Long> sportsId;
    public static volatile SingularAttribute<MembersportsEntity, Long> memberId;
    public static volatile SingularAttribute<MembersportsEntity, SportEntity> memberIdEntity;
    public static volatile SingularAttribute<MembersportsEntity, SportEntity> sportsIdEntity;

}